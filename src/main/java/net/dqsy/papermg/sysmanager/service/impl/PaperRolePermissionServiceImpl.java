package net.dqsy.papermg.sysmanager.service.impl;

import net.dqsy.papermg.sysmanager.dao.PaperRolePermissionDAO;
import net.dqsy.papermg.sysmanager.po.PaperRolePermission;
import net.dqsy.papermg.sysmanager.service.PaperRolePermissionService;
import net.dqsy.papermg.web.util.PagingSupport;
import net.dqsy.papermg.web.util.PaperManagerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class PaperRolePermissionServiceImpl implements PaperRolePermissionService<PaperRolePermission> {
    @Autowired
    private PaperRolePermissionDAO paperRolePermissionDAO;

    public boolean save(PaperRolePermission obj) {
        try {
            this.paperRolePermissionDAO.save(obj);
        } catch (PaperManagerException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean update(PaperRolePermission obj) {
        try {
            this.paperRolePermissionDAO.merge(obj);
        } catch (PaperManagerException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public PagingSupport find(String hql, HashMap<String, Object> map, int numberOfPage, int countOfPage) {
        try {
            return this.paperRolePermissionDAO.find(hql, map, numberOfPage, countOfPage);
        } catch (PaperManagerException e) {
            e.printStackTrace();
        }
        return null;
    }

    public PaperRolePermission findById(int id) {
        try {
            return this.paperRolePermissionDAO.findOne(id);
        } catch (PaperManagerException e) {
            e.printStackTrace();
        }
        return null;
    }

    public PagingSupport findByProperty(String property, String value, int numberOfPage, int countOfPage) {
        try {
            return this.paperRolePermissionDAO.findByProperty("PaperRolePermission", property, value, numberOfPage, countOfPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public PagingSupport findByProperty(String property, int value, int numberOfPage, int countOfPage) {
        try {
            return this.paperRolePermissionDAO.findByProperty("PaperRolePermission", property, value, numberOfPage, countOfPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public PagingSupport findAll(int numberOfPage, int countOfPage) {
        try {
            return this.paperRolePermissionDAO.findAll("PaperRolePermission", numberOfPage, countOfPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // TODO 以后做逻辑删除
    public boolean del(PaperRolePermission obj) {
        try {
            this.paperRolePermissionDAO.delete(obj);
            return true;
        } catch (PaperManagerException e) {
            e.printStackTrace();
        }
        return false;
    }

    public PagingSupport getRolePermission(int roleID) {
        try {
            return this.paperRolePermissionDAO.find("select paperPermission.id from PaperRolePermission where paperRole.roleId = " + roleID, null, 1, 999);
        } catch (PaperManagerException e) {
            e.printStackTrace();
        }
        return null;
    }


}