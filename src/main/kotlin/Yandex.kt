fun main(args : Array<String>) {
    val marks = readln().split(" ").map { it.toLong() }.sorted()
    println(marks)
    val result = marks[1]
    println(result)
}

fun main1(){
    val n = readln().toInt()
    var event: String
    var all = 0.0
    var crashed = 0.0

    for (i in 0 until n){
        event = readln()
        readln()
        if (event == "APPLICATION_FINISHED_LAUNCHING"){
            all += 1
            crashed += 1
        }
        if (event == "APPLICATION_TERMINATED"){
            crashed -= 1
        }
    }

    println(crashed / all * 100)
}

fun main(args : String) {
    val n = readLine()!!.toInt()
    val nums = readLine()!!.split(" ").map{ it.toInt() }

    val mex = 1
    var a = 0
    var ans = 0L

    for (num in nums) {
        if (num != mex) {
            a += 1
        } else {
            if (a != 0) {
                ans += (((1.0 + a.toDouble()) / 2.0) * a.toDouble()).toLong()
                a = 0
            }
        }
    }

    if (a != 0) {
        ans += (((1.0 + a.toDouble()) / 2.0) * a.toDouble()).toLong()
    } else {
        if (ans == 0L) {
            ans = (((1.0 + n.toDouble()) / 2.0) * n.toDouble()).toLong()
        }
    }

    println(ans)
}
