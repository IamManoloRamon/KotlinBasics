
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
    myMutableList.removeAt(0)
    println(myMutableList)
    // Invoke method on list
    println("Number of Elements ${myMutableList.size}")
    println("Second Elements ${myMutableList[1]}")
    println("Index of element \"45\" ${myMutableList.indexOf(45)}")

    // Set
    val mySet = setOf("US", "MZ", "AU")
    val myMutableSet = mutableSetOf(1, 2, 3, 4, 5)
    myMutableSet.add(3)
    println(myMutableSet)

    // Map
    val secretMap = mapOf("Up" to 1, "Down" to 2, "Left" to 3, "Right" to 4)
    val myMutableSecretMap = mutableMapOf("One" to 1, "Two" to 2, "Three" to 3)
    myMutableSecretMap["Four"] = 4
    println(myMutableSecretMap)

    if ("Up" in secretMap) println("Yes is in!")
    if (4 in secretMap.values) println("Yes is in!")

    //4. Initializing Lists
    val myNewMutableList = mutableListOf<String>()
    myNewMutableList.add("HEY")
    myNewMutableList.add("THERE")
    for (i in 1..10){
        myNewMutableList.add(i, "Hey $i")
    }
    println(myNewMutableList)

    //5. Empty Collections
    val emptyList = emptyList<String>()
    val emptySet = emptySet<Int>()
    val emptyMap = emptyMap<String, String>()

    //TODO: 6. Collection Filters
    val  found = myListOfNames.filter {
        // it == "Paul"
        // it.length >= 5
        // it.endsWith("l")
        it.startsWith("r", ignoreCase = true) && it.endsWith('L', ignoreCase = true)
    }
    println(myListOfNames)
    println(found)


}