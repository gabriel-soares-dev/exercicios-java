/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campeonato;

import futebol.Time;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 *
 * @author gabriel
 */
@Entity
public class Classificacao implements Serializable {

    @EmbeddedId
    private Campeonato_Time times;

    @Column(name = "posicao", nullable = true)
    private int posTime;

    public int getPosTime() {
        return posTime;
    }

    public void setPosTime(int posTime) {
        this.posTime = posTime;
    }

    public Campeonato_Time getTimes() {
        return times;
    }

    public void setTimes(Campeonato_Time times) {
        this.times = times;
    }

}
