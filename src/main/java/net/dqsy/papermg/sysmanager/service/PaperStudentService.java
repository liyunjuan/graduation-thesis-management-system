package net.dqsy.papermg.sysmanager.service;

import net.dqsy.papermg.support.BaseService;
import net.dqsy.papermg.sysmanager.po.PaperStudent;

import java.io.Serializable;
import java.util.List;

public interface PaperStudentService<T extends Serializable> extends BaseService<T> {

    PaperStudent findByNumber(String paramString);

    List findStudentMajor(String paramString);

    boolean updateStudentFlag(PaperStudent paramPaperStudent, int paramInt);

    boolean resetStudentPassword(int paramInt);

    String importStudent(String paramString);
}