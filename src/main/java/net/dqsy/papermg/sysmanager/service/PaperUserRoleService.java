package net.dqsy.papermg.sysmanager.service;

import net.dqsy.papermg.support.BaseService;
import net.dqsy.papermg.web.util.PagingSupport;

import java.io.Serializable;

public interface PaperUserRoleService<T extends Serializable> extends BaseService<T> {

    PagingSupport getUserRole(int paramInt);
}