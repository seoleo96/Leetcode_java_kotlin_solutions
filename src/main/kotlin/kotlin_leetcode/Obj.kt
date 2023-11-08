package kotlin_leetcode

private object Obj {


}



private class A{
    companion object{
        val a = 123
        const val ass  =12
    }
}

interface Fruitable {
    val fruit: String
        get() = "неплодоносный"
}

interface Cultivable : Fruitable {
    fun isFruitable() : Boolean {
        if(fruit == "неплодоносный") return false
        return true
    }
}