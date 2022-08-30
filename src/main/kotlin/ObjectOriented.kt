
fun main(args: Array<String>) {
    // intro to class and constructor
    val car = Car(color = "Green", model = "FMH")

    println("Car color is ${car.color} model: ${car.model}")

    //TODO: The init block
}

class Car(var color: String = "Red", var model: String = "XMD") {


    fun drive(){
        println("Drive....")
    }
}