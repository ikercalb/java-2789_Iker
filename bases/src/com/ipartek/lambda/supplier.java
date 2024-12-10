package com.ipartek.lambda;

import java.util.function.Supplier;

public class supplier {
	 public static void main(String[] args) {
		 
		 //Supplier<T>
		 //Es una interfaz funcional que no toma ningún argumento y devuelve un valor de tipo T. 
		 //Es útil cuando necesitas generar o proporcionar un valor sin recibir nada como entrada
		 
		 // Supplier que proporciona un valor cada vez que se ejecuta 
	        Supplier<Double> randomnum = () -> Math.random();
	        System.out.println(randomnum.get()); 
	    }
	}