package kyu7

// https://www.codewars.com/kata/511f11d355fe575d2c000001

fun twoOldestAges(ages: List<Int>) = ages
   .sorted()
   .takeLast(2)
