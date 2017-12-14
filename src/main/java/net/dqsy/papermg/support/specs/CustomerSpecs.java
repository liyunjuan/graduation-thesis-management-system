package net.dqsy.papermg.support.specs;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.ReflectionUtils;
import org.springframework.util.StringUtils;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.Attribute;
import javax.persistence.metamodel.EntityType;
import javax.persistence.metamodel.SingularAttribute;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import static com.google.common.collect.Iterables.toArray;

/**
 * 对任意实体进行查询
 * 对象里有几个值就查几个值，是字符串就自动like查询，其余类型使用自动等于查询，没有值就查全部
 */
public class CustomerSpecs {

    /**
     * 这里泛型使用T，所以这个Specification是可以用于任意的实体类的
     *
     * @param entityManager
     * @param example       当前的包含值作为查询条件的实体类对象
     * @return
     */
    public static <T> Specification<T> byAuto(final EntityManager entityManager, final T example) {
        // 获取当前实体对象类的类型
        final Class<T> type = (Class<T>) example.getClass();

        return new Specification<T>() {
            @Override
            public Predicate toPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder cb) {

                // 新建Predicate列表存储构造的查询条件
                List<Predicate> predicates = new ArrayList<>();
                // 获得实体类entityType，我们可以从entityType获得实体类的属性
                EntityType<T> entity = entityManager.getMetamodel().entity(type);

                // 对所有属性循环
                for (Attribute<T, ?> attr : entity.getDeclaredAttributes()) {
                    // 获取当前属性的属性值
                    Object attrValue = getValue(example, attr);
                    if (attrValue != null) {
                        // 获取属性的类型
                        if (attr.getJavaType() == String.class) {
                            if (!StringUtils.isEmpty(attrValue)) {
                                predicates.add(cb.like(root.get(attribute(entity, attr.getName(), String.class)), pattern((String) attrValue)));
                            }
                        } else {
                            predicates.add(cb.equal(root.get(attribute(entity, attr.getName(), attrValue.getClass())), attrValue));
                        }

                    }
                }
                return predicates.isEmpty() ? cb.conjunction() : cb.and(toArray(predicates, Predicate.class));
            }

            private <E, T> SingularAttribute<T, E> attribute(EntityType<T> entity, String fieldName, Class<E>
                    filedClass) {
                return entity.getDeclaredSingularAttribute(fieldName, filedClass);
            }

            private <T> Object getValue(T example, Attribute<T, ?> attr) {
                return ReflectionUtils.getField((Field) attr.getJavaMember(), example);
            }
        };

    }

    private static String pattern(String str) {
        return "%" + str + "%";
    }

}
