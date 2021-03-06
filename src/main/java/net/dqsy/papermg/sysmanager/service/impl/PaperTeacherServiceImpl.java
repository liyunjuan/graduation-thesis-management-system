package net.dqsy.papermg.sysmanager.service.impl;

import net.dqsy.papermg.sysmanager.dao.PaperTeacherDAO;
import net.dqsy.papermg.sysmanager.po.PaperRole;
import net.dqsy.papermg.sysmanager.po.PaperTeacher;
import net.dqsy.papermg.sysmanager.po.PaperUser;
import net.dqsy.papermg.sysmanager.po.PaperUserRole;
import net.dqsy.papermg.sysmanager.service.PaperRoleService;
import net.dqsy.papermg.sysmanager.service.PaperTeacherService;
import net.dqsy.papermg.sysmanager.service.PaperUserRoleService;
import net.dqsy.papermg.sysmanager.service.PaperUserService;
import net.dqsy.papermg.sysmanager.util.POIReadExcel_teacher;
import net.dqsy.papermg.web.util.PagingSupport;
import net.dqsy.papermg.web.util.PaperManagerException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class PaperTeacherServiceImpl implements PaperTeacherService<PaperTeacher> {
    Logger logger = Logger.getLogger(getClass().getName());
    @Autowired
    private PaperTeacherDAO paperTeacherDAO;
    @Autowired
    private PaperUserService paperUserService;
    @Autowired
    private PaperRoleService paperRoleService;
    @Autowired
    private PaperUserRoleService paperUserRoleService;

    public boolean save(PaperTeacher obj) {
        try {
            this.logger.info("saving PaperTeacher instance");

            PaperTeacher paperTeacher = obj;

            PaperUser paperUser = new PaperUser(
                    paperTeacher.getTeacherNumber(),
                    paperTeacher.getTeacherNumber(), "老师", Integer.valueOf(1));

            List list = this.paperTeacherDAO.findByProperty("PaperTeacher",
                    "teacherNumber", paperTeacher.getTeacherNumber(), 1, 1)
                    .getList();

            if (list.size() > 0) {
                return false;
            }

            if (this.paperUserService.save(paperUser)) {
                paperTeacher.setPaperUser(paperUser);

                paperTeacher.setFlag(Integer.valueOf(1));

                this.paperTeacherDAO.save(paperTeacher);

                paperUser =
                        (PaperUser) this.paperUserService
                                .findByProperty("userName",
                                        paperTeacher.getTeacherNumber(), 1, 1)
                                .getList().get(0);

                PaperRole paperRole =
                        (PaperRole) this.paperRoleService
                                .findByProperty("roleName", "指导教师", 1, 1).getList()
                                .get(0);

                if ((paperRole != null) && (paperUser != null)) {
                    this.paperUserRoleService.save(
                            new PaperUserRole(paperUser,
                                    paperRole, Integer.valueOf(1)));
                }
                this.logger.info("save successful");
                return true;
            }
        } catch (PaperManagerException e) {
            this.logger.error("save failed", e);
            return false;
        }
        return false;
    }

    public String importTeacher(String path) {
        POIReadExcel_teacher pteacher = new POIReadExcel_teacher();
        List<PaperTeacher> list = null;

        int importSuccess = 0;
        int importError = 0;
        try {
            list = pteacher.readExcel(path);
            for (int i = 0; i < list.size(); i++) {
                boolean flag = save(list.get(i));
                if (!flag)
                    importError++;
                else
                    importSuccess++;
            }
            return "成功:" + importSuccess + "个,失败:" + importError + "个";
        } catch (Exception e) {
            this.logger.error("save failed", e);
            e.printStackTrace();
        }
        return "导入失败,请确认您的Excel文件填写标准是否与模板标准一致!";
    }

    public boolean update(PaperTeacher obj) {
        try {
            this.paperTeacherDAO.merge(obj);
        } catch (PaperManagerException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean updateTeacherFlag(PaperTeacher paperTeacher, int flag) {
        try {
            PaperUser paperUser =
                    (PaperUser) this.paperUserService
                            .findByProperty("userName",
                                    paperTeacher.getTeacherNumber(), 1, 1).getList()
                            .get(0);
            PaperUserRole paperUserRole = null;
            List list = this.paperUserRoleService.find(
                    "from PaperUserRole where paperUser.userId = " +
                            paperUser.getUserId(), null, 1, 999).getList();

            if ((paperTeacher == null) || (paperUser == null)) {
                throw new PaperManagerException();
            }
            paperTeacher.setFlag(Integer.valueOf(flag));
            update(paperTeacher);

            paperUser.setFlag(Integer.valueOf(flag));
            this.paperUserService.update(paperUser);

            for (int i = 0; i < list.size(); i++) {
                paperUserRole = (PaperUserRole) list.get(i);
                paperUserRole.setFlag(Integer.valueOf(flag));
                this.paperUserRoleService.update(paperUserRole);
            }
        } catch (PaperManagerException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public PagingSupport find(String hql, HashMap<String, Object> map, int numberOfPage, int countOfPage) {
        try {
            return this.paperTeacherDAO.find(hql, map, numberOfPage, countOfPage);
        } catch (PaperManagerException e) {
            e.printStackTrace();
        }
        return null;
    }

    public PaperTeacher findById(int id) {
        try {
            return this.paperTeacherDAO.findOne(id);
        } catch (PaperManagerException e) {
            e.printStackTrace();
        }
        return null;
    }

    public PaperTeacher findByNumber(String number) {
        try {
            List list = this.paperTeacherDAO.find(
                    "from PaperTeacher where teacherNumber = '" + number + "'",
                    null, 1, 1).getList();
            if (list.size() == 1)
                return (PaperTeacher) list.get(0);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }

    public PagingSupport findByProperty(String property, String value, int numberOfPage, int countOfPage) {
        try {
            return this.paperTeacherDAO.findByProperty("PaperTeacher", property,
                    value, numberOfPage, countOfPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public PagingSupport findByProperty(String property, int value, int numberOfPage, int countOfPage) {
        try {
            return this.paperTeacherDAO.findByProperty("PaperTeacher", property,
                    value, numberOfPage, countOfPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public PagingSupport findAll(int numberOfPage, int countOfPage) {
        try {
            return this.paperTeacherDAO.findAll("PaperTeacher", numberOfPage,
                    countOfPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List findTeacherName(String teacherUnits) {
        try {
            return find(
                    "select new net.dqsy.papermg.sysmanager.po.PaperTeacher(teacherId,teacherName) from PaperTeacher where teacherUnits = '" +
                            teacherUnits + "'", null, 1, 99999).getList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean del(PaperTeacher obj) {
        try {
            this.paperTeacherDAO.delete(obj);
        } catch (PaperManagerException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

}