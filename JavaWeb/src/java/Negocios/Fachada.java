/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;

import Classes.Pessoa;
import Classes.Usuario;
import java.util.List;

/**
 *
 * @author gabriel
 */
public class Fachada implements IFachada {

    private UsuarioControle controleUsuario;
    private PessoaControle controlePessoa;

    public Fachada() {
        this.controleUsuario = new UsuarioControle();
        this.controlePessoa = new PessoaControle();
    }

    @Override
    public void inserirUsuario(Usuario usuario) {
        controleUsuario.inserirUsuario(usuario);
    }

    @Override
    public void inserirPessoa(Pessoa pessoa) {
        controlePessoa.inserirPessoa(pessoa);
    }

    @Override
    public void atualizaUsuario(Usuario usuarioLogado, Usuario usuarioAtualizado) {
        controleUsuario.atualizaUsuario(usuarioLogado, usuarioAtualizado);
    }

    @Override
    public void removerUsuario(int id) {
        controleUsuario.removerUsuario(id);
    }

    @Override
    public List<Usuario> listarUsuarios() {
        return controleUsuario.listarUsuarios();
    }

    @Override
    public List<Pessoa> listarPessoas() {
        return controlePessoa.listarPessoas();
    }

}
