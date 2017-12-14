package net.dqsy.papermg.support;

import net.dqsy.papermg.web.util.PagingSupport;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.util.HashMap;

@NoRepositoryBean
public interface CustomRepository<T, ID extends Serializable> extends JpaRepository<T, ID>, JpaSpecificationExecutor<T> {

    /**
     * 对任意实体进行查询
     * 对象里有几个值就查几个值，是字符串就自动like查询，其余类型使用自动等于查询，没有值就查全部
     */
    Page<T> findByAuto(T example, Pageable pageable);

    /**
     * 执行查询
     * @param hql
     * @param map
     * @param numberOfPage
     * @param length
     * @return
     */
    PagingSupport queryForPage(String hql, HashMap<String, Object> map, int numberOfPage, int length);

    PagingSupport find(String hql, HashMap<String, Object> map, int numberOfPage, int countOfPage);

    PagingSupport findAll(String table, int numberOfPage, int countOfPage);

    // TODO 手动拼接参数，后期改造 Too stupid
    PagingSupport findByProperty(String table, String property, int value, int numberOfPage, int countOfPage);

    PagingSupport findByProperty(String table, String property, String value, int numberOfPage, int countOfPage);

    void merge(T obj);
}
