package net.dqsy.papermg.papermanager.service.impl;

import net.dqsy.papermg.papermanager.dao.PaperPlanDAO;
import net.dqsy.papermg.papermanager.po.PaperPlan;
import net.dqsy.papermg.papermanager.service.PaperPlanService;
import net.dqsy.papermg.web.util.PagingSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class PaperPlanServiceImpl implements PaperPlanService<PaperPlan> {

    @Autowired
    private PaperPlanDAO paperPlanDAO;


    public boolean save(PaperPlan obj) {
        try {
            this.paperPlanDAO.save(obj);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean update(PaperPlan obj) {
        try {
            this.paperPlanDAO.merge(obj);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public PagingSupport find(String hql, HashMap<String, Object> map, int numberOfPage, int countOfPage) {
        try {
            return this.paperPlanDAO.find(hql, map, numberOfPage, countOfPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public PaperPlan findById(int id) {
        try {
            return this.paperPlanDAO.findOne(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List findByWritingTaskID(int writingTaskID) {
        return this.paperPlanDAO
                .find("select new net.dqsy.papermg.papermanager.vo.PaperPlanVO(planId,planTask,planStartTime,planEndTime) from PaperPlan where paperWritingTask.writingTaskID = " +
                        writingTaskID, null, 1, 99).getList();
    }

    public PagingSupport findByProperty(String property, String value, int numberOfPage, int countOfPage) {
        try {
            return this.paperPlanDAO.findByProperty("PaperPlan", property, value, numberOfPage, countOfPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public PagingSupport findByProperty(String property, int value, int numberOfPage, int countOfPage) {
        try {
            return this.paperPlanDAO.findByProperty("PaperPlan", property, value, numberOfPage, countOfPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public PagingSupport findAll(int numberOfPage, int countOfPage) {
        try {
            return this.paperPlanDAO.findAll("PaperPlan", numberOfPage, countOfPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean del(PaperPlan obj) {
        try {
            this.paperPlanDAO.delete(obj);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}