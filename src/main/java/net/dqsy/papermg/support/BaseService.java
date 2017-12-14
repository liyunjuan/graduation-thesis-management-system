package net.dqsy.papermg.support;

import net.dqsy.papermg.web.util.PagingSupport;

import java.util.HashMap;

public interface BaseService<T> {

    boolean save(T obj);

    boolean update(T obj);

    PagingSupport find(String hql, HashMap<String, Object> map, int numberOfPage, int countOfPage);

    T findById(int paramInt);

    PagingSupport findByProperty(String property, String value, int numberOfPage, int countOfPage);

    PagingSupport findByProperty(String property, int value, int numberOfPage, int countOfPage);

    PagingSupport findAll(int numberOfPage, int countOfPage);

    boolean del(T obj);
}