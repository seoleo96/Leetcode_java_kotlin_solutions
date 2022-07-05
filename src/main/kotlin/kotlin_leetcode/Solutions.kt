package kotlin_leetcode

fun main() {
    val numbs = intArrayOf(2, 5, 1, 3, 4, 7)
    val size = numbs.size
    var j = 0
    var n = numbs.size / 2
    val ans = IntArray(size)
    println(ans.contentToString())
    for ((i, _) in numbs.withIndex()) {
        if (i % 2 == 0) ans[i] = numbs[j++]
        else ans[i] = numbs[n++]
    }

}