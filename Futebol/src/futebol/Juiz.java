/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futebol;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author gabriel
 */
@Entity
public class Juiz implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idJuiz;

    @Column(name = "NomeJuiz", nullable = false)
    private String nome;

    @Column(name = "NascJuiz", nullable = false)
    private String nascimento;

    @Column(name = "SalJuiz", nullable = false, scale = 2)
    private double salario;

    public Juiz() {
    }

    public int getIdJuiz() {
        return idJuiz;
    }

    public void setIdJuiz(int idJuiz) {
        this.idJuiz = idJuiz;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
