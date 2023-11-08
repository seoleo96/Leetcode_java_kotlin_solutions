fun main(args: Array<String>) {
}

class Box<out T>(val a: T) {
    val mut: List<T> = mutableListOf<T>()
    fun process(): T {
        //как то работаем с числами тут
        return mut.last()
    }
}


class Crate<T> {
    private val items = mutableListOf<T>()
    fun produce(): T = items.last()
    fun consume(item: T) = items.add(item)
    fun size(): Int = items.size
}

class Fruit {
    fun getColor() {}

}

class Orange {
    fun getColor() {}
}

fun useAsProducer(producer: Crate<out Fruit>) {
    // T is known to be out Fruit, so produces Fruit and its subtypes.
    val fruit = producer.produce()           // OK
    // Fruit is guaranteed. Can use functions and properties of Fruit.
    fruit.getColor()                         // OK
    // Consumer not allowed because you don't want to accidentally add
    // oranges, if this is a Crate<Apple>
//    producer.consume(Fruit())               // Error
}

fun get(a: List<*>) {
    val b = a.first()
}

fun acceptConsumer(consumer: Consumer<Int>) {
    consumer.accept(1)
}

fun interface Consumer<in T> {
    fun accept(data: T)
}

