package net.dqsy.papermg.papermanager.service;

import net.dqsy.papermg.papermanager.po.PaperScore;
import net.dqsy.papermg.support.BaseService;

import java.io.Serializable;

public interface PaperScoreService<T extends Serializable> extends BaseService<T> {

    PaperScore findScoreByTitleId(int paramInt);

    int teacherInput(int paramInt, String paramString, double paramDouble);

    int teamInput(int paramInt, String paramString, double paramDouble);

    int councilInput(int paramInt, String paramString);
}