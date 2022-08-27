
fun main(args: Array<String>) {

    val myListOfNames = listOf("James", "Paul", "Rafael", "Gina")
    print(myListOfNames)

    for (name in myListOfNames) {
        println("Names: $name")
    }

    myListOfNames.forEach {
        println(it)
    }
    myListOfNames.forEach(showName)

    val myMutableList = mutableListOf(12, 34, 45, 123)
    myMutableList.add(254)
    println(myMutableList)
}