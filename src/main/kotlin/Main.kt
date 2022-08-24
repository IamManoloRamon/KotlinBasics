/**
 * This is a documentation-style comment.
 * You can reference things here, like the [main] function.
 * You can also reference parameters, like the [args].
 *
 * @param args
 * @author Manolo
 * */
fun main(args: Array<String>) {
    // Variables
    var myAge: Int = 46
    val name: String = "Manolo Ramon"
    val lastName = "Manatlao"
    val weight = 72.2

    println(name)
    println("I am $myAge years old.")

    myAge++
    println("My age next year is $myAge")
    println("$name $lastName is $myAge years old, and weights $weight kg")

    val fullName = "$lastName, $name"
    println(fullName)

    val ageAsString: String = myAge.toString()
    println(ageAsString)

    val ageFromString: Int = "46".toInt()
    println(ageFromString)

    val nameLength: Int = fullName.length
    println(nameLength)

    // booleans, comparison and operators
    val isProgrammingAwesome = true
    println("Is programming awesome? $isProgrammingAwesome")

    val isLegalDrivingAge: Boolean = myAge >= 18
    println(isLegalDrivingAge)

    val ageTim = 23
    val isTimOlder: Boolean = ageTim > myAge
    println(isTimOlder)
    println(!isTimOlder)

    val firstObject = Any()
    val secondObject = Any()

    println(firstObject === secondObject)
    println(firstObject !== secondObject)

    val isNameEmpty = name.isEmpty();
    println(isNameEmpty)

    // Conditional statement
    val amount = 50
    if (amount >= 1000) {
        println("Wow... you are very wealthy!")
    } else {
            println("You are getting by")
    }

    when(amount) {
        100 -> print("You have 100")
        125 -> print("You are getting there...")
        999 -> print("Really Close")
        1000 -> print("Rich but not there...")
        1100 -> print("You've made it!")
        else -> {
            print("$amount is just not going to work")
        }
    }
}