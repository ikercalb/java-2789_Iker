package com.ipartek.ejercicios.avanzados;

import java.util.Scanner;

public class menu {
	
	private Integer opcion;
	
	 public void mostrar() {
	        System.out.println("1. Nuevo libro");
	        System.out.println("2. Mostrar todos los libros");
	        System.out.println("3. Buscar libros");
	        System.out.println("4. Bajas de libros por referencia");                                                  
	        System.out.println("5. Bajas de libros por posición");
	        System.out.println("6. Préstamo");
	        System.out.println("7. Devolución");
	        System.out.println("8. Mostrar libros disponibles");
	        System.out.println("0. FIN");
	    }
	 
	 public int leer() {
	        try (Scanner sc = new Scanner(System.in)) {
				do {
				    System.out.print("Introduzca opción: ");
				    opcion = sc.nextInt();
				} while (opcion < 0 || opcion > 8);
			}
	        return opcion;
	        
	    }
}
