package net.dqsy.papermg.papermanager.service;

import net.dqsy.papermg.papermanager.po.PaperPlan;
import net.dqsy.papermg.papermanager.po.PaperWritingTask;
import net.dqsy.papermg.support.BaseService;

import java.io.Serializable;
import java.util.List;

public interface PaperWritingTaskService<T extends Serializable> extends BaseService<T> {

    boolean saveWritingTask(int paramInt, PaperWritingTask paramPaperWritingTask, List<PaperPlan> paramList);

    List findByTieleId(int paramInt);
}