/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author gabriel
 */
@Entity
public class Endereco implements Serializable {

    @Id
    private int IdEndreco;

    @OneToOne
    @JoinColumn(name = "id_universidade")
    private Universidade universidade;

    public int getIdEndreco() {
        return IdEndreco;
    }

    public void setIdEndreco(int IdEndreco) {
        this.IdEndreco = IdEndreco;
    }

}
