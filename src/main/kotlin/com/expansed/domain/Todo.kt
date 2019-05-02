package com.expansed.domain

import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime
import javax.persistence.*

@Entity
data class Todo(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    val name: String,

    @CreationTimestamp
    val createdDateTime: LocalDateTime?,

    @UpdateTimestamp
    val updatedDateTime: LocalDateTime?
)