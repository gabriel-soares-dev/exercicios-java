/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campeonato;

import futebol.Time;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 *
 * @author gabriel
 */
@Embeddable
public class Campeonato_Time implements Serializable {

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(unique = false, name = "time", nullable = true, insertable = true, updatable = true)
    @Fetch(FetchMode.SELECT)
    private Time idtime;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(unique = false, name = "campeonato", nullable = true, insertable = true, updatable = true)
    @Fetch(FetchMode.SELECT)
    private Campeonato idcamp;

    public Campeonato getIdcamp() {
        return idcamp;
    }

    public void setIdcamp(Campeonato idcamp) {
        this.idcamp = idcamp;
    }

    public Time getIdtime() {
        return idtime;
    }

    public void setIdtime(Time idtime) {
        this.idtime = idtime;
    }

}
