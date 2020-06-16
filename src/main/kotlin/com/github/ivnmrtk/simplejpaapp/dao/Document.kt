package com.github.ivnmrtk.simplejpaapp.dao

import javax.persistence.*

@Entity
data class Document(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,

        @Column(nullable = false)
        val series: String,

        @Column(nullable = false)
        val number: String
)