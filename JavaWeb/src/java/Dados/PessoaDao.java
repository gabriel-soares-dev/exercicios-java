/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import Classes.Pessoa;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author gabriel
 */
public class PessoaDao extends DAOGenerico<Pessoa> {

    public PessoaDao(EntityManagerFactory emf) {
        super(emf);
    }

}
