package com.github.ivnmrtk.simplejpaapp.dao

import java.time.LocalDate
import javax.persistence.*
import javax.validation.constraints.Max
import javax.validation.constraints.NotBlank

@Entity
data class Person (

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,

        @Column(nullable = false)
        @Max(100)
        @NotBlank
        val name: String,

        @Column(nullable = false)
        @Max(100)
        @NotBlank
        val lastName: String,

        @Column(nullable = false)
        val birthDate: LocalDate,

        @ManyToOne
        val documents: List <Document>
)