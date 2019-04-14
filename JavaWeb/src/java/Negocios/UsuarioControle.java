/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;

import Classes.Usuario;
import Dados.DAOFactory;
import Dados.UsuarioDao;
import java.util.List;

/**
 *
 * @author gabriel
 */
public class UsuarioControle {

    private UsuarioDao factoryUsuario;
    private Usuario usuarioTeste;

    public UsuarioControle() {
        factoryUsuario = DAOFactory.getUsuarioDao();
    }

    public void setUsuarioTeste(Usuario usuarioTeste) {
        this.usuarioTeste = usuarioTeste;
    }

    public void inserirUsuario(Usuario usuarioAdd) {
        factoryUsuario.insert(usuarioAdd);
    }

    public String isOk() {
        try {
            return "ok";
        } catch (Exception ex) {
            return ex.toString();
        }
    }

    public void atualizaUsuario(Usuario usuarioLogado, Usuario usuarioAtualizado) {
        Usuario usuarioModificada = factoryUsuario.searchByKey(usuarioLogado.getId());
        usuarioModificada.setNome(usuarioAtualizado.getNome());
        usuarioModificada.setEmail(usuarioAtualizado.getEmail());
        usuarioModificada.setPassword(usuarioAtualizado.getPassword());
        factoryUsuario.update(usuarioModificada);
    }

    public void removerUsuario(int id) {
        Usuario usuarioRemover = factoryUsuario.searchByKey(id);
        factoryUsuario.remove(usuarioRemover);
    }

    public List<Usuario> listarUsuarios() {
        return factoryUsuario.getAll();
    }

}
