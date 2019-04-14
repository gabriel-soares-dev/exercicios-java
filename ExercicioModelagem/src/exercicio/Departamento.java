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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author gabriel
 */
@Entity
public class Departamento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id_departamento;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "departamento_curso", schema = "anotacoes",
            joinColumns = @JoinColumn(name = "id_departamento"),
            inverseJoinColumns = @JoinColumn(name = "id_curso"))
    private Collection<Curso> cursos;

    public int getId_departamento() {
        return Id_departamento;
    }

    public void setId_departamento(int Id_departamento) {
        this.Id_departamento = Id_departamento;
    }

}
