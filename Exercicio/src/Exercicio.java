
import Hibernate.NewHibernateUtil;
import org.hibernate.Session;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gabriel
 */
public class Exercicio {

    public static void main(String[] args) {

        Session session = NewHibernateUtil.getSessionFactory().openSession();

    }

}
