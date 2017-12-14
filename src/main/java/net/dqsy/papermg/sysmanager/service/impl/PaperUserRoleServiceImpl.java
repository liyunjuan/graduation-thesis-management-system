package net.dqsy.papermg.sysmanager.service.impl;

import net.dqsy.papermg.sysmanager.dao.PaperUserRoleDAO;
import net.dqsy.papermg.sysmanager.po.PaperUserRole;
import net.dqsy.papermg.sysmanager.service.PaperUserRoleService;
import net.dqsy.papermg.web.util.PagingSupport;
import net.dqsy.papermg.web.util.PaperManagerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class PaperUserRoleServiceImpl implements PaperUserRoleService<PaperUserRole> {
    @Autowired
    private PaperUserRoleDAO paperUserRoleDAO;

    public boolean save(PaperUserRole obj) {
        try {
            this.paperUserRoleDAO.save(obj);
        } catch (PaperManagerException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean update(PaperUserRole obj) {
        try {
            this.paperUserRoleDAO.merge(obj);
        } catch (PaperManagerException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public PagingSupport find(String hql, HashMap<String, Object> map, int numberOfPage, int countOfPage) {
        try {
            return this.paperUserRoleDAO.find(hql, map, numberOfPage, countOfPage);
        } catch (PaperManagerException e) {
            e.printStackTrace();
        }
        return null;
    }

    public PaperUserRole findById(int id) {
        try {
            return this.paperUserRoleDAO.findOne(id);
        } catch (PaperManagerException e) {
            e.printStackTrace();
        }
        return null;
    }

    public PagingSupport findByProperty(String property, String value, int numberOfPage, int countOfPage) {
        try {
            return this.paperUserRoleDAO.findByProperty("PaperUserRole", property, value, numberOfPage, countOfPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public PagingSupport findByProperty(String property, int value, int numberOfPage, int countOfPage) {
        try {
            return this.paperUserRoleDAO.findByProperty("PaperUserRole", property, value, numberOfPage, countOfPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public PagingSupport findAll(int numberOfPage, int countOfPage) {
        try {
            return this.paperUserRoleDAO.findAll("PaperUserRole", numberOfPage, countOfPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean del(PaperUserRole obj) {
        try {
            this.paperUserRoleDAO.delete(obj);
            return true;
        } catch (PaperManagerException e) {
            e.printStackTrace();
        }
        return false;
    }

    public PagingSupport getUserRole(int userID) {
        try {
            return this.paperUserRoleDAO.find(
                    "select paperRole.roleId from PaperUserRole where paperUser.userId = " +
                            userID, null, 1, 999);
        } catch (PaperManagerException e) {
            e.printStackTrace();
        }
        return null;
    }
}