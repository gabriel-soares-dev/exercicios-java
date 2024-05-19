package br.acc.empregados.controller

import br.acc.empregados.model.Employee
import br.acc.empregados.service.EmployeeService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("employee")
class EmployeeController(val service: EmployeeService) {

    @GetMapping
    fun listAll(): List<Employee> = service.getAll()

    @PostMapping
    fun create(@RequestBody employee: Employee): Employee {
        return service.create(employee)
    }

    @PutMapping("{id}")
    fun alter(@PathVariable id: Int, @RequestBody employee: Employee): Employee {
        return service.update(id, employee)
    }

    @DeleteMapping("{id}")
    fun delete(@PathVariable id: Int){
        service.delete(id)
    }

    @PutMapping("{id}/department/{departmentId}")
    fun addDepartment(@PathVariable id: Int, @PathVariable departmentId: Int): Employee {
        return service.addDepartment(id, departmentId)
    }

    @DeleteMapping("{id}/department/{departmentId}")
    fun removeDepartment(@PathVariable id: Int, @PathVariable departmentId: Int): Employee {
        return service.removeDepartment(id, departmentId)
    }

    @PutMapping("{id}/manager/{managerId}")
    fun addManager(@PathVariable id: Int, @PathVariable managerId: Int): Employee {
        return service.addManager(id, managerId)
    }

    @DeleteMapping("{id}/manager/{managerId}")
    fun removeManager(@PathVariable id: Int, @PathVariable managerId: Int): Employee {
        return service.removeManager(id, managerId)
    }


}