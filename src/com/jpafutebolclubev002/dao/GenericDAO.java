package com.jpafutebolclubev002.dao;

import com.jpafutebolclubev002.util.JpaUtil;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author leandro
 * @param <T>
 */
public class GenericDAO<T> {
    private final EntityManager entityManager;
    private final Class<T> classRef;
    
    public GenericDAO(Class<T> classRef) {
        this.classRef = classRef;
        entityManager = JpaUtil.openConnection();
    }
    
    public void save(T entity){
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
    }
    
    public void update(T entity) {
        entityManager.getTransaction().begin();
        entityManager.merge(entity);
        entityManager.flush();
        entityManager.getTransaction().commit();
    }
    
    public T getByID(Long id) {
        return entityManager.find(classRef, id);
    }
    
    public List<T> findAll() {
        String query = "SELECT j FROM " + classRef.getName() + " j";
        return entityManager.createQuery(query).getResultList();
    }
    
}
