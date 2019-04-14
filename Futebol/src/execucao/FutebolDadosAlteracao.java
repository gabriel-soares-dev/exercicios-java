/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execucao;

import futebol.Escolha;
import futebol.Estado;
import futebol.Jogador;
import futebol.Jogo;
import futebol.Juiz;
import futebol.Tecnico;
import futebol.Time;
import hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author gabriel
 */
public class FutebolDadosAlteracao {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();

        /*
        //Atualização dados do Jogo e do Time
        Jogo jo = new Jogo();
        jo.setIdJogo(4);
        Time tCasa = (Time) session.load(Time.class, 1);
        jo.settCasa(tCasa);
        Time tVisitante = (Time) session.load(Time.class, 3);
        jo.settVisitante(tVisitante);
        jo.setNomeCampo("Murumbi");
        jo.setPlaCasa(3);
        jo.setPlaVisitante(2);
        jo.setDataJogo("19/09/2013");
        Juiz ju = (Juiz) session.load(Juiz.class, 1);
        jo.setJuiz(ju);
        session.update(jo);
        trans.commit();
        session.close();

        Time t = new Time();
        t.setIdTime(1);
        t.setNome("São Paulo");
        t.setEstado(Estado.SP);
        t.setPontos(18);
        Tecnico tecnico = (Tecnico) session.load(Tecnico.class, 1);
        t.setTecnico(tecnico);
        session.update(t);
        trans.commit();
        session.close();
         */
 /*
        //Atualizar dados dos Jogadores
        Jogador j = new Jogador();
        j.setIdJogador(6);

        j.setNome("Ilsinho Cavalcanti");
        Time time = (Time) session.load(Time.class, 1);
        j.setTime(time);
        j.setNascimento("25/11/1984");
        j.setSalario(89.00000);
        j.setDisposicao(Escolha.Não);
        j.setNumCamisa(06);
        j.setExistente(Escolha.Sim);
        j.setYellowCard(2);
        j.setRedCard(0);
	session.update(j);
        trans.commit();
        session.close();

        j.setIdJogador(2);
        j.setNome("Alex Silva");
        Time time = (Time) session.load(Time.class, 3);
        j.setTime(time);
        j.setNascimento("04/01/1983");
        j.setSalario(45.00000);
        j.setDisposicao(Escolha.Sim);
        j.setNumCamisa(02);
        j.setExistente(Escolha.Não);
        j.setYellowCard(2);
        j.setRedCard(1);
        session.update(j);
        trans.commit();
        session.close();

        //Apagar Jogador - Rogerio
        Jogador jog = (Jogador) session.load(Jogador.class, 1);
        session.delete(jog);
        trans.commit();
        session.close();

        //Apagar o Time - Cruzeiro
        Jogo jo = new Jogo();
         jo.setIdJogo(1);
        Time tCasa = (Time) session.load(Time.class, 1);
        jo.settCasa(tCasa);
        Time tVisitante = (Time) session.load(Time.class, 3);
        jo.settVisitante(tVisitante);
        jo.setNomeCampo("Murumbi");
        jo.setPlaCasa(2);
        jo.setPlaVisitante(1);
        jo.setDataJogo("13/07/2013");
        Juiz ju = (Juiz) session.load(Juiz.class, 2);
        jo.setJuiz(ju);
        session.update(jo);
        trans.commit();
        session.close();

        jo.setIdJogo(2);
        Time tCasa = (Time) session.load(Time.class, 3);
        jo.settCasa(tCasa);
        Time tVisitante = (Time) session.load(Time.class, 1);
        jo.settVisitante(tVisitante);
        jo.setNomeCampo("Mineirão");
        jo.setPlaCasa(0);
        jo.setPlaVisitante(0);
        jo.setDataJogo("10/10/2013");
        Juiz ju = (Juiz) session.load(Juiz.class, 1);
        jo.setJuiz(ju);
        session.update(jo);
        trans.commit();
        session.close();

        jo.setIdJogo(3);
        Time tCasa = (Time) session.load(Time.class, 3);
        jo.settCasa(tCasa);
        Time tVisitante = (Time) session.load(Time.class, 1);
        jo.settVisitante(tVisitante);
        jo.setNomeCampo("Maracanã");
        jo.setPlaCasa(1);
        jo.setPlaVisitante(1);
        jo.setDataJogo("14/08/2013");
        Juiz ju = (Juiz) session.load(Juiz.class, 2);
        jo.setJuiz(ju);
        session.update(jo);
        trans.commit();
        session.close();

        j.setIdJogador(3);
        j.setNome("Fabão");
        Time time = (Time) session.load(Time.class, 2);
        j.setTime(time);
        j.setNascimento("22/11/1982");
        j.setSalario(52.50000);
        j.setDisposicao(Escolha.Sim);
        j.setNumCamisa(03);
        j.setExistente(Escolha.Não);
        j.setYellowCard(3);
        j.setRedCard(0);
        session.update(j);
        trans.commit();
        session.close();

        j.setIdJogador(4);
        j.setNome("Edcarlos");
        Time time = (Time) session.load(Time.class, 3);
        j.setTime(time);
        j.setNascimento("16/05/1984");
        j.setSalario(70.00000);
        j.setDisposicao(Escolha.Não);
        j.setNumCamisa(04);
        j.setExistente(Escolha.Não);
        j.setYellowCard(1);
        j.setRedCard(0);
        session.update(j);
        trans.commit();
        session.close();

        Time t = (Time) session.load(Time.class, 2);
        session.delete(t);
        trans.commit();
        session.close();
         */
    }

}
