package yandex

import java.io.Closeable
import java.io.File

fun <T : Closeable, R> T.useWith(block: T.() -> R): R = use { with(it, block) }

fun main() {
    File("input.txt").bufferedReader().useWith {
        val (a, b) = readLine().split(' ').map(String::toInt)
        File("output.txt").printWriter().useWith {
            println(a + b)
        }
    }
}