/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futebol;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 *
 * @author gabriel
 */
@Entity
public class Jogador implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idJogador;

    @Column(name = "NomeJogador", nullable = false)
    private String nome;

    @Column(name = "NascJogador", nullable = false)
    private String nascimento;

    @Column(name = "SalJogador", nullable = false, scale = 2)
    private double salario;

    @Enumerated(EnumType.STRING)
    @Column(name = "Disposicao", nullable = false)
    private Escolha disposicao;

    @Column(name = "Numero", nullable = false)
    private int numCamisa;

    @Enumerated(EnumType.STRING)
    @Column(name = "TemAmarelo", nullable = false)
    private Escolha existente;

    @Column(nullable = false)
    private int yellowCard;

    @Column(nullable = false)
    private int redCard;

    @ManyToOne()
    @JoinColumn(name = "idTime", nullable = false, unique = false, insertable = true, updatable = true)
    @Cascade(CascadeType.SAVE_UPDATE)
    @Fetch(FetchMode.SELECT)
    private Time time;

    public Jogador() {

    }

    public int getIdJogador() {
        return idJogador;
    }

    public void setIdJogador(int idJogador) {
        this.idJogador = idJogador;
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

    public int getNumCamisa() {
        return numCamisa;
    }

    public void setNumCamisa(int numCamisa) {
        this.numCamisa = numCamisa;
    }

    public int getYellowCard() {
        return yellowCard;
    }

    public void setYellowCard(int yellowCard) {
        this.yellowCard = yellowCard;
    }

    public int getRedCard() {
        return redCard;
    }

    public void setRedCard(int redCard) {
        this.redCard = redCard;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    public Escolha getDisposicao() {
        return disposicao;
    }

    public void setDisposicao(Escolha disposicao) {
        this.disposicao = disposicao;
    }

    public Escolha getExistente() {
        return existente;
    }

    public void setExistente(Escolha existente) {
        this.existente = existente;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jogador other = (Jogador) obj;
        if (this.numCamisa != other.numCamisa) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

}
