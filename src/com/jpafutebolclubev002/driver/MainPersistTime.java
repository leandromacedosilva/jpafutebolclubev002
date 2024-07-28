package com.jpafutebolclubev002.driver;

//import com.jpafutebolclubev002.dao.JogadorDAO;
//import com.jpafutebolclubev002.dao.TimeDAO;
import com.jpafutebolclubev002.dao.TimeDAO;
import com.jpafutebolclubev002.model.Jogador;
import com.jpafutebolclubev002.model.Time;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leandro
 */
public class MainPersistTime {
    public static void main(String[] args) {
        Jogador jogador001 = new Jogador("Nilto", "776.547.009-71", "Meia direta");
        Jogador jogador002 = new Jogador("Joao", "827.812.765-02", "Meia esquerda");
        
        List<Jogador> jogadores = new ArrayList<>();
        jogadores.add(jogador001);
        jogadores.add(jogador002);
        
        //JogadorDAO jogadorDAO = new JogadorDAO();
        //jogadorDAO.salvarLista(jogadores);
        
        Time time001 = new Time();
        time001.setNome("Tabajara FC");
        time001.setJogadores(jogadores);
        
        TimeDAO timeDAO = new TimeDAO();
        timeDAO.salvar(time001);
        
    }
}
