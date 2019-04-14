/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author gabriel
 */
@Entity
public class Cliente extends Pessoa {

    @Column(name = "Facebook", nullable = false, insertable = true, updatable = true)
    private String pagFace;

    @Column(name = "Twitter", nullable = false, insertable = true, updatable = true)
    private String userTwi;

    @OneToMany
    @JoinColumn(name = "idPedido", nullable = true, insertable = true, updatable = true, unique = false)
    @Cascade(CascadeType.ALL)
    private Collection<Pedido> pedidos;

    public Collection<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(Collection<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public Cliente() {
    }

    public String getPagFace() {
        return pagFace;
    }

    public void setPagFace(String pagFace) {
        this.pagFace = pagFace;
    }

    public String getUserTwi() {
        return userTwi;
    }

    public void setUserTwi(String userTwi) {
        this.userTwi = userTwi;
    }

    @Override
    public int getIdPessoa() {
        return idPessoa;
    }

    @Override
    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getNascimento() {
        return nascimento;
    }

    @Override
    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

}
