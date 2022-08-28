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
    val amount = 0
    if (amount >= 1000) {
        println("Wow... you are very wealthy!")
    } else {
        println("You are getting by")
    }

    when (amount) {
        in 1..100 -> println("This amount is between 1 and 100")
        !in 10..90 -> println("This amount is outside the range")
        999 -> println("Really Close")
        1000 -> println("Rich but not there...")
        1100 -> println("You've made it!")
        else -> {
            println("$amount is just not going to work")
        }
    }

    //For Loops
    for (i in 1..1000) {
        if (i % 3 == 0) println("$i is multiple of 3") else println("---")
    }

    //Functions - 7. Returning a Boolean
    calculate(1, 10,"is multiple of", 3)
    calculate(message = "Hello there!", multipleOf = 12)

    val  catAge = calculateCatAge(age = 12) * 10
    if (checkAge(catAge))
        println("This cat is old ($catAge)")
    else
        println("This cat is young ($catAge)")

    // Lambda function
    println(sum(2, 5))
    println(add(2, 5))

    // Lambda expression return a Unit or Void
    showName("Paul")

    // Trailing Lambda
    enhanceMessage("Hello there,") {
        println(it)
        add(12, 12)
    }

    //2. Invoking Methods on Lists
}

fun enhanceMessage(message: String, funAsParameter: (String) -> Int) {
    println("$message ${funAsParameter("Hey")}")
}

val showName: (String) -> Unit = { println("Hello my name is $it") }

fun sum(a: Int, b: Int): Int {
   return a + b
}

// Convert to lambda function
var add: (Int, Int) -> Int = { a, b -> a + b}

fun calculateCatAge(age: Int): Int = age * 7
// Convert to lambda
val calcAge: (Int) -> Int = { age -> age * 7}
// Modification of Lambda
val calAge1: (Int) -> Int =  {
    it * 7 }
fun checkAge(age: Int): Boolean {
    return age > 14
}

fun calculate(from: Int = 10, to: Int = 100, message: String, multipleOf: Int) {
    for (i in from..to) {
        if (i % multipleOf == 0) {
            println("$i $message $multipleOf")
        }
    }
}

