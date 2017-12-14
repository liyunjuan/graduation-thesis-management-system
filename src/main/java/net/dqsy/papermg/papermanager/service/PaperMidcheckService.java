package net.dqsy.papermg.papermanager.service;

import net.dqsy.papermg.papermanager.po.PaperMidcheck;
import net.dqsy.papermg.support.BaseService;

import java.io.Serializable;
import java.util.List;

public interface PaperMidcheckService<T extends Serializable> extends BaseService<T> {

    boolean saveWithTitleId(int paramInt, PaperMidcheck paramPaperMidcheck);

    boolean updateWithTitleId(int paramInt, PaperMidcheck paramPaperMidcheck);

    List findByTitleId(int paramInt);
}