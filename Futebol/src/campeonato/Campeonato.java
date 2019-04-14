/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campeonato;

import futebol.Time;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

/**
 *
 * @author gabriel
 */
@Entity
public class Campeonato implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCampeonato;

    @Column(name = "Competicao", nullable = false)
    private String nome;

    @Column(name = "Inicio", nullable = false)
    private String dataBegin;

    @Column(name = "Fim", nullable = false)
    private String dataEnd;

    @ManyToMany
    @JoinColumn(name = "idTimes", nullable = true)
    private Collection<Time> time = new ArrayList<Time>();

    public int getIdCampeonato() {
        return idCampeonato;
    }

    public void setIdCampeonato(int idCampeonato) {
        this.idCampeonato = idCampeonato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Collection<Time> getTime() {
        return time;
    }

    public void setTime(Collection<Time> time) {
        this.time = time;
    }

    public String getDataBegin() {
        return dataBegin;
    }

    public void setDataBegin(String dataBegin) {
        this.dataBegin = dataBegin;
    }

    public String getDataEnd() {
        return dataEnd;
    }

    public void setDataEnd(String dataEnd) {
        this.dataEnd = dataEnd;
    }

}
