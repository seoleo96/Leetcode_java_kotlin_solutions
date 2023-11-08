import kotlinx.coroutines.*

val handler = CoroutineExceptionHandler { coroutineContext, throwable ->
    println(throwable.toString())
    println(coroutineContext[CoroutineName])
}

fun main() = runBlocking {

    val deferred = CoroutineScope(Dispatchers.IO).async(start = CoroutineStart.LAZY) {
        repeat(10) {
            if (isActive) {
                println("launching - $it")
                delay(500)
            } else {
                println("not active")
                return@async
            }
        }
    }

    delay(1500)
    println(deferred.isActive)
    println(deferred.isCompleted)
    println(deferred.isCancelled)
    deferred.cancel() 
    deferred.await()
}