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
            System.out.println("DADOS PERSISTIDOS COM SUCESSO NO BANCO DE DADOS!");
        } finally {
            JpaUtil.closeConnectiton();
        }
    }
    
    //public List<
}
