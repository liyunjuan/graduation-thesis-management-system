package net.dqsy.papermg.papermanager.service;


import net.dqsy.papermg.support.BaseService;

import java.io.Serializable;
import java.util.List;

public interface PaperPlanService<T extends Serializable> extends BaseService<T> {

    List findByWritingTaskID(int paramInt);
}