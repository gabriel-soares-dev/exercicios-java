
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 *
 * @author gabriel
 */
@Embeddable
public class Endereco implements Serializable {

    @Column(name = "Logradouro", nullable = false, insertable = true, updatable = true, length = 80)
    private String rua;
    @Column(name = "Numero", nullable = false, insertable = true, updatable = true)
    private int num;
    @Column(name = "Bairro", nullable = false, insertable = true, updatable = true, length = 20)
    private String bairro;
    @Column(name = "Cidade", nullable = false, insertable = true, updatable = true, length = 50)
    private String cidade;

    @Enumerated(EnumType.STRING)
    @Column(name = "Estado", nullable = false, insertable = true, updatable = true, length = 50)
    private Estado estado;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getLogradouro() {
        return rua;
    }

    public void setLogradouro(String rua) {
        this.rua = rua;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

}
