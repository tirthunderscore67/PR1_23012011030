//1.1
//fun main() {
//    val myInt: Int = 100
//    val myDouble: Double = 99.99
//    val myFloat: Float = 12.34F
//    val myLong: Long = 123456789L
//    val myShort: Short = 32000
//    val myByte: Byte = 127
//    val myChar: Char = 'A'
//    val myBoolean: Boolean = true
//    val myString: String = "Hello, Kotlin!"
//
//    println("Integer Value (Int): $myInt")
//    println("Double Value (Double): $myDouble")
//    println("Float Value (Float): $myFloat")
//    println("Long Value (Long): $myLong")
//    println("Short Value (Short): $myShort")
//    println("Byte Value (Byte): $myByte")
//    println("Character Value (Char): $myChar")
//    println("Boolean Value (Boolean): $myBoolean")
//    println("String Value (String): $myString")
//}

//1.2Type Conversion: Perform type conversions such as Integer to Double, String to Integer, and String to Double.
/*fun main() {
    // String to Double
    val a: String = "54"
    val b = a.toDouble()
    println("String a = $a")
    println("Converted to Double b = $b")

    // String to Integer
    val c: String = "123"
    val d = c.toInt()
    println("String c = $c")
    println("Converted to Int d = $d")

    // Integer to Double
    val e: Int = 75
    val f = e.toDouble()
    println("Int e = $e")
    println("Converted to Double f = $f")
}
}*/


//1.3.	Scan student’s information and display all the data: Input and display data of students, including their name, enrolment no, branch,etc.
/*fun main(){
    print("Enter Your Enrollment : ")
    val enString = readLine()
    val enroll = enString?.toLong()
    print("Enter your Name : ")
    val name = readLine()
    print("Enter Your Branch : ")
    val branch = readLine()
    print("Enter Your Class : ")
    val c = readLine()
    print("Enter Your Batch : ")
    val batch = readLine()
    print("Enter Your College Name : ")
    val coll = readLine()
    print("Enter Your University Name: ")
    val uni = readLine()
    print("Enter Your Age : ")
    val ageString = readLine()
    val age = ageString?.toInt()
    println("Student`s Data")
    println("Student Enrollment : $enroll")
    println("Student name : $name")
    println("Student Branch : $branch")
    println("Student Class : $c")
    println("Student College Name : $coll")
    println("Student University Name : $uni")
    println("Student Age : $age")

}*/
//1.4.	Check Odd or Even Numbers: Determine whether a number is odd or even using control flow within println() method.
/*fun main(){
    println("Enter the Number ; ")
    var noString = readLine()
    var num=noString?.toLong()
    if ((num % 2) === 0){
        print("Its an even number : $num")
    }else{
        print("its an odd number : $num")
    }

}*/
//1.5 Display Month Name: Use a when expression to display the month name based on user input.
//fun main() {
//    print("Enter Month Number: ")
//    val choice =readln().toString()
//    when (choice) {
//          "1" -> print("January")
//        "2" -> print("February")
//        "3" -> print("March")
//        "4" -> print("April")
//        "5" -> print("May")
//        "6" -> print("June")
//        "7" -> print("July")
//        "8" -> print("August")
//        "9" -> print("September")
//        "10" -> print("October")
//        "11" -> print("November")
//        "12" -> print("December")
//        else -> print("Enter Valid Month Number")
//
//
//    }
//}
//1.6.	User-Defined Function: Create a user-defined function to perform arithmetic operations (addition, subtraction, multiplication, division) on two numbers
/*fun main() {
    println("Choose Num 1")
    println("Choose Num 2")
    val x = readln().toDouble()
    val y = readln().toDouble()
    println("Addition Of $x , $y is ${x + y}")
    println("Substraction Of $x , $y is ${x - y}")
    println("Multiplication Of $x , $y is ${x * y}")
    println("Division Of $x , $y is ${x / y}")

}*/

