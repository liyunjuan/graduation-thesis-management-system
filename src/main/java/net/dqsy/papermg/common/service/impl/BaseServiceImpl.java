//package net.dqsy.papermg.common.service.impl;
//
//import net.dqsy.papermg.common.IBaseDAO;
//import net.dqsy.papermg.common.service.IBaseService;
//import net.dqsy.papermg.web.util.PagingSupport;
//import org.springframework.stereotype.Service;
//
//import java.util.HashMap;
//
//// TODO 这个类还没有用上呢
//@Service
//public class BaseServiceImpl<T> implements IBaseService<T> {
//
//    private IBaseDAO baseDAO;
//
//
//    @Override
//    public boolean save(T object) {
//        try {
//            baseDAO.save(object);
//        } catch (Exception e) {
//            e.printStackTrace();
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public boolean update(T object) {
//
//        return false;
//    }
//
//    @Override
//    public PagingSupport find(String paramString, HashMap<String, Object> map, int paramInt1, int paramInt2) {
//        return null;
//    }
//
//    @Override
//    public T findById(int id) {
//        return null;
//    }
//
//    @Override
//    public PagingSupport findByProperty(String property, String value, int numberOfPage, int countOfPage) {
//        return null;
//    }
//
//    @Override
//    public PagingSupport findByProperty(String property, int value, int numberOfPage, int countOfPage) {
//        return null;
//    }
//
//    @Override
//    public PagingSupport findAll(int numberOfPage, int countOfPage) {
//        return null;
//    }
//
//    @Override
//    public boolean del(T object) {
//        return false;
//    }
//}
