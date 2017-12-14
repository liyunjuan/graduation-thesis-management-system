package net.dqsy.papermg.papermanager.service.impl;


import net.dqsy.papermg.papermanager.dao.PaperWritingTaskDAO;
import net.dqsy.papermg.papermanager.po.PaperPlan;
import net.dqsy.papermg.papermanager.po.PaperTitle;
import net.dqsy.papermg.papermanager.po.PaperWritingTask;
import net.dqsy.papermg.papermanager.service.PaperPlanService;
import net.dqsy.papermg.papermanager.service.PaperTitleService;
import net.dqsy.papermg.papermanager.service.PaperWritingTaskService;
import net.dqsy.papermg.web.util.PagingSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class PaperWritingTaskServiceImpl implements PaperWritingTaskService<PaperWritingTask> {

    @Autowired
    private PaperWritingTaskDAO paperWritingTaskDAO;
    @Autowired
    private PaperTitleService paperTitleService;
    @Autowired
    private PaperPlanService paperPlanService;

    public boolean save(PaperWritingTask obj) {
        try {
            this.paperWritingTaskDAO.save(obj);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean saveWritingTask(int titleId, PaperWritingTask paperWritingTask, List<PaperPlan> list) {
        try {
            PaperTitle paperTitle = (PaperTitle) this.paperTitleService
                    .findById(titleId);
            paperWritingTask.setPaperTitle(paperTitle);
            this.paperWritingTaskDAO.save(paperWritingTask);
            PaperPlan paperPlan = null;
            for (int i = 0; i < list.size(); i++) {
                paperPlan = list.get(i);
                paperPlan.setPaperWritingTask(paperWritingTask);
                this.paperPlanService.save(paperPlan);
            }
            this.paperTitleService.updateState(titleId, 6);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean update(PaperWritingTask obj) {
        try {
            this.paperWritingTaskDAO.merge(obj);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public PagingSupport find(String hql, HashMap<String, Object> map, int numberOfPage, int countOfPage) {
        try {
            return this.paperWritingTaskDAO.find(hql, map, numberOfPage, countOfPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public PaperWritingTask findById(int id) {
        try {
            return this.paperWritingTaskDAO.findOne(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List findByTieleId(int titleId) {
        return this.paperWritingTaskDAO
                .find("select new net.dqsy.papermg.papermanager.vo.WritingTaskVO(writingTaskID,writingTaskStartTime,writingTaskEndTime,writingTaskContent,writingTaskReference) from PaperWritingTask where paperTitle.paperTitleId = " +
                        titleId, null, 1, 1).getList();
    }

    public PagingSupport findByProperty(String property, String value, int numberOfPage, int countOfPage) {
        try {
            return this.paperWritingTaskDAO.findByProperty("PaperWritingTask", property, value, numberOfPage, countOfPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public PagingSupport findByProperty(String property, int value, int numberOfPage, int countOfPage) {
        try {
            return this.paperWritingTaskDAO.findByProperty("PaperWritingTask", property, value, numberOfPage, countOfPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public PagingSupport findAll(int numberOfPage, int countOfPage) {
        try {
            return this.paperWritingTaskDAO.findAll("PaperWritingTask", numberOfPage, countOfPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean del(PaperWritingTask obj) {
        try {
            this.paperWritingTaskDAO.delete(obj);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}