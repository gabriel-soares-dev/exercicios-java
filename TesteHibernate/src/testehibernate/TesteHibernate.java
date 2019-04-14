/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testehibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author gabriel
 */
public class TesteHibernate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Manager about of Entity
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernatetest");
        EntityManager em = emf.createEntityManager();

        //Transation
        EntityTransaction et = em.getTransaction();
        et.begin();

        //Instance insert to object
        Funcionario f = new Funcionario("788878.90.0", "Teledigital S/A");

        //Starting operation of persistence
        em.persist(f);

        et.commit();

        //Close manager
        em.close();
        emf.close();
    }

}
