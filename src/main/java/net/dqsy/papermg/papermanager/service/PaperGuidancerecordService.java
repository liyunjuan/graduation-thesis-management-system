package net.dqsy.papermg.papermanager.service;

import net.dqsy.papermg.papermanager.po.PaperGuidancerecord;
import net.dqsy.papermg.support.BaseService;

import java.io.Serializable;
import java.util.List;

public interface PaperGuidancerecordService<T extends Serializable> extends BaseService<T> {

    boolean saveWithTitleId(int paramInt, PaperGuidancerecord paramPaperGuidancerecord);

    boolean updateWithTitleId(int paramInt, PaperGuidancerecord paramPaperGuidancerecord);

    List findWithTitleId(int paramInt);
}