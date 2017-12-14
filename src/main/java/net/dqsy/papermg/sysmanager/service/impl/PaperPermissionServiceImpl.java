package net.dqsy.papermg.sysmanager.service.impl;

import net.dqsy.papermg.sysmanager.dao.PaperPermissionDAO;
import net.dqsy.papermg.sysmanager.po.PaperPermission;
import net.dqsy.papermg.sysmanager.service.PaperPermissionService;
import net.dqsy.papermg.web.util.PagingSupport;
import net.dqsy.papermg.web.util.PaperManagerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class PaperPermissionServiceImpl implements PaperPermissionService<PaperPermission> {

    @Autowired
    private PaperPermissionDAO paperPermissionDAO;

    @Override
    public boolean save(PaperPermission paperPermission) {
        try {
            this.paperPermissionDAO.save(paperPermission);
        } catch (PaperManagerException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean update(PaperPermission paperPermission) {
        try {
            this.paperPermissionDAO.merge(paperPermission);
        } catch (PaperManagerException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public PagingSupport find(String hql, HashMap<String, Object> map, int numberOfPage, int countOfPage) {
        try {
            return this.paperPermissionDAO.find(hql, map, numberOfPage, countOfPage);
        } catch (PaperManagerException e) {
            e.printStackTrace();
        }
        return null;
    }

    public PaperPermission findById(int id) {
        try {
            return this.paperPermissionDAO.findOne(id);
        } catch (PaperManagerException e) {
            e.printStackTrace();
        }
        return null;
    }

    public PagingSupport findByProperty(String property, String value, int numberOfPage, int countOfPage) {
        try {
            return this.paperPermissionDAO.findByProperty("PaperPermission", property, value, numberOfPage, countOfPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public PagingSupport findByProperty(String property, int value, int numberOfPage, int countOfPage) {
        try {
            return this.paperPermissionDAO.findByProperty("PaperPermission", property, value, numberOfPage, countOfPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public PagingSupport findAll(int numberOfPage, int countOfPage) {
        try {
            return this.paperPermissionDAO.findAll("PaperPermission", numberOfPage, countOfPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean del(PaperPermission paperPermission) {
        try {
            this.paperPermissionDAO.delete(paperPermission);
        } catch (PaperManagerException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public void setPaperPermissionDAO(PaperPermissionDAO paperPermissionDAO) {
        this.paperPermissionDAO = paperPermissionDAO;
    }

    public boolean delsoftOrRenew(int pid) {
        try {
            PaperPermission permission = findById(pid);
            if (permission.getFlag().intValue() == 0){
                permission.setFlag(Integer.valueOf(1));
            }else if (permission.getFlag().intValue() == 1) {
                permission.setFlag(Integer.valueOf(0));
            }
            this.paperPermissionDAO.merge(permission);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}