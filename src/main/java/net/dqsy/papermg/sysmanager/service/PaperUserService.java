package net.dqsy.papermg.sysmanager.service;


import net.dqsy.papermg.support.BaseService;

import java.io.Serializable;
import java.util.List;

public interface PaperUserService<T extends Serializable> extends BaseService<T> {

    List login(String userName, String passWord);

    String updatePassword(String userName, String oldPassWord, String newPassWord);
}