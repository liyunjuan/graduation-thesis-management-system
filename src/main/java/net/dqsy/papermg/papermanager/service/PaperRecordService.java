package net.dqsy.papermg.papermanager.service;

import net.dqsy.papermg.papermanager.po.PaperRecord;
import net.dqsy.papermg.util.BaseService;
import net.dqsy.papermg.papermanager.po.PaperRecord;

public abstract interface PaperRecordService extends BaseService
{
  public abstract boolean writeRecord(int paramInt, PaperRecord paramPaperRecord);
}