package br.acc.empregados.repository

import br.acc.empregados.model.Employee
import org.springframework.data.repository.CrudRepository

interface EmployeeRepository: CrudRepository<Employee, Int> {
}