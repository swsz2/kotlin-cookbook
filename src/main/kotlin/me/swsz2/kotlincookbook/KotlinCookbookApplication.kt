package me.swsz2.kotlincookbook

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinCookbookApplication

fun main(args: Array<String>) {
    runApplication<KotlinCookbookApplication>(*args)
}
