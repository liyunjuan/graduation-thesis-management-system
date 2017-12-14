package net.dqsy.papermg.sysmanager.service;

import net.dqsy.papermg.support.BaseService;
import net.dqsy.papermg.sysmanager.po.PaperTeacher;

import java.io.Serializable;
import java.util.List;

public interface PaperTeacherService<T extends Serializable> extends BaseService<T> {

    PaperTeacher findByNumber(String paramString);

    boolean updateTeacherFlag(PaperTeacher paramPaperTeacher, int paramInt);

    String importTeacher(String paramString);

    List findTeacherName(String paramString);
}