package com.jpafutebolclubev002.controller;

import com.jpafutebolclubev002.dao.GenericDAO;
import com.jpafutebolclubev002.model.Jogador;
import com.jpafutebolclubev002.util.Caracter;
import javax.swing.JOptionPane;

/**
 *
 * @author itccolina
 */
public class JogadorController {
    private Jogador jogador;
    private GenericDAO<Jogador> jogadorDAO;
    
    public JogadorController() {
        jogador = new Jogador();
        jogadorDAO = new GenericDAO<Jogador>(Jogador.class);
    }
    
    public void salvar() {
        //JogadorDAO jogadorDAO = new JogadorDAO();
        jogadorDAO.save(jogador);
    }
    
    public void salvar(String nome, String cpf, String posicao) {
        //JogadorDAO jogadorDAO = new JogadorDAO();
        jogador.setNome(nome);
        jogador.setCpf(Caracter.caracterRemove(cpf));
        jogador.setPosicao(posicao);
        jogadorDAO.save(jogador);
    }
    
    public void consultAll() {
        JOptionPane.showMessageDialog(null, jogadorDAO.findAll());
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }
    
}
