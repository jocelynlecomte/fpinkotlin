package com.fpinkotlin.functions.exercise04


class Functions

fun square(n: Int) = n * n

fun triple(n: Int) = n * 3

fun <T, U, V> compose(f: (U) -> V, g: (T) -> U): (T) -> V = { f(g(it)) }

typealias IntBinOp = (Int) -> (Int) -> Int

val add: IntBinOp = { a -> { b -> a + b} }

val compose = { f: (Int) -> Int -> { g: (Int) -> Int -> { n: Int -> f(g(n)) } } } // Define a value function composing two (Int) -> Int functions