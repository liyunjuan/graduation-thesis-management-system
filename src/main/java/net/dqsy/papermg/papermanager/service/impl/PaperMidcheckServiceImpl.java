package net.dqsy.papermg.papermanager.service.impl;

import net.dqsy.papermg.papermanager.dao.PaperMidcheckDAO;
import net.dqsy.papermg.papermanager.po.PaperMidcheck;
import net.dqsy.papermg.papermanager.po.PaperTitle;
import net.dqsy.papermg.papermanager.service.PaperMidcheckService;
import net.dqsy.papermg.papermanager.service.PaperTitleService;
import net.dqsy.papermg.util.PagingSupport;
import net.dqsy.papermg.papermanager.service.PaperMidcheckService;
import net.dqsy.papermg.util.PagingSupport;

import java.util.List;

public class PaperMidcheckServiceImpl
  implements PaperMidcheckService
{
  private PaperMidcheckDAO paperMidcheckDAO;
  private PaperTitleService paperTitleService;

  public void setPaperMidcheckDAO(PaperMidcheckDAO paperMidcheckDAO)
  {
    this.paperMidcheckDAO = paperMidcheckDAO;
  }

  public boolean save(Object o)
  {
    try {
      this.paperMidcheckDAO.save((PaperMidcheck)o);
      return true;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return false;
  }

  public boolean saveWithTitleId(int titleId, PaperMidcheck paperMidcheck)
  {
    try
    {
      PaperTitle paperTitle = (PaperTitle)this.paperTitleService
        .findById(titleId);
      paperMidcheck.setPaperTitle(paperTitle);
      this.paperMidcheckDAO.save(paperMidcheck);
      return true;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return false;
  }

  public boolean update(Object o)
  {
    try {
      this.paperMidcheckDAO.update((PaperMidcheck)o);
      return true;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return false;
  }

  public boolean updateWithTitleId(int titleId, PaperMidcheck paperMidcheck)
  {
    try
    {
      PaperMidcheck pm = 
        (PaperMidcheck)find(
        "from PaperMidcheck where paperTitle.paperTitleId= " + 
        titleId, 1, 1).getList().get(0);
      pm.setTcomment(paperMidcheck.getTcomment());
      pm.setTcommentDate(paperMidcheck.getTcommentDate());
      update(pm);
      return true;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return false;
  }

  public PagingSupport find(String hql, int numberOfPage, int countOfPage)
  {
    try {
      return this.paperMidcheckDAO.find(hql, numberOfPage, countOfPage);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  public List findByTitleId(int titleId)
  {
    try
    {
      return find(
        "select new com.pactera.papermg.papermanager.po.PaperMidcheck(mcId,Progress,FinishDate,ProgressDate,Tcomment,TcommentDate) from PaperMidcheck where paperTitle.paperTitleId = " + 
        titleId, 1, 999).getList();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  public Object findById(int id)
  {
    try {
      return this.paperMidcheckDAO.findById(
        "com.pactera.papermg.papermanager.po.PaperMidcheck", id);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  public PagingSupport findByProperty(String property, String value, int numberOfPage, int countOfPage)
  {
    try
    {
      return this.paperMidcheckDAO.findByProperty("PaperMidcheck", property, 
        value, numberOfPage, countOfPage);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  public PagingSupport findByProperty(String property, int value, int numberOfPage, int countOfPage)
  {
    try
    {
      return this.paperMidcheckDAO.findByProperty("PaperMidcheck", property, 
        value, numberOfPage, countOfPage);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  public PagingSupport findAll(int numberOfPage, int countOfPage)
  {
    try {
      return this.paperMidcheckDAO.findAll("PaperMidcheck", numberOfPage, 
        countOfPage);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  public boolean del(Object o)
  {
    try {
      this.paperMidcheckDAO.delete((PaperMidcheck)o);
      return true;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return false;
  }

  public void setPaperTitleService(PaperTitleService paperTitleService) {
    this.paperTitleService = paperTitleService;
  }
}