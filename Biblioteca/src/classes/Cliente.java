/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import javax.persistence.Embedded;
import javax.persistence.Entity;

/**
 *
 * @author gabriel
 */
@Entity
public class Cliente extends Pessoa {

    @Embedded
    private Endereco end;

    public Endereco getEnd() {
        return end;
    }

    public void setEnd(Endereco end) {
        this.end = end;
    }

}
