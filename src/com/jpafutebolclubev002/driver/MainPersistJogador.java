package com.jpafutebolclubev002.driver;

import com.jpafutebolclubev002.dao.JogadorDAO;
import com.jpafutebolclubev002.model.Jogador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leandro
 */
public class MainPersistJogador {
    public static void main(String[] args) {
        Jogador jogador001 = new Jogador("Samuel", "007.657.543-09", "Atacante");
        Jogador jogador002 = new Jogador("Raimundo", "347.098.098-88", "Zagueiro");
        Jogador jogador003 = new Jogador("Arthur", "984.876.112-11", "Lateral direito");
        Jogador jogador004 = new Jogador("Kalbi", "452.445.231-76", "Meia esquerda");
        Jogador jogador005 = new Jogador("Leandro", "803.665.723-43", "Atacante");
        
        List<Jogador> jogadores = new ArrayList<>();
        jogadores.add(jogador001);
        jogadores.add(jogador002);
        jogadores.add(jogador003);
        jogadores.add(jogador004);
        jogadores.add(jogador005);
        
        JogadorDAO jogadorDAO = new JogadorDAO();
        jogadorDAO.salvarLista(jogadores);
    }
}
