package net.dqsy.papermg.sysmanager.service;


import net.dqsy.papermg.support.BaseService;

import java.io.Serializable;

public interface PaperPermissionService<T extends Serializable> extends BaseService<T> {

    boolean delsoftOrRenew(int paramInt);
}