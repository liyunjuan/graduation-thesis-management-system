package net.dqsy.papermg.papermanager.service.impl;

import net.dqsy.papermg.papermanager.dao.PaperMidcheckDAO;
import net.dqsy.papermg.papermanager.po.PaperMidcheck;
import net.dqsy.papermg.papermanager.po.PaperTitle;
import net.dqsy.papermg.papermanager.service.PaperMidcheckService;
import net.dqsy.papermg.papermanager.service.PaperTitleService;
import net.dqsy.papermg.web.util.PagingSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class PaperMidcheckServiceImpl implements PaperMidcheckService<PaperMidcheck> {

    @Autowired
    private PaperMidcheckDAO paperMidcheckDAO;
    @Autowired
    private PaperTitleService paperTitleService;

    public boolean save(PaperMidcheck obj) {
        try {
            this.paperMidcheckDAO.save(obj);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean saveWithTitleId(int titleId, PaperMidcheck paperMidcheck) {
        try {
            PaperTitle paperTitle = (PaperTitle) this.paperTitleService
                    .findById(titleId);
            paperMidcheck.setPaperTitle(paperTitle);
            this.paperMidcheckDAO.save(paperMidcheck);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean update(PaperMidcheck obj) {
        try {
            this.paperMidcheckDAO.merge(obj);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateWithTitleId(int titleId, PaperMidcheck paperMidcheck) {
        try {
            PaperMidcheck pm =
                    (PaperMidcheck) find(
                            "from PaperMidcheck where paperTitle.paperTitleId= " +
                                    titleId, null, 1, 1).getList().get(0);
            pm.setTcomment(paperMidcheck.getTcomment());
            pm.setTcommentDate(paperMidcheck.getTcommentDate());
            update(pm);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public PagingSupport find(String hql, HashMap<String, Object> map, int numberOfPage, int countOfPage) {
        try {
            return this.paperMidcheckDAO.find(hql, map, numberOfPage, countOfPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List findByTitleId(int titleId) {
        try {
            return find(
                    "select new net.dqsy.papermg.papermanager.po.PaperMidcheck(mcId,Progress,FinishDate,ProgressDate,Tcomment,TcommentDate) from PaperMidcheck where paperTitle.paperTitleId = " +
                            titleId, null, 1, 999).getList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public PaperMidcheck findById(int id) {
        try {
            return this.paperMidcheckDAO.findOne(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public PagingSupport findByProperty(String property, String value, int numberOfPage, int countOfPage) {
        try {
            return this.paperMidcheckDAO.findByProperty("PaperMidcheck", property,
                    value, numberOfPage, countOfPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public PagingSupport findByProperty(String property, int value, int numberOfPage, int countOfPage) {
        try {
            return this.paperMidcheckDAO.findByProperty("PaperMidcheck", property,
                    value, numberOfPage, countOfPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public PagingSupport findAll(int numberOfPage, int countOfPage) {
        try {
            return this.paperMidcheckDAO.findAll("PaperMidcheck", numberOfPage,
                    countOfPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean del(PaperMidcheck obj) {
        try {
            this.paperMidcheckDAO.delete(obj);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}