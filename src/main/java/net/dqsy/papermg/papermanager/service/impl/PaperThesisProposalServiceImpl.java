package net.dqsy.papermg.papermanager.service.impl;

import net.dqsy.papermg.papermanager.dao.PaperThesisProposalDAO;
import net.dqsy.papermg.papermanager.po.PaperThesisProposal;
import net.dqsy.papermg.papermanager.po.PaperTitle;
import net.dqsy.papermg.papermanager.service.PaperThesisProposalService;
import net.dqsy.papermg.papermanager.service.PaperTitleService;
import net.dqsy.papermg.util.PagingSupport;
import net.dqsy.papermg.papermanager.po.PaperThesisProposal;
import net.dqsy.papermg.papermanager.po.PaperTitle;
import net.dqsy.papermg.papermanager.service.PaperThesisProposalService;
import net.dqsy.papermg.papermanager.service.PaperTitleService;
import net.dqsy.papermg.util.PagingSupport;

import java.util.List;

public class PaperThesisProposalServiceImpl
  implements PaperThesisProposalService
{
  private PaperTitleService paperTitleService;
  private PaperThesisProposalDAO paperThesisProposalDAO;

  public boolean save(Object o)
  {
    try
    {
      this.paperThesisProposalDAO.save((PaperThesisProposal)o);
      return true;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return false;
  }

  public boolean saveWithTitleId(int titleId, PaperThesisProposal paperThesisProposal)
  {
    try
    {
      PaperTitle paperTitle = (PaperTitle)this.paperTitleService
        .findById(titleId);
      paperThesisProposal.setPaperTitle(paperTitle);
      this.paperThesisProposalDAO.save(paperThesisProposal);
      this.paperTitleService.updateState(titleId, 7);
      return true;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return false;
  }

  public boolean update(Object o)
  {
    try {
      this.paperThesisProposalDAO.update((PaperThesisProposal)o);
      return true;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return false;
  }

  public PagingSupport find(String hql, int numberOfPage, int countOfPage)
  {
    try {
      return this.paperThesisProposalDAO.find(hql, numberOfPage, countOfPage);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  public PaperThesisProposal findById(int id)
  {
    try {
      return (PaperThesisProposal)this.paperThesisProposalDAO.findById(
        "com.pactera.papermg.papermanager.po.PaperThesisProposal", 
        id);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  public PagingSupport findByProperty(String property, String value, int numberOfPage, int countOfPage)
  {
    try
    {
      return this.paperThesisProposalDAO.findByProperty("PaperThesisProposal", 
        property, value, numberOfPage, countOfPage);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  public PagingSupport findByProperty(String property, int value, int numberOfPage, int countOfPage)
  {
    try
    {
      return this.paperThesisProposalDAO.findByProperty("PaperThesisProposal", 
        property, value, numberOfPage, countOfPage);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  public PagingSupport findAll(int numberOfPage, int countOfPage)
  {
    try {
      return this.paperThesisProposalDAO.findAll("PaperThesisProposal", 
        numberOfPage, countOfPage);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  public boolean del(Object o)
  {
    try {
      this.paperThesisProposalDAO.delete((PaperThesisProposal)o);
      return true;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return false;
  }

  public PaperThesisProposalDAO getPaperThesisProposalDAO() {
    return this.paperThesisProposalDAO;
  }

  public void setPaperThesisProposalDAO(PaperThesisProposalDAO paperThesisProposalDAO)
  {
    this.paperThesisProposalDAO = paperThesisProposalDAO;
  }

  public void setPaperTitleService(PaperTitleService paperTitleService) {
    this.paperTitleService = paperTitleService;
  }

  public boolean updateWithTitleId(int titleId, PaperThesisProposal paperThesisProposal)
  {
    try
    {
      PaperThesisProposal pto = 
        (PaperThesisProposal)find(
        "from PaperThesisProposal where paperTitle.paperTitleId= " + 
        titleId, 1, 1).getList().get(0);
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

  public List findByTitleId(int titleId)
  {
    try
    {
      return find(
        "select new com.pactera.papermg.papermanager.po.PaperThesisProposal(thesisProposalReportId,thesisProposalBackground,thesisProposalResearchContent,thesisProposalResearchMethod,thesisProposalResearchSchedule,thesisProposalReference,thesisProposalTeacherSug,teacherSugDate) from PaperThesisProposal where paperTitle.paperTitleId = " + 
        titleId, 1, 999).getList();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }
}