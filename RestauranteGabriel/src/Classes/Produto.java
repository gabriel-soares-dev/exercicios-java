/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author gabriel
 */
@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = true, insertable = true, updatable = true, unique = false)
    private int IdProduto;
    @Column(name = "Descricao", nullable = false, insertable = true, updatable = true)
    private String descricao;
    @Enumerated(EnumType.STRING)
    @Column(name = "Tipo", nullable = false, insertable = true, updatable = true)
    private Tipo tipo;

    @ManyToMany
    @JoinColumn(name = "idPedido", nullable = true, insertable = true, updatable = true, unique = false)
    @Cascade(CascadeType.ALL)
    private Collection<Pedido> pedidos;

    public String getDescricao() /*
    @ManyToMany
    @JoinColumn(name = "iProduto", nullable = true, insertable = true, updatable = true, unique = false)
    @Cascade(CascadeType.ALL)
    private Collection<Produto> produtos;
     */ {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Collection<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(Collection<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public int getIdProduto() {
        return IdProduto;
    }

    public void setIdProduto(int IdProduto) {
        this.IdProduto = IdProduto;
    }

}
