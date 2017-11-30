package com.formacion.fizzbuzz

fun fizz(number: Int) = number % 3 == 0
fun buzz(number: Int) = number % 5 == 0
fun fizzbuzz(number: Int) = fizz(number) && buzz(number)
fun kata(number: Int) = when {
    fizzbuzz(number) -> "FizzBuzz"
    fizz(number) -> "Fizz"
    buzz(number) -> "Buzz"
    else -> number.toString()
}

fun kata(numbers: List<Int>) = StringBuilder()
        .append(numbers.map {
            kata(it)
        })
        .toString()