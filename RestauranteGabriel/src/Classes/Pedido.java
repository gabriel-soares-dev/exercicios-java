/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Calendar;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Generated;

/**
 *
 * @author gabriel
 */
@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(insertable = true, updatable = true, nullable = true, unique = false)
    @Cascade(CascadeType.ALL)
    private int IdPedido;

    @Column(name = "Inicio", nullable = false, insertable = true, updatable = true)
    private String inicio;

    @Column(name = "Fechamento", nullable = false, insertable = true, updatable = true)
    private String fechamento;

    @OneToOne
    @JoinColumn(name = "idCliente", nullable = true, insertable = true, updatable = true, unique = false)
    @Cascade(CascadeType.ALL)
    private Cliente cliente;

    /*
    @ManyToMany
    @JoinColumn(name = "iProduto", nullable = true, insertable = true, updatable = true, unique = false)
    @Cascade(CascadeType.ALL)
    private Collection<Produto> produtos;
     */
    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFechamento() {
        return fechamento;
    }

    public void setFechamento(String fechamento) {
        this.fechamento = fechamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getIdPedido() {
        return IdPedido;
    }

    public void setIdPedido(int IdPedido) {
        this.IdPedido = IdPedido;
    }

}
