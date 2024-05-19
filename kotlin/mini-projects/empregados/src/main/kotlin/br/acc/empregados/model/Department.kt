package br.acc.empregados.model

import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.*

@Entity
@Table(name = "dept")
data class Department (
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="dept_sequence")
    @JsonProperty(value = "deptno", access = JsonProperty.Access.READ_ONLY)
    @Column(name="deptno")
    val deptno: Int? = null,

    @Column(length = 14)
    var dname: String? = null,

    @Column(length = 13)
    var loc: String? = null,

)