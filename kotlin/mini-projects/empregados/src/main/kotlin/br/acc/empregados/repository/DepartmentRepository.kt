package br.acc.empregados.repository

import br.acc.empregados.model.Department
import org.springframework.data.repository.CrudRepository

interface DepartmentRepository : CrudRepository<Department, Int> {
}