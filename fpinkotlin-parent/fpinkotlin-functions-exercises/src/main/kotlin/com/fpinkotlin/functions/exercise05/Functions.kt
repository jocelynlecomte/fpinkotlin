package com.fpinkotlin.functions.exercise05


class Functions

fun square(n: Int) = n * n

fun triple(n: Int) = n * 3

fun <T, U, V> compose(f: (U) -> V, g: (T) -> U): (T) -> V = { f(g(it)) }

val add: (Int) -> (Int) -> Int = { a -> { b -> a + b} }

val compose = { f: (Int) -> Int -> { g: (Int) -> Int -> { n: Int -> f(g(n)) } } }

fun <T, U, V> higherCompose() = { f: (U) -> V -> { g: (T) -> U -> { x: T -> f(g(x)) } } }

