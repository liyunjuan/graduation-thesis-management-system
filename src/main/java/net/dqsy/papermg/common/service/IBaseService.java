package net.dqsy.papermg.common.service;

import net.dqsy.papermg.web.util.PagingSupport;

import java.util.HashMap;

public interface IBaseService<T> {

    boolean save(T object);

    boolean update(T object);

    PagingSupport find(String paramString, HashMap<String, Object> map, int paramInt1, int paramInt2);

    T findById(int id);

    PagingSupport findByProperty(String property, String value, int numberOfPage, int countOfPage);

    PagingSupport findByProperty(String property, int value, int numberOfPage, int countOfPage);

    PagingSupport findAll(int numberOfPage, int countOfPage);

    boolean del(T object);
}