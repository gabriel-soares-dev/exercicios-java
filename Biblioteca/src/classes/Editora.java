/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 *
 * @author gabriel
 */
@Entity
public class Editora implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Cascade(CascadeType.ALL)
    @Column(name = "idEditora", nullable = true, insertable = true, updatable = true)
    private Long idEd;

    @Column(name = "Nome", nullable = false, insertable = true, updatable = true, length = 80)
    private String nome;

    @Column(name = "Cidade", nullable = false, insertable = true, updatable = true, length = 80)
    private String cidade;

    @OneToMany
    @JoinColumn(name = "idLivros", nullable = true, insertable = true, updatable = true, unique = false)
    @Cascade(CascadeType.ALL)
    @Fetch(FetchMode.JOIN)
    private Collection<Livro> livros;

    public Editora() {
    }

    public Long getIdEd() {
        return idEd;
    }

    public void setIdEd(Long idEd) {
        this.idEd = idEd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

}
