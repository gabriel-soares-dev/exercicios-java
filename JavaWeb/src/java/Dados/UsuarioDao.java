/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import Classes.Usuario;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author gabriel
 */
public class UsuarioDao extends DAOGenerico<Usuario>{
    
    public UsuarioDao(EntityManagerFactory emf) {
		super(emf);
    }
    
        
}
