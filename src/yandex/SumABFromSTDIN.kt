package yandex

import java.util.Scanner

class DirectorWalk {
    companion object {
        fun countDoublePraised(route: String): Int {
            val visited = mutableMapOf<Pair<Int, Int>, Int>()
            var x = 0
            var y = 0
            visited[Pair(x, y)] = 1
            var count = 0

            for (direction in route) {
                when (direction) {
                    'U' -> y++
                    'R' -> x++
                    'D' -> y--
                    'L' -> x--
                }
                val current = Pair(x, y)
                val newValue = visited.getOrDefault(current, 0) + 1
                println(newValue)
                visited[current] = newValue
                if (newValue > 1) {
                    count++
                }
            }
            return count
        }
    }
}

fun main() {
    val test = readln()
    val result = DirectorWalk.countDoublePraised(test)
    println(result) // Вывод: количество повторных посещений
}