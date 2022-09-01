
fun main(args: Array<String>) {
    // intro to class and constructor
    val car = Car(color = "Green", model = "FMH")
    val secondCar = Car(color = "Brown", "AAA")
    println("Car color is ${car.color} model: ${car.model}")
    println("Car color is ${secondCar.color} model: ${secondCar.model}")


    //TODO: 4. Adding a class Function with Parameters
}

class Car(var color: String, var model: String) {
    //The init block
    init {
       if (color == "Green") {
           println("Color is Green")
       } else {
           println("$color is not green")
       }
    }

    fun drive(){
        println("Drive....")
    }
}