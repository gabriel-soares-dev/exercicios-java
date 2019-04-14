/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execucao;

import futebol.Estado;
import futebol.Escolha;
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
public class DadosFutebol {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction trans = session.beginTransaction();

        /*
        //Inserir Técnicos
        Tecnico t = new Tecnico();
        t.setNome("Paulo Autuori");
        t.setNascimento("10/03/1958");
        t.setSalario(102.00000);
        session.save(t);
        trans.commit();

        t.setNome("Mano Menezes");
        t.setNascimento("21/04/1957");
        t.setSalario((double) 90.00000);
        session.save(t);
        trans.commit();


        t.setNome("Marcelo Oliveira");
        t.setNascimento("10/03/1958");
        t.setSalario((double) 82.50000);
        session.save(t);
        trans.commit();

         */
 /*
        //Inserir Times
        Time t = new Time();

        t.setNome("São Paulo");
        t.setEstado(Estado.SP);
        t.setPontos(15);
        Tecnico tecnico = (Tecnico) session.load(Tecnico.class, 1);
        t.setTecnico(tecnico);
        session.save(t);
        trans.commit();
        session.close();

        t.setNome("Cruzeiro");
        t.setEstado(Estado.MG);
        t.setPontos(32);
        Tecnico tecnico = (Tecnico) session.load(Tecnico.class, 3);
        t.setTecnico(tecnico);
        session.save(t);
        trans.commit();
        session.close();

        t.setNome("Flamengo");
        t.setEstado(Estado.RJ);
        t.setPontos(30);
        Tecnico tecnico = (Tecnico) session.load(Tecnico.class, 3);
        t.setTecnico(tecnico);
        session.save(t);
        trans.commit();
        session.close();

        Juiz ju = new Juiz();

        ju.setNome("Armando Marques");
        ju.setNascimento("06/02/1930");
        ju.setSalario(24.00000);
        session.save(ju);
        trans.commit();
        session.close();

        ju.setNome("Paulo Cesar de Oliveira");
        ju.setNascimento("16/12/1973");
        ju.setSalario(35.00000);
        session.save(ju);
        trans.commit();
        session.close();

         */
 /*

        //Inserir Jogadores
        Jogador j = new Jogador();
        j.setNome("Rogério Ceni");
        Time time = (Time) session.load(Time.class, 1);
        j.setTime(time);
        j.setNascimento("28/10/1979");
        j.setSalario(88.00000);
        j.setDisposicao(Escolha.Sim);
        j.setNumCamisa(01);
        j.setExistente(Escolha.Não);
        j.setYellowCard(2);
        j.setRedCard(1);
        session.save(j);
        trans.commit();
        session.close();


        j.setNome("Alex Silva");
        Time time = (Time) session.load(Time.class, 1);
        j.setTime(time);
        j.setNascimento("04/01/1983");
        j.setSalario(45.00000);
        j.setDisposicao(Escolha.Sim);
        j.setNumCamisa(02);
        j.setExistente(Escolha.Não);
        j.setYellowCard(2);
        j.setRedCard(1);
        session.save(j);
        trans.commit();
        session.close();

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
        session.save(j);
        trans.commit();
        session.close();

        j.setNome("Edcarlos");
        Time time = (Time) session.load(Time.class, 2);
        j.setTime(time);
        j.setNascimento("16/05/1984");
        j.setSalario(70.00000);
        j.setDisposicao(Escolha.Não);
        j.setNumCamisa(04);
        j.setExistente(Escolha.Não);
        j.setYellowCard(1);
        j.setRedCard(0);
        session.save(j);
        trans.commit();
        session.close();

        j.setNome("Souza");
        Time time = (Time) session.load(Time.class, 1);
        j.setTime(time);
        j.setNascimento("27/09/1980");
        j.setSalario(65.00000);
        j.setDisposicao(Escolha.Sim);
        j.setNumCamisa(15);
        j.setExistente(Escolha.Sim);
        j.setYellowCard(1);
        j.setRedCard(1);
        session.save(j);
        trans.commit();
        session.close();

        j.setNome("Ilsinho");
        Time time = (Time) session.load(Time.class, 1);
        j.setTime(time);
        j.setNascimento("25/11/1984");
        j.setSalario(43.86090);
        j.setDisposicao(Escolha.Não);
        j.setNumCamisa(06);
        j.setExistente(Escolha.Não);
        j.setYellowCard(2);
        j.setRedCard(0);
        session.save(j);
        trans.commit();
        session.close();

         */
 /*
 //Inserir Jogos
        Jogo jo = new Jogo();
        Time tCasa = (Time) session.load(Time.class, 1);
        jo.settCasa(tCasa);
        Time tVisitante = (Time) session.load(Time.class, 2);
        jo.settVisitante(tVisitante);
        jo.setNomeCampo("Murumbi");
        jo.setPlaCasa(2);
        jo.setPlaVisitante(1);
        jo.setDataJogo("13/07/2013");
        Juiz ju = (Juiz) session.load(Juiz.class, 2);
        jo.setJuiz(ju);
        session.save(jo);
        trans.commit();
        session.close();

        Time tCasa = (Time) session.load(Time.class, 2);
        jo.settCasa(tCasa);
        Time tVisitante = (Time) session.load(Time.class, 1);
        jo.settVisitante(tVisitante);
        jo.setNomeCampo("Mineirão");
        jo.setPlaCasa(0);
        jo.setPlaVisitante(0);
        jo.setDataJogo("10/10/2013");
        Juiz ju = (Juiz) session.load(Juiz.class, 1);
        jo.setJuiz(ju);
        session.save(jo);
        trans.commit();
        session.close();

        Time tCasa = (Time) session.load(Time.class, 3);
        jo.settCasa(tCasa);
        Time tVisitante = (Time) session.load(Time.class, 2);
        jo.settVisitante(tVisitante);
        jo.setNomeCampo("Maracanã");
        jo.setPlaCasa(1);
        jo.setPlaVisitante(1);
        jo.setDataJogo("14/08/2013");
        Juiz ju = (Juiz) session.load(Juiz.class, 2);
        jo.setJuiz(ju);
        session.save(jo);
        trans.commit();
        session.close();

        Time tCasa = (Time) session.load(Time.class, 1);
        jo.settCasa(tCasa);
        Time tVisitante = (Time) session.load(Time.class, 3);
        jo.settVisitante(tVisitante);
        jo.setNomeCampo("Murumbi");
        jo.setPlaCasa(0);
        jo.setPlaVisitante(0);
        jo.setDataJogo("19/09/2013");
        Juiz ju = (Juiz) session.load(Juiz.class, 1);
        jo.setJuiz(ju);
        session.save(jo);
        trans.commit();
        session.close();
         */
    }

}
