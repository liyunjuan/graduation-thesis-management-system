package net.dqsy.papermg.papermanager.service;

import net.dqsy.papermg.papermanager.po.PaperTitleState;
import net.dqsy.papermg.support.BaseService;

import java.io.Serializable;


public interface PaperTitleStateService<T extends Serializable> extends BaseService<T> {

    PaperTitleState findByState(int paramInt);
}