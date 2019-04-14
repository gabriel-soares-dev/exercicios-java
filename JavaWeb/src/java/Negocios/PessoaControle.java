/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;

import Classes.Pessoa;
import Dados.DAOFactory;
import Dados.PessoaDao;
import java.util.List;

/**
 *
 * @author gabriel
 */
public class PessoaControle {

    private PessoaDao factoryPessoa;
    private Pessoa pessoaTeste;

    public PessoaControle() {
        factoryPessoa = DAOFactory.getPessoaDao();

    }

    public void inserirPessoa(Pessoa pessoaAdd) {
        factoryPessoa.insert(pessoaAdd);
    }

    public void setPessoaTeste(Pessoa pessoaTeste) {
        this.pessoaTeste = pessoaTeste;
    }

    public List<Pessoa> listarPessoas() {
        return factoryPessoa.getAll();
    }

}
