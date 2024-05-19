package br.acc.empregados.model

import com.fasterxml.jackson.annotation.JsonProperty
import org.hibernate.annotations.OnDelete
import org.hibernate.annotations.OnDeleteAction
import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name = "emp")
data class Employee (
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="emp_sequence")
    @JsonProperty(value = "empno", access = JsonProperty.Access.READ_ONLY)
    @Column(name="empno")
    val empno: Int? = null,

    @Column(length = 10)
    var ename: String? = null,

    @Column(length = 9)
    var job: String? = null,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="mgr")
    var mgr: Employee? = null,

    var hiredate: LocalDate? = null,

    @Column(length = 7, precision = 2)
    var sal: Float? = null,

    @Column(length = 7, precision = 2)
    var comm: Float? = null,

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name="deptno")
    @OnDelete(action = OnDeleteAction.CASCADE)
    var deptno: Department? = null
)