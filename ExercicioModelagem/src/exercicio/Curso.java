/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author gabriel
 */
@Entity
public class Curso implements Serializable {

    @Id
    private int Id_curso;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "departamento_curso", schema = "anotacoes",
            joinColumns = @JoinColumn(name = "id_departamento"),
            inverseJoinColumns = @JoinColumn(name = "id_curso"))
    private Collection<Departamento> departamentos;

    public int getId_curso() {
        return Id_curso;
    }

    public void setId_curso(int Id_curso) {
        this.Id_curso = Id_curso;
    }

}
