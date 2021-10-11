//User can input info to program and enter information with option of business or residential
var businessName = "Business"
var name = "Name"
var number = "123-456-7890"

fun main() {

    println(" -- Contact Form -- ")
    println("1. Residential")
    println("2. Business")
    print("\nOption?: ")

    when (readLine()!!.toInt()) {
        1 -> residential()
        2 -> business()
        !in 1..2 -> println("Not an option...")
        else -> println("Error.")
    }
}

fun residential() {
    print("Name: ")
    name = readLine()!!.toString()

    print("Number: ")
    number = readLine()!!.toString()

    contact(name, number)
}

fun business() {
    print("Business: ")
    businessName = readLine()!!.toString()

    print("Name: ")
    name = readLine()!!.toString()

    print("Number: ")
    number = readLine()!!.toString()

    contact(businessName, name, number)
}

fun contact(name: String, number: String) {
    println("\nThank you for your contact information")
    println("Name: $name")
    println("Phone Number: $number")
}

fun contact(business: String, name: String, number: String) {
    println("\nThank you for your contact information")
    println("Business: $business")
    println("Name: $name")
    println("Phone Number: $number")
}