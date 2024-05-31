package jp.ac.it_college.std.s23016.practice.chap3

import java.time.LocalDateTime
import java.util.UUID

fun main() {
    val uuid: UUID = UUID.randomUUID()
    println(uuid)

    val now = LocalDateTime.now()
    println(now)
}