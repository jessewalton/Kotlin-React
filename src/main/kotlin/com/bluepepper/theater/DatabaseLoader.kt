package com.bluepepper.theater

import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
data class DatabaseLoader(val repository: EmployeeRepository) : CommandLineRunner {
    @Override
    override fun run(vararg strings: String) {
        this.repository.save(Employee(firstName = "Frodo", lastName = "Baggins"))
        this.repository.save(Employee(firstName = "Sam", lastName = "Gamgee"))
    }
}