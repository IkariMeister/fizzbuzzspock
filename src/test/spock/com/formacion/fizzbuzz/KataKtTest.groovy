package com.formacion.fizzbuzz

import spock.lang.Specification

class KataKtTest extends Specification {
    def "Number is not Fizz"() {
        given: 'a number'
        int number = 22
        expect: 'the number is not fizz and not divisible into 3'
        !KataKt.fizz(number)
        number % 3 != 0
    }

    def "Number is Fizz"() {
        given: 'a number'
        int number = 21
        expect: 'the number is fizz and divisible into 3'
        KataKt.fizz(number)
        number % 3 == 0
    }

    def "Number is not Buzz"() {
        given:
        int number = 22
        expect:
        !KataKt.buzz(number)
        number % 5 != 0
    }

    def "Number is Buzz"() {
        given:
        int number = 20
        expect:
        KataKt.buzz(number)
        number % 5 == 0
    }

    def "Number is not Fizz nor Buzz"() {
        given:
        int number = 22
        expect:
        !KataKt.fizzbuzz(number)
        !KataKt.fizz(number)
        !KataKt.buzz(number)
        number % 5 != 0
        number % 3 !=0
    }

    def "Number is Fizz but Not Buzz"() {
        given:
        int number = 21
        expect:
        !KataKt.fizzbuzz(number)
        KataKt.fizz(number)
        !KataKt.buzz(number)
        number % 3 == 0
        number % 5 != 0
    }

    def "Number is Buzz but Not Fizz"() {
        given:
        int number = 20
        expect:
        !KataKt.fizzbuzz(number)
        !KataKt.fizz(number)
        KataKt.buzz(number)
        number % 3 != 0
        number % 5 == 0
    }

    def "Number is Fizz and Buzz"() {
        given:
        int number = 30
        expect:
        KataKt.fizzbuzz(number)
        KataKt.fizz(number)
        KataKt.buzz(number)
        number % 3 == 0
        number % 5 == 0
    }



    def "Number 2 is not Fizz but not Buzz"() {
        given:
        int number = 2
        when:
        String result = KataKt.kata(number)
        then:
        result.equals(number.toString())
    }

    def "Number 3 is Fizz but not Buzz"() {
        given:
        int number = 3
        when:
        String result = KataKt.kata(number)
        then:
        result.equals("Fizz")
    }

    def "Number 5 is Buzz but not Fizz"() {
        given:
        int number = 5
        when:
        String result = KataKt.kata(number)
        then:
        result.equals("Buzz")
    }

    def "Number 15 is Fizz and Buzz"() {
        given:
        int number = 15
        when:
        String result = KataKt.kata(number)
        then:
        result.equals("FizzBuzz")
    }

}
