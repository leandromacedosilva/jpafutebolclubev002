package com.jpafutebolclubev002.dao;

import com.jpafutebolclubev002.model.Jogador;
import com.jpafutebolclubev002.util.JpaUtil;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author leandro
 */
public class JogadorDAO {
    
    // salvar dados do jogador
    public void salvar(Jogador jogador) {
        try {
        EntityManager em = JpaUtil.openConnection();
        em.getTransaction().begin();
        em.persist(jogador);
        em.getTransaction().commit();
        } finally {
            JpaUtil.closeConnectiton();
        }
    }
    
    // salvar lista de dados do(s) jogador(es)
    public void salvarLista(List<Jogador> jogadores) {
        try {
        EntityManager em = JpaUtil.openConnection();
        em.getTransaction().begin();
        for(Jogador j : jogadores) {
        em.persist(j);
        }
        em.getTransaction().commit();
        } finally {
            JpaUtil.closeConnectiton();
        }
    }
    
    // atualizar informacoes do jogador
    public void atualizar(Jogador jogador) {
        try {
        EntityManager em = JpaUtil.openConnection();
        em.getTransaction().begin();
        em.merge(jogador);
        em.flush();
        em.getTransaction().commit();
        } finally {
        JpaUtil.closeConnectiton();
        }
    }
    
    // consultar jogador pelo codigo
    public Jogador consulta(Long id) {
        EntityManager em = JpaUtil.openConnection();
        return em.find(Jogador.class, id);
    }
    
    // listar todos os jogadores 
    public List<Jogador> todosJogadores(List<Jogador> jogadores) {
        EntityManager em = JpaUtil.openConnection();
        String query = "SELECT j FROM Jogador j";
        return em.createQuery(query).getResultList();
    }
    
}
