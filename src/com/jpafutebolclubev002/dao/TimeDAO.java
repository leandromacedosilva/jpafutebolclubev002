package com.jpafutebolclubev002.dao;

import com.jpafutebolclubev002.model.Time;
import com.jpafutebolclubev002.util.JpaUtil;
import javax.persistence.EntityManager;

/**
 *
 * @author leandro
 */
public class TimeDAO {
    public void salvar(Time time) {
        try {
    EntityManager em = JpaUtil.openConnection();
    em.getTransaction().begin();
    em.persist(time);
    em.getTransaction().commit();
        } finally {
            JpaUtil.closeConnectiton();
        }
    }
    
    //public List<
}
