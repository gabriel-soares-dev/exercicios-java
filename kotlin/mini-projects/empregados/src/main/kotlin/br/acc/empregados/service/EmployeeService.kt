package br.acc.empregados.service

import br.acc.empregados.model.Employee
import br.acc.empregados.repository.EmployeeRepository
import org.springframework.stereotype.Service

@Service
class EmployeeService(val db: EmployeeRepository, val departmentService: DepartmentService) {

    fun create(employee: Employee): Employee = db.save(employee)

    fun delete(id: Int) {
        if (db.existsById(id)){
            db.deleteById(id)
        }
    }

    fun getAll(): List<Employee> = db.findAll() as List<Employee>

    fun update(id: Int, employee: Employee): Employee {
        if (db.existsById(id)){
            val safeEmployee = employee.copy(id)
            return db.save(safeEmployee)
        }

        return Employee()
    }

    fun addDepartment(id: Int, departmentId: Int): Employee {
        val employee = db.findById(id)
        if (employee.isPresent){
            val department = departmentService.getById(id)
            if (department.isPresent) {
                employee.get().deptno = department.get()
                return db.save(employee.get())
            }
        }
        return Employee()
    }

    fun removeDepartment(id: Int, departmentId: Int): Employee {
        val employee = db.findById(id)
        if (employee.isPresent){
            employee.get().deptno = null
            db.save(employee.get())
        }
        return Employee()
    }

    fun addManager(id: Int, managerId: Int): Employee {
        val employee = db.findById(id)
        if (employee.isPresent){
            val manager = db.findById(managerId)
            employee.get().mgr = manager.get()
            return db.save(employee.get())
        }
        return Employee()
    }

    fun removeManager(id: Int, managerId: Int): Employee {
        val employee = db.findById(id)
        if (employee.isPresent){
            employee.get().mgr = null
            return db.save(employee.get())
        }
        return Employee()
    }
}