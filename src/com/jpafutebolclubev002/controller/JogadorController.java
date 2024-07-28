package com.jpafutebolclubev002.controller;

import com.jpafutebolclubev002.dao.JogadorDAO;
import com.jpafutebolclubev002.model.Jogador;

/**
 *
 * @author itccolina
 */
public class JogadorController {
    private Jogador jogador;
    
    public JogadorController() {
        jogador = new Jogador();
    }
    
    public void salvar() {
        JogadorDAO jogadorDAO = new JogadorDAO();
        jogadorDAO.salvar(jogador);
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }
    
    
}
