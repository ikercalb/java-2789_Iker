package com.ipartek.lambda;

import java.util.function.Function;

public class function {
public static void main(String[] args) {
	Function<String, Integer> tamañoPalabra = (str) -> str.length();
	System.out.println(tamañoPalabra.apply("manolo"));
}
}




Un Function<T, R> es una interfaz funcional que toma un argumento de tipo T y devuelve un valor de tipo R. Es útil cuando necesitas transformar o mapear un valor de tipo T en otro valor de tipo R.






Un BiFunction<T, U, R> es una interfaz funcional que toma dos argumentos, uno de tipo T y otro de tipo U, y devuelve un valor de tipo R. Es útil cuando necesitas realizar operaciones que involucran dos entradas.

BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
System.out.println(sum.apply(5, 3));  // Imprime 8




Un Predicate<T> es una interfaz funcional que toma un argumento de tipo T y devuelve un valor booleano. Se utiliza para realizar pruebas o evaluaciones sobre un valor.


import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        // Predicate que verifica si un número es mayor que 10
        Predicate<Integer> isGreaterThanTen = (num) -> num > 10;
        System.out.println(isGreaterThanTen.test(15));  // Imprime true
        System.out.println(isGreaterThanTen.test(5));   // Imprime false
    }
}
