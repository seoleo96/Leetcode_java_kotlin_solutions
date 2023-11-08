package kotlin_leetcode

class Lambda {
}

fun main() {
    foo()
}

fun foo() {
    ordinaryFunction {
        return@ordinaryFunction // ERROR: нельзя заставить `foo` завершиться здесь
    }
    (0..10).forEach { _ ->
        return
    }
    println("after ordinary")
}

inline fun ordinaryFunction(crossinline action : () -> Unit){
    noOrdinaryFunction {
        action.invoke()
    }                                                                                                                                                                                                                                                                                                   
}

fun noOrdinaryFunction(action : () -> Unit){
    action.invoke()
}

