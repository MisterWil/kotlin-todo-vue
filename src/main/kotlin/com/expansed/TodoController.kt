package com.expansed

import com.expansed.domain.Todo
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.*
import io.micronaut.validation.Validated
import java.util.logging.Logger
import javax.inject.Inject

@Validated
@Controller("/todos")
class TodoController() {

    @Inject
    lateinit var todoRepository: TodoRepository

    @Post
    fun add(@Body todo: Todo): Todo {
        //logger.info("Todo add: {}", todo)
        return todoRepository.add(todo)
    }

    @Get("/")
    fun findAll(): List<Todo> {
       // logger.info("Todo find: {}")
        return todoRepository.findAll()
    }

    @Get("/{id}")
    fun findById(id: Long): Todo {
        //logger.info("Todo find: id={}", id)
        return todoRepository
                .findById(id)
    }
}