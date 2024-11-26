package leetcode.arrays_hash

class Test {


}

fun main() {
    val list1: MutableList<Any> = mutableListOf(1,2,3,4, "")
    val list2: List<Any> = listOf<Any>(1,2,3,4, "")
    eatList(list1)
    eatList(list2)
    val arr1: Array<Any> = arrayOf(1,2,3,4, "")
    val arr2: Array<Int> = arrayOf<Int>(1,2,3,4)
    eatArray(arr1)
}

fun eatArray(list : Array<Any>) {

}

fun eatList(list : List<Any>) {

}

interface InBox<in T> {
    fun put(e : T)
    //fun put(e : T) : T ->CompileError
}

interface OutBox<out T> {
    fun get() : T
    //fun get(e : T) : T ->CompileError
}

interface UniversalBox<T> {
    fun addAndGet(e : T) : T // in or out
}