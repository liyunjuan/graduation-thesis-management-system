package net.dqsy.papermg.papermanager.service.impl;

import net.dqsy.papermg.papermanager.dao.PaperRecordDAO;
import net.dqsy.papermg.papermanager.dao.PaperTitleDAO;
import net.dqsy.papermg.papermanager.po.PaperRecord;
import net.dqsy.papermg.papermanager.po.PaperTitle;
import net.dqsy.papermg.papermanager.service.PaperRecordService;
import net.dqsy.papermg.web.util.PagingSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class PaperRecordServiceImpl implements PaperRecordService<PaperRecord> {
    @Autowired
    private PaperRecordDAO paperRecordDAO;
    @Autowired
    private PaperTitleDAO paperTitleDAO;

    public boolean save(PaperRecord obj) {
        try {
            this.paperRecordDAO.save(obj);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean update(PaperRecord obj) {
        try {
            this.paperRecordDAO.merge(obj);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public PagingSupport find(String hql, HashMap<String, Object> map, int numberOfPage, int countOfPage) {
        try {
            return this.paperRecordDAO.find(hql, map, numberOfPage, countOfPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public PaperRecord findById(int id) {
        try {
            return this.paperRecordDAO.findOne(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public PagingSupport findByProperty(String property, String value, int numberOfPage, int countOfPage) {
        try {
            return this.paperRecordDAO.findByProperty("PaperRecord", property, value, numberOfPage, countOfPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public PagingSupport findByProperty(String property, int value, int numberOfPage, int countOfPage) {
        try {
            return this.paperRecordDAO.findByProperty("PaperRecord", property, value, numberOfPage, countOfPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public PagingSupport findAll(int numberOfPage, int countOfPage) {
        try {
            return this.paperRecordDAO.findAll("PaperRecord", numberOfPage, countOfPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean del(PaperRecord obj) {
        try {
            this.paperRecordDAO.delete(obj);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean writeRecord(int titleId, PaperRecord record) {
        try {
            PaperTitle title = this.paperTitleDAO.findOne(titleId);
            record.setPaperTitle(title);
            this.paperRecordDAO.save(record);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}