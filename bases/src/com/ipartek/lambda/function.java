package com.ipartek.lambda;

import java.util.function.Function;

public class function {
	//Un Function<T, R> 
	//Es una interfaz funcional que toma un argumento de tipo T y devuelve un valor de tipo R.
	//Es útil cuando necesitas transformar o mapear un valor de tipo T en otro valor de tipo R.
public static void main(String[] args) {
	Function<String, Integer> tamañoPalabra = (str) -> str.length();
	System.out.println(tamañoPalabra.apply("manolo"));
}
}

