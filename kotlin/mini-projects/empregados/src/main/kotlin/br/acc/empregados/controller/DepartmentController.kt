package br.acc.empregados.controller

import br.acc.empregados.model.Department
import br.acc.empregados.service.DepartmentService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("department")
class DepartmentController(val service: DepartmentService) {

    @GetMapping
    fun listAll(): List<Department> = service.getAll()

    @PostMapping
    fun create(@RequestBody department: Department) : Department {
        return service.create(department)
    }

    @PutMapping("{id}")
    fun update(@PathVariable id: Int, @RequestBody department: Department) : Department {
        return service.update(id, department)
    }

    @DeleteMapping("{id}")
    fun delete(@PathVariable id: Int){
        service.delete(id)
    }

}