//1.7 Factorial Calculation with Recursion: Calculate the factorial of a number using recursion.
/*fun factorial(n: Int): Int {
    if (n <= 0) {
        return 1}
   else{ return n * factorial(n - 1)
   }
}*/
/*fun main (args: Array<String>) {
    val x = readLine()!!.toInt()
    var result = factorial(x)
    println("The Factorial of $x is $result")
}

//1.8.	Working with Arrays: Explore array operations such as Arrays.deepToString(), contentDeepToString(), IntArray.joinToString(), and use them to print arrays. Utilize various loop types like range, downTo, until, etc., to manipulate arrays. Sort an array of integers both without using built-in functions and with built-in functions.
// Array Using arrayof()
fun main() {
    // Basic arrays
    val A = arrayOf(10, 90, 60, 80, 100)
    println(A.joinToString())
    val B = Array(5) { 0 }
    println(B.joinToString(":"))

    // Nested array operations
    val nested = arrayOf(arrayOf(1, 2), arrayOf(3, 4))
    println(Arrays.deepToString(nested))
    println(nested.contentDeepToString())

    // Loops
    for (i in 0..A.lastIndex) print("${A[i]} ")
    println()
    for (i in A.lastIndex downTo 0) print("${A[i]} ")
    println()
    for (i in 0 until A.size) print("${A[i]} ")
    println()
    for (v in A) print("$v ")
    println()

    // Sorting without built-in function (bubble sort)
    val unsorted = arrayOf(25, 10, 45, 20, 5)
    for (i in 0 until unsorted.size - 1)
        for (j in 0 until unsorted.size - i - 1)
            if (unsorted[j] > unsorted[j + 1]) {
                val temp = unsorted[j]; unsorted[j] = unsorted[j + 1]; unsorted[j + 1] = temp
            }
    println(unsorted.joinToString())

    // Sorting with built-in function
    val arr = arrayOf(33, 11, 55, 22, 44)
    arr.sort()
    println(arr.joinToString())
}

*/
//1.9.Find Maximum Number from ArrayList: Write a program to find the maximum number from an ArrayList of integers.
// fun main() {
//    val numbers = arrayListOf(10, 45, 3, 76, 23, 89, 5)
//
//    if (numbers.isNotEmpty()) {
//        var maxNumber = numbers[0]
//        for (num in numbers) {
//            if (num > maxNumber) {
//                maxNumber = num
//            }
//        }
//        println("Maximum number is: $maxNumber")
//    } else {
//        println("The list is empty.")
//    }
//}
//1.10.Class and Constructor Creation: Define different classes and constructors. Create a "Car" class with properties like type, model, price, owner, and miles driven. Implement functions to get car information, original car price, current car price, and display car information
// Car class with primary constructor
//class Car(
//    val type: String,
//    val model: String,
//    private val price: Int,
//    var owner: String,
//    var milesDriven: Int
//) {
//    // Function to return original price
//    fun getOriginalPrice(): Int {
//        return price
//    }
//
//    // Function to return current price after depreciation
//    fun getCurrentPrice(): Int {
//        // Simple depreciation logic: $1 per mile
//        val depreciation = milesDriven * 1
//        val currentPrice = price - depreciation
//        return if (currentPrice < 0) 0 else currentPrice
//    }
//
//    // Function to display car information
//    fun displayCarInfo() {
//        println("Car Information:")
//        println("Type: $type")
//        println("Model: $model")
//        println("Owner: $owner")
//        println("Miles Driven: $milesDriven")
//        println("Original Price: \$${getOriginalPrice()}")
//        println("Current Price: \$${getCurrentPrice()}")
//    }
//}
//fun main() {
//    val car1 = Car("Sedan", "Toyota Camry", 20000, "Alice", 15000)
//    val car2 = Car("SUV", "Ford Explorer", 30000, "Bob", 22000)
//
//    car1.displayCarInfo()
//    println()
//    car2.displayCarInfo()
//}
//11.Operator Overloading and Matrix Operations: Explain operator overloading and implement matrix addition, subtraction, and multiplication using a "Matrix" class. Overload the toString() function in the "Matrix" class for customized output.
class Matrix(private val rows: Int, private val cols: Int, private val data: Array<IntArray>) {

    init {
        require(data.size == rows && data.all { it.size == cols }) {
            "Matrix dimensions do not match the provided data."
        }
    }

    // Operator overloading for matrix addition
    operator fun plus(other: Matrix): Matrix {
        require(this.rows == other.rows && this.cols == other.cols) {
            "Matrices must be of the same dimensions for addition."
        }

        val result = Array(rows) { IntArray(cols) }
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result[i][j] = this.data[i][j] + other.data[i][j]
            }
        }
        return Matrix(rows, cols, result)
    }

    // Operator overloading for matrix subtraction
    operator fun minus(other: Matrix): Matrix {
        require(this.rows == other.rows && this.cols == other.cols) {
            "Matrices must be of the same dimensions for subtraction."
        }

        val result = Array(rows) { IntArray(cols) }
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result[i][j] = this.data[i][j] - other.data[i][j]
            }
        }
        return Matrix(rows, cols, result)
    }

    // Operator overloading for matrix multiplication
    operator fun times(other: Matrix): Matrix {
        require(this.cols == other.rows) {
            "For multiplication, number of columns in first matrix must equal number of rows in second matrix."
        }

        val result = Array(this.rows) { IntArray(other.cols) }
        for (i in 0 until this.rows) {
            for (j in 0 until other.cols) {
                for (k in 0 until this.cols) {
                    result[i][j] += this.data[i][k] * other.data[k][j]
                }
            }
        }
        return Matrix(this.rows, other.cols, result)
    }

    // Overriding toString() for custom display
    override fun toString(): String {
        return data.joinToString("\n") { row ->
            row.joinToString(" ") { "%4d".format(it) }
        }
    }
}
fun main() {
    val matrix1 = Matrix(2, 2, arrayOf(
        intArrayOf(1, 2),
        intArrayOf(3, 4)
    ))

    val matrix2 = Matrix(2, 2, arrayOf(
        intArrayOf(5, 6),
        intArrayOf(7, 8)
    ))

    val matrix3 = Matrix(2, 3, arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6)
    ))

    val matrix4 = Matrix(3, 2, arrayOf(
        intArrayOf(7, 8),
        intArrayOf(9, 10),
        intArrayOf(11, 12)
    ))

    println("Matrix 1:\n$matrix1")
    println("\nMatrix 2:\n$matrix2")
    println("\nMatrix 1 + Matrix 2:\n${matrix1 + matrix2}")
    println("\nMatrix 1 - Matrix 2:\n${matrix1 - matrix2}")

    println("\nMatrix 3:\n$matrix3")
    println("\nMatrix 4:\n$matrix4")
    println("\nMatrix 3 * Matrix 4:\n${matrix3 * matrix4}")
}

