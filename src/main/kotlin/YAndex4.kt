fun main() {
    val s = readln()
    val c1 = s.count { it == 's' }
    val c2 = s.count { it == 'h' }
    val c3 = s.count { it == 'e' }
    val c4 = s.count { it == 'r' }
    val c5 = s.count { it == 'i' }
    val c6 = s.count { it == 'f' } / 2
    print(minOf(c1, c2, c3, c4, c5, c6))
}