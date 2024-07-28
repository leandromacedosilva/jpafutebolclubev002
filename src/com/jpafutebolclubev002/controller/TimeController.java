package com.jpafutebolclubev002.controller;

import com.jpafutebolclubev002.dao.GenericDAO;
import com.jpafutebolclubev002.model.Time;
import com.jpafutebolclubev002.util.Caracter;
import javax.swing.JOptionPane;

/**
 *
 * @author leandro
 */
public class TimeController {
    private Time time;
    private GenericDAO<Time> timeDAO;
    
    public TimeController() {
        time = new Time();
        timeDAO = new GenericDAO<Time>(Time.class);
    }
    
    public void salvar() {
        //JogadorDAO jogadorDAO = new JogadorDAO();
        timeDAO.save(time);
    }
    
    public void salvar(String nome, String cpf, String posicao) {
        //JogadorDAO jogadorDAO = new JogadorDAO();
        time.setNome(nome);
        //time.setCpf(Caracter.caracterRemove(cpf));
        //time.setPosicao(posicao);
        timeDAO.save(time);
    }
    
    public void consultAll() {
        JOptionPane.showMessageDialog(null, timeDAO.findAll());
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
