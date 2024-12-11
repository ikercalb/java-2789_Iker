package com.ipartek.lambda;

import java.util.function.Predicate;

public class predicate {
public static void main(String[] args) {

	//Un Predicate<T>
	//Es una interfaz funcional que toma un argumento de tipo T y devuelve un valor booleano.
	//Se utiliza para realizar pruebas o evaluaciones sobre un valor.


	Predicate<Integer> isGreaterThanTen = (num) -> num > 10;
    System.out.println(isGreaterThanTen.test(15));
}
}
