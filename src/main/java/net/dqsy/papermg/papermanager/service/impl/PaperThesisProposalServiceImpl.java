package net.dqsy.papermg.papermanager.service.impl;

import net.dqsy.papermg.papermanager.dao.PaperThesisProposalDAO;
import net.dqsy.papermg.papermanager.po.PaperThesisProposal;
import net.dqsy.papermg.papermanager.po.PaperTitle;
import net.dqsy.papermg.papermanager.service.PaperThesisProposalService;
import net.dqsy.papermg.papermanager.service.PaperTitleService;
import net.dqsy.papermg.web.util.PagingSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class PaperThesisProposalServiceImpl implements PaperThesisProposalService<PaperThesisProposal> {

    @Autowired
    private PaperTitleService paperTitleService;
    @Autowired
    private PaperThesisProposalDAO paperThesisProposalDAO;

    public boolean save(PaperThesisProposal obj) {
        try {
            this.paperThesisProposalDAO.save(obj);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean saveWithTitleId(int titleId, PaperThesisProposal paperThesisProposal) {
        try {
            PaperTitle paperTitle = (PaperTitle) this.paperTitleService.findById(titleId);
            paperThesisProposal.setPaperTitle(paperTitle);
            this.paperThesisProposalDAO.save(paperThesisProposal);
            this.paperTitleService.updateState(titleId, 7);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean update(PaperThesisProposal obj) {
        try {
            this.paperThesisProposalDAO.merge(obj);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public PagingSupport find(String hql, HashMap<String, Object> map, int numberOfPage, int countOfPage) {
        try {
            return this.paperThesisProposalDAO.find(hql, map, numberOfPage, countOfPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public PaperThesisProposal findById(int id) {
        try {
            return this.paperThesisProposalDAO.findOne(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public PagingSupport findByProperty(String property, String value, int numberOfPage, int countOfPage) {
        try {
            return this.paperThesisProposalDAO.findByProperty("PaperThesisProposal", property, value, numberOfPage, countOfPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public PagingSupport findByProperty(String property, int value, int numberOfPage, int countOfPage) {
        try {
            return this.paperThesisProposalDAO.findByProperty("PaperThesisProposal", property, value, numberOfPage, countOfPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public PagingSupport findAll(int numberOfPage, int countOfPage) {
        try {
            return this.paperThesisProposalDAO.findAll("PaperThesisProposal", numberOfPage, countOfPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean del(PaperThesisProposal obj) {
        try {
            this.paperThesisProposalDAO.delete(obj);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateWithTitleId(int titleId, PaperThesisProposal paperThesisProposal) {
        try {
            PaperThesisProposal pto =
                    (PaperThesisProposal) find(
                            "from PaperThesisProposal where paperTitle.paperTitleId= " +
                                    titleId, null, 1, 1).getList().get(0);
            pto.setThesisProposalTeacherSug(paperThesisProposal
                    .getThesisProposalTeacherSug());
            pto.setTeacherSugDate(paperThesisProposal.getTeacherSugDate());
            update(pto);
            this.paperTitleService.updateState(titleId, 8);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public List findByTitleId(int titleId) {
        try {
            return find(
                    "select new net.dqsy.papermg.papermanager.po.PaperThesisProposal(thesisProposalReportId," +
                            "thesisProposalBackground,thesisProposalResearchContent,thesisProposalResearchMethod," +
                            "thesisProposalResearchSchedule,thesisProposalReference,thesisProposalTeacherSug," +
                            "teacherSugDate) from PaperThesisProposal where paperTitle.paperTitleId = " +
                            titleId, null, 1, 999).getList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}