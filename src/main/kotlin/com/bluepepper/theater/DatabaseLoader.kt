package com.bluepepper.theater

import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
data class DatabaseLoader(val repository: EmployeeRepository) : CommandLineRunner {
//    private var repository: EmployeeRepository
//
//    @Autowired
//    fun DatabaseLoader(repository: EmployeeRepository) {
//        this.repository = repository
//    }

    @Override
    override fun run(vararg strings: String) {
        this.repository.save(Employee(firstName = "Frodo", lastName = "Baggins"))
    }

}