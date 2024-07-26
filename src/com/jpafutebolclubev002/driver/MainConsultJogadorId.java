package com.jpafutebolclubev002.driver;

import com.jpafutebolclubev002.dao.JogadorDAO;
import com.jpafutebolclubev002.model.Jogador;

/**
 *
 * @author leandro
 */
public class MainConsultJogadorId {
    public static void main(String[] args) {
        JogadorDAO jogadorDAO = new JogadorDAO();
        Jogador j = jogadorDAO.consulta(2L);
        System.out.println("");
        System.out.println(".,,,,,,,,,,,,, INFORMACOES DO JOGADOR ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,.");
        System.out.println("RESULTADO DA CONSULTA: " + j);
        System.out.println(".,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,.");
        System.out.println("");
    }
}
