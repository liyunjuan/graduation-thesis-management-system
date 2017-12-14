package net.dqsy.papermg.sysmanager.service;


import net.dqsy.papermg.support.BaseService;
import net.dqsy.papermg.web.util.PagingSupport;

import java.io.Serializable;

public interface PaperRolePermissionService<T extends Serializable> extends BaseService<T> {

    PagingSupport getRolePermission(int paramInt);
}