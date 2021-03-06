package net.dqsy.papermg.sysmanager.service.impl;

import net.dqsy.papermg.sysmanager.dao.PaperRoleDAO;
import net.dqsy.papermg.sysmanager.po.PaperRole;
import net.dqsy.papermg.sysmanager.service.PaperRoleService;
import net.dqsy.papermg.web.util.PagingSupport;
import net.dqsy.papermg.web.util.PaperManagerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class PaperRoleServiceImpl implements PaperRoleService<PaperRole> {
    @Autowired
    private PaperRoleDAO paperRoleDAO;

    public boolean save(PaperRole obj) {
        try {
            this.paperRoleDAO.save(obj);
        } catch (PaperManagerException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean update(PaperRole obj) {
        try {
            this.paperRoleDAO.merge(obj);
        } catch (PaperManagerException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public PagingSupport find(String hql, HashMap<String, Object> map, int numberOfPage, int countOfPage) {
        try {
            return this.paperRoleDAO.find(hql, map, numberOfPage, countOfPage);
        } catch (PaperManagerException e) {
            e.printStackTrace();
        }
        return null;
    }

    public PaperRole findById(int id) {
        try {
            return this.paperRoleDAO.findOne(id);
        } catch (PaperManagerException e) {
            e.printStackTrace();
        }
        return null;
    }

    public PagingSupport findByProperty(String property, String value, int numberOfPage, int countOfPage) {
        try {
            return this.paperRoleDAO.findByProperty("PaperRole", property, value, numberOfPage, countOfPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public PagingSupport findByProperty(String property, int value, int numberOfPage, int countOfPage) {
        try {
            return this.paperRoleDAO.findByProperty("PaperRole", property, value, numberOfPage, countOfPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public PagingSupport findAll(int numberOfPage, int countOfPage) {
        try {
            return this.paperRoleDAO.findAll("PaperRole", numberOfPage, countOfPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean del(PaperRole obj) {
        try {
            this.paperRoleDAO.delete(obj);
        } catch (PaperManagerException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public PagingSupport getAllRole() {
        try {
            return this.paperRoleDAO
                    .find("select new net.dqsy.papermg.sysmanager.vo.GetAllRoleVO(roleId,roleName,description,flag) from PaperRole order by roleId ASC", null, 1, 999);
        } catch (PaperManagerException e) {
            e.printStackTrace();
        }
        return null;
    }

    public PagingSupport getAllPermission() {
        try {
            return this.paperRoleDAO.find("select new net.dqsy.papermg.sysmanager.po.PaperPermission(id,description) from PaperPermission order by id ASC",null, 1, 999);
        } catch (PaperManagerException e) {
            e.printStackTrace();
        }
        return null;
    }

}