/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class DAOFactory {

    private static final EntityManagerFactory factory;

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        factory = Persistence.createEntityManagerFactory("hibernatetest");
    }

    public static UsuarioDao getUsuarioDao() {
        UsuarioDao dao = new UsuarioDao(factory);
        return dao;
    }

    public static PessoaDao getPessoaDao() {
        PessoaDao dao = new PessoaDao(factory);
        return dao;
    }

}
