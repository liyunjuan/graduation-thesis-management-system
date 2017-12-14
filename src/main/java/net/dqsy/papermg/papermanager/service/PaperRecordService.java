package net.dqsy.papermg.papermanager.service;

import net.dqsy.papermg.papermanager.po.PaperRecord;
import net.dqsy.papermg.support.BaseService;

import java.io.Serializable;

public interface PaperRecordService<T extends Serializable> extends BaseService<T> {

    boolean writeRecord(int paramInt, PaperRecord paramPaperRecord);
}