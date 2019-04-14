/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futebol;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;

/**
 *
 * @author gabriel
 */
@Entity
public class Jogo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Cascade(CascadeType.ALL)
    private int idJogo;

    @OneToOne
    @JoinColumn(name = "Casa", insertable = true, updatable = true)
    @Cascade(CascadeType.ALL)
    private Time tCasa;

    @OneToOne
    @JoinColumn(name = "Visitante", insertable = true, updatable = true)
    @Cascade(CascadeType.ALL)
    private Time tVisitante;

    @Column(name = "Estadio", nullable = false)
    private String nomeCampo;

    @OneToOne
    @Cascade(CascadeType.ALL)
    private Juiz juiz;

    @Column(nullable = true)
    @Cascade(CascadeType.SAVE_UPDATE)
    private int plaCasa;

    @Column(nullable = true)
    @Cascade(CascadeType.SAVE_UPDATE)
    private int plaVisitante;

    @Column(name = "DataJogo", nullable = false)
    private String dataJogo;

    public Jogo() {

    }

    public int getIdJogo() {
        return idJogo;
    }

    public void setIdJogo(int idJogo) {
        this.idJogo = idJogo;
    }

    public int getPlaCasa() {
        return plaCasa;
    }

    public void setPlaCasa(int plaCasa) {
        this.plaCasa = plaCasa;
    }

    public int getPlaVisitante() {
        return plaVisitante;
    }

    public void setPlaVisitante(int plaVisitante) {
        this.plaVisitante = plaVisitante;
    }

    public String getDataJogo() {
        return dataJogo;
    }

    public void setDataJogo(String dataJogo) {
        this.dataJogo = dataJogo;
    }

    public String getNomeCampo() {
        return nomeCampo;
    }

    public void setNomeCampo(String nomeCampo) {
        this.nomeCampo = nomeCampo;
    }

    public Juiz getJuiz() {
        return juiz;
    }

    public void setJuiz(Juiz juiz) {
        this.juiz = juiz;
    }

    public Time gettCasa() {
        return tCasa;
    }

    public void settCasa(Time tCasa) {
        this.tCasa = tCasa;
    }

    public Time gettVisitante() {
        return tVisitante;
    }

    public void settVisitante(Time tVisitante) {
        this.tVisitante = tVisitante;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
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
        final Jogo other = (Jogo) obj;
        if (this.idJogo != other.idJogo) {
            return false;
        }
        if (!Objects.equals(this.dataJogo, other.dataJogo)) {
            return false;
        }
        if (!Objects.equals(this.tCasa, other.tCasa)) {
            return false;
        }
        if (!Objects.equals(this.tVisitante, other.tVisitante)) {
            return false;
        }
        return true;
    }

}
