/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import Classes.Cliente;
import Classes.Endereco;
import Classes.Estado;
import Classes.Funcionario;
import Classes.Pedido;
import Classes.Produto;
import Classes.Tipo;
import Hibernate.HibernateUtil;
import java.util.Calendar;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author gabriel
 */
public class Inserir {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction trans = session.beginTransaction();
        /*Inserindo  Cliente */
 Cliente cliente = new Cliente();

        cliente.setNome("Gabriel Soares");
        cliente.setEmail("bielsystem@gmail.com");
        cliente.setPagFace("facebook.com/gabriel.soares");
        cliente.setUserTwi("@gabSilva");
        String nascimento = "19/12/1994";
        cliente.setNascimento(nascimento);

        session.save(cliente)

 /*Inserindo Pedido */

  Pedido pe = new Pedido();
        Cliente cliente = (Cliente) session.load(Cliente.class, 1);
        pe.setCliente(cliente);
        pe.setInicio("04/10/2017 - 12:21:30");
        pe.setFechamento("04/10/2017 - 13:30:58");
        session.save(pe);
         
 /* PRODUTO */
  Produto pr = new Produto();
        pr.setIdProduto(1);
        pr.setDescricao("Refrigerante");
        pr.setTipo(Tipo.Entrada);
        session.save(pr);

   Pedido pe = new Pedido();
        Cliente cliente = (Cliente) session.load(Cliente.class, 1);
        pe.setCliente(cliente);
        pe.setInicio("04/10/2017 - 12:21:30");
        pe.setFechamento("04/10/2017 - 13:30:58");
        session.save(pe);

         
        trans.commit();
        session.close();

    }

}
