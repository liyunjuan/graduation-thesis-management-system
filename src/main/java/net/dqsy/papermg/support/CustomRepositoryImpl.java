package net.dqsy.papermg.support;

import net.dqsy.papermg.support.specs.CustomerSpecs;
import net.dqsy.papermg.web.util.PagingSupport;
import net.dqsy.papermg.web.util.PaperManagerException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class CustomRepositoryImpl<T, ID extends Serializable> extends SimpleJpaRepository<T, ID> implements CustomRepository<T, ID> {


    private final EntityManager entityManager;

    CustomRepositoryImpl(JpaEntityInformation entityInformation,
                         EntityManager entityManager) {
        super(entityInformation, entityManager);

        // Keep the EntityManager around to used from the newly introduced methods.
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public Page<T> findByAuto(T example, Pageable pageable) {
        return findAll(CustomerSpecs.byAuto(entityManager, example), pageable);
    }

    @Override
    @Transactional
    public PagingSupport queryForPage(String hql, HashMap<String, Object> map, int numberOfPage, int length) {
        Query query = entityManager.createQuery(hql);
        if (map != null) {
            Iterator it = map.keySet().iterator();
            String key;
            Object value;
            while (it.hasNext()) {
                key = it.next().toString();
                value = map.get(key);
                query.setParameter(key, value);
            }
        }
        int maxResults = query.getMaxResults();
        query.setFirstResult((numberOfPage - 1) * length);
        query.setMaxResults(length);
        List<T> resultList = query.getResultList();
        return new PagingSupport(resultList, numberOfPage, maxResults, length);
    }

    @Override
    @Transactional
    public PagingSupport find(String hql, HashMap<String, Object> map, int numberOfPage, int countOfPage) {
        return queryForPage(hql, map, numberOfPage, countOfPage);
    }

    @Override
    @Transactional
    public PagingSupport findByProperty(String table, String property, String value, int numberOfPage, int countOfPage)
            throws PaperManagerException {
        return queryForPage("from " + table + " where " + property + " = '" + value + "'", null, numberOfPage, countOfPage);
    }

    @Override
    @Transactional
    public void merge(T obj) {
        entityManager.merge(obj);
    }

    @Override
    @Transactional
    public PagingSupport findAll(String table, int numberOfPage, int countOfPage) throws PaperManagerException {
        return queryForPage("from " + table, null, numberOfPage, countOfPage);
    }

    @Override
    @Transactional
    public PagingSupport findByProperty(String table, String property, int value, int numberOfPage, int countOfPage)
            throws PaperManagerException {
        return queryForPage("from " + table + " where " + property + " = " + value, null, numberOfPage, countOfPage);
    }

}
