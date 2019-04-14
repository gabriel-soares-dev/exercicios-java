/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execucao;

import campeonato.Campeonato;
import campeonato.Campeonato_Time;
import campeonato.Classificacao;

import futebol.Time;
import hibernate.HibernateUtil;
import java.util.ArrayList;
import java.util.Collection;
import static javax.management.Query.times;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author gabriel
 *
 *
 *
 *
 *
 *
 */
public class ExeCampeonato {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();

        /* Criar campeonatos
            Campeonato cm = new Campeonato();
            cm.setNome("Campeonato Brasileiro");
            cm.setDataBegin("10/06/2013");
            cm.setDataEnd("02/12/2013");
            Time t = (Time) session.load(Time.class, 1);
            Time t1 = (Time) session.load(Time.class, 2);
            Time t2 = (Time) session.load(Time.class, 3);
            Collection<Time> time = new ArrayList<>();
            time.add(t);
            time.add(t1);
            time.add(t2);
            cm.setTime(time);
	    session.save(time)
            trans.commit();
            session.close();

            cm.setNome("Taça Glória do Goitá");
            cm.setDataBegin("02/03/2013");
            cm.setDataEnd("01/05/2013");
            Time t1 = (Time) session.load(Time.class, 2);
            Time t2 = (Time) session.load(Time.class, 3);
            Collection<Time> time = new ArrayList<>();
            time.add(t1);
            time.add(t2);
            cm.setTime(time);
            session.save(time)
            trans.commit();
            session.close();


         */
 /*Posicões nos times em campeonato
        Classificacao cl = new Classificacao();
        Campeonato idcamp = (Campeonato) session.load(Campeonato.class, 1);
        Time idtime = (Time) session.load(Time.class, 1);

        cl.setPosTime(1);
        Campeonato_Time times = new Campeonato_Time();
        times.setIdcamp(idcamp);
        times.setIdtime(idtime);
        cl.setTimes(times);
	session.save(cl);
        trans.commit();
        session.close();


         Campeonato idcamp = (Campeonato) session.load(Campeonato.class, 2);
        Time idtime = (Time) session.load(Time.class, 2);

        cl.setPosTime(1);
        Campeonato_Time times = new Campeonato_Time();
        times.setIdcamp(idcamp);
        times.setIdtime(idtime);
        cl.setTimes(times);
	session.save(cl);
        trans.commit();
        session.close();


        Campeonato idcamp = (Campeonato) session.load(Campeonato.class, 1);
        Time idtime = (Time) session.load(Time.class, 3);

        cl.setPosTime(2);
        Campeonato_Time times = new Campeonato_Time();
        times.setIdcamp(idcamp);
        times.setIdtime(idtime);
        cl.setTimes(times);
	session.save(cl);
        trans.commit();
        session.close();



        Campeonato idcamp = (Campeonato) session.load(Campeonato.class, 2);
        Time idtime = (Time) session.load(Time.class, 3);

        cl.setPosTime(2);
        Campeonato_Time times = new Campeonato_Time();
        times.setIdcamp(idcamp);
        times.setIdtime(idtime);
        cl.setTimes(times);
        session.save(cl);
        trans.commit();
        session.close();
	session.save(cl);
        trans.commit();
        session.close();


         */
    }

}
