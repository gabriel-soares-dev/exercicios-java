/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import Classes.Endereco;
import Classes.Estado;
import Classes.Funcionario;
import Classes.Produto;
import Classes.Tipo;
import Hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author gabriel
 */
public class Alteracao {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction trans = session.beginTransaction();
        /*        */
        Funcionario func = new Funcionario();
        func.setIdPessoa(32768);
        func.setCargo("Garçom");
        func.setEmail("diem@gmail.com");
        func.setNome("Gabriel Martins");
        func.setNascimento("11/12/1988");
        func.setSalario((double) 1460.90);
        Endereco end = new Endereco();
        end.setBairro("Centro");
        end.setCidade("Recife");
        end.setNum(119);
        end.setRua("Conde da Boa Vista");
        end.setEstado(Estado.PE);
        func.setEnd(end);
        session.update(func);
        trans.commit();
        session.close();

         Produto pr = new Produto();
        pr.setIdProduto(1);
        pr.setDescricao("Cerveja");
        pr.setTipo(Tipo.Entrada);
        session.update(pr);
        trans.commit();
        session.close();
 

    }

}
