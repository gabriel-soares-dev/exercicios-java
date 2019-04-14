/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciomodelagem;

import Hibernate.NewHibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author gabriel
 */
public class ExercicioModelagem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Session session = NewHibernateUtil.getSessionFactory().openSession();
    }

}
