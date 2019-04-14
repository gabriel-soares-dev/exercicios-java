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
public interface IFachada {

    public void inserirUsuario(Usuario usuario);

    public void inserirPessoa(Pessoa pessoa);

    public void atualizaUsuario(Usuario usuarioLogado, Usuario usuarioAtualizado);

    public void removerUsuario(int id);

    public List<Usuario> listarUsuarios();

    public List<Pessoa> listarPessoas();
}
