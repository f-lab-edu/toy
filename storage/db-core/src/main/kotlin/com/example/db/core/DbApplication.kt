package com.example.db.core

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DbApplication

fun main(args: Array<String>) {
    runApplication<DbApplication>(*args)
}
