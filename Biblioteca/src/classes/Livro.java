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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 *
 * @author gabriel
 */
@Entity
public class Livro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Cascade(CascadeType.ALL)
    @Column(name = "idLivro", nullable = false, insertable = true, updatable = true)
    private Long idBook;
    @Column(name = "Titulo", nullable = true, insertable = true, updatable = true, length = 20)
    private String titulo;
    @Column(name = "Publicacao", nullable = true, insertable = true, updatable = true, length = 4)
    private int anopub;

    @OneToMany
    @JoinColumn(name = "idAutores", nullable = true, insertable = true, updatable = true, unique = false)
    @Cascade(CascadeType.ALL)
    private Collection<Autor> autores;

    @OneToOne
    @JoinColumn(name = "idEditora", nullable = true, insertable = true, updatable = true, unique = false)
    @Cascade(CascadeType.ALL)
    private Editora editora;

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public Long getIdBook() {
        return idBook;
    }

    public void setIdBook(Long idBook) {
        this.idBook = idBook;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnopub() {
        return anopub;
    }

    public void setAnopub(int anopub) {
        this.anopub = anopub;
    }

}
