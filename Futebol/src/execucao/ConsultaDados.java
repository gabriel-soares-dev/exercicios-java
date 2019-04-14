/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execucao;

import futebol.Jogador;
import futebol.Jogo;
import futebol.Tecnico;
import futebol.Time;
import hibernate.HibernateUtil;
import java.util.List;
import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author gabriel
 *
 */
public class ConsultaDados {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();

        trans.commit();
        session.close();
        /*Pesquisar jogador pelo número da camisa de um determinado time

            String string = "from Jogador where idJogador = :jog and idTime = :tim";
            Query lista = session.createQuery(string);
            lista.setInteger("jog", 5);
            lista.setInteger("tim", 1);
            StringBuffer sb = new StringBuffer();
            List<Jogador> joga = lista.list();
            for (Jogador jogador : joga) {
                sb.append("Camisa:" + jogador.getNumCamisa());
            }
            System.out.println("" + sb);

        //Pesquisar jogadores titulares com mais de um cartão amarelo de um determinado time
            String sql = "From Jogador where idTime = :tim and yellowCard > 1 and Disposicao = 'sim' ";
            Query query = session.createQuery(sql);
            query.setInteger("tim", 2);
            List<Jogador> jogado = query.list();
            for (Jogador jogador : jogado) {
            System.out.println("Nome: " + jogador.getNome() + "\n Disposição:" + jogador.getDisposicao());
            System.out.println("Cartões Amarelos" + jogador.getYellowCard());

            }

        //Pesquisar jogos de um determinado time (sendo ele da casa ou visitante) em um determinado
        //período (data de jogo entre duas datas).
        String sql = "From Jogo where DataJogo=:inicio or DataJogo=:fim";
        Query query = session.createQuery(sql);
        query.setString("inicio", "13/07/2013");
        query.setString("fim", "10/10/2013");

        List<Jogo> joga = query.list();
        for (Jogo jogador : joga) {
            System.out.println("\nCasa:" + jogador.gettCasa().getNome()
                    + "\n Visitante:" + jogador.gettVisitante().getNome());
        }

         */
    }

}
