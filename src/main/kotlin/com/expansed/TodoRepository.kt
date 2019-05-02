package com.expansed

import com.expansed.domain.Todo
import io.micronaut.configuration.hibernate.jpa.scope.CurrentSession
import io.micronaut.spring.tx.annotation.Transactional
import javax.inject.Singleton
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

@Singleton
open class TodoRepository (@param:CurrentSession @field:PersistenceContext val entityManager: EntityManager) {

    @Transactional
    open fun add(todo: Todo): Todo {
        entityManager.persist(todo)
        return todo
    }

    @Transactional(readOnly = true)
    open fun findById(id: Long): Todo = entityManager.find(Todo::class.java, id)

    @Transactional(readOnly = true)
    open fun findAll(): List<Todo> = entityManager.createQuery("SELECT t FROM Todo t").resultList as List<Todo>

}