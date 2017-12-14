package net.dqsy.papermg.papermanager.service;

import net.dqsy.papermg.support.BaseService;
import net.dqsy.papermg.sysmanager.po.PaperStudent;
import net.dqsy.papermg.web.util.PagingSupport;

import java.util.List;

public interface PaperTitleService<T> extends BaseService<T> {

    String savePaperTitle(T paramPaperTitle);

    String saveStudentDTP(int paramInt1, int paramInt2, T paramPaperTitle);

    boolean updateState(int paramInt1, int paramInt2);

    boolean updateStateByBatch(List<Integer> paramList, int paramInt);

    boolean approvePaperTitle(T paramPaperTitle, int paramInt);

    String chooseTitle(int paramInt, PaperStudent paramPaperStudent);

    PagingSupport findByTeacherId(int paramInt1, int paramInt2, int paramInt3);

    List findTeacherName();

    PagingSupport findByTitleState(int paramInt1, int paramInt2, int paramInt3);

    List findTitleByStudentId(int paramInt1, int paramInt2);

    List findTitleByTeacherId(int paramInt1, int paramInt2);

    PagingSupport findByStudentMajor(String paramString, int paramInt1, int paramInt2);

    List findStudentInfoByTitleId(int paramInt);

    int findPaperTitState(int paramInt);

    List<String> findFaculty();

    List findMajorByFaculty(String paramString);

    List findGrade();

    PagingSupport findPageByFMG(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2);
}