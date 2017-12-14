package net.dqsy.papermg.papermanager.service;

import net.dqsy.papermg.papermanager.po.PaperCouncil;
import net.dqsy.papermg.support.BaseService;

import java.io.Serializable;
import java.util.List;

public interface PaperCouncilService<T extends Serializable> extends BaseService<T> {

    String apply(PaperCouncil paramPaperCouncil, List<Integer> paramList, List<String> paramList1);

    String approve(PaperCouncil paramPaperCouncil);

    List findCouncilByManId(int paramInt);
}