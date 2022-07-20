package kotlin_leetcode


fun main() {
    countConsistentStrings(
        allowed = "ab",
        words = arrayOf(
            "ad",
            "bd",
            "aaab",
            "baa",
            "badab"
        )
    )
}

fun countConsistentStrings(
    allowed: String,
    words: Array<String>
): Int {
    val n = words.size
    var count = words.size
    val set = mutableSetOf<Char>()
    for (char in allowed)
        set.add(char)
    println(set)
    println(words.contentToString())

    for (str in words) {
        for (char in str) {
            if (!set.contains(char)) {
                count--
                break;
            }
        }
    }

    println(count)
    return count
}

fun countConsistentString(
    allowed: String,
    words: Array<String>
): Int {
    val allowedChars = allowed.toSet()
    return words
        .filter { word ->
            word.all {
                it in allowedChars
            }
        }
        .size
}