package com.ipartek.lambda;

import java.util.function.Consumer;

public class consumer {
	public static void main(String[] args) {
		//Consumer<T>
		
		//es una interfaz funcional que toma un solo argumento de tipo T y no devuelve ningún valor.
		//Se utiliza cuando deseas realizar una acción con un objeto pero no necesitas devolver nada.
		
		Consumer<String> Printnombre = (str) -> System.out.println("Hola "+str);
		Printnombre.accept("manolo");
		
		
	}

}
