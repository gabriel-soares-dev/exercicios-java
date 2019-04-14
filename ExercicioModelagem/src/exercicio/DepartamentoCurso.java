/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author gabriel
 */
@Entity
public class DepartamentoCurso implements Serializable {

    @EmbeddedId
    private DepartamentoCursoPK chavecomposta;

    @Temporal(TemporalType.DATE)
    private Date data;

}
