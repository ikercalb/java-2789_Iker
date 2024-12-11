package com.ipartek.lambda;

import java.util.function.BiFunction;

public class biFunction {
	public static void main(String[] args) {
		//Un BiFunction<T, U, R> 
		//Es una interfaz funcional que toma dos argumentos, uno de tipo T y otro de tipo U, y devuelve un valor de tipo R.
		//Es útil cuando necesitas realizar operaciones que involucran dos entradas.

		BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
		System.out.println(sum.apply(5, 3));
	}
}
