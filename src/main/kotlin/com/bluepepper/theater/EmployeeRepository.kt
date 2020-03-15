package com.bluepepper.theater

import org.springframework.data.repository.CrudRepository

interface EmployeeRepository : CrudRepository<Employee, Long> {
//    fun <S : T?> save(var1: S): S
//    fun <S : T?> saveAll(var1: Iterable<S>?): Iterable<S>?
//    fun findById(var1: ID?): Optional<T?>?
//    fun existsById(var1: ID?): Boolean
//    override fun findAll(): Iterable<T?>?
//    fun findAllById(var1: Iterable<ID?>?): Iterable<T?>?
//    override fun count(): Long
//    fun deleteById(var1: ID?)
//    fun delete(var1: T?)
//    fun deleteAll(var1: Iterable<T?>?)
//    override fun deleteAll()
}