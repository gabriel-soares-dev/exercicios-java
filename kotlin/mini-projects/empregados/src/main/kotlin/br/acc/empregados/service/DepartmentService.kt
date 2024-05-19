package br.acc.empregados.service

import br.acc.empregados.model.Department
import br.acc.empregados.repository.DepartmentRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class DepartmentService(val db: DepartmentRepository) {

    fun create(department: Department): Department = db.save(department)

    fun delete(id: Int) {
        if (db.existsById(id)){
            db.deleteById(id)
        }
    }

    fun getById(id: Int): Optional<Department> {
        return db.findById(id)
    }

    fun getAll(): List<Department> = db.findAll() as List<Department>

    fun update(id: Int, department: Department): Department {

        if(db.existsById(id)){
            val safeDepartment = department.copy(id)
            return db.save(safeDepartment)
        }

        return Department()

    }
}