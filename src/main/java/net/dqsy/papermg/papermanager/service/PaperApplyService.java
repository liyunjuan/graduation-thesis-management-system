package net.dqsy.papermg.papermanager.service;

import net.dqsy.papermg.papermanager.po.PaperApply;
import net.dqsy.papermg.support.BaseService;

import java.io.Serializable;
import java.util.List;

public interface PaperApplyService<T extends Serializable> extends BaseService<T> {

    boolean saveWithTitleId(int paramInt, PaperApply paramPaperApply);

    boolean updateWithTitleId(int paramInt, PaperApply paramPaperApply);

    List findByTitleId(int id);
}