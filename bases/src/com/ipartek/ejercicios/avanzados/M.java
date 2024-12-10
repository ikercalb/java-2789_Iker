package com.ipartek.ejercicios.avanzados;

import java.util.Scanner;

public class M {
	static String referencia;
	static String titulo;
	static String autor;
	static Integer ejemplares;
	static Integer prestados;
	static int opcion;
	static biblioteca biblioteca = new biblioteca();
	static Scanner sc = new Scanner(System.in);
	static menu menu = new menu();

	public static void main(String[] args) {

		do {
			menu.mostrar();
			opcion = menu.leer();
			System.out.println(opcion);

			switch (opcion) {
			case 1 -> libroNuevo();
			case 2 -> mostrarLibros();
			case 3 -> buscarLibros();
			case 4 -> darDeBajaLibroPorReferencia();
			case 5 -> darDeBajaLibroPorPosicion();
			case 6 -> realizarPrestamo();
			case 7 -> realizarDevolucion();
			case 8 -> mostrarLibrosDisponibles();
			}

		} while (opcion != 0);
		System.out.println("Fin del programa");
	}
	
	
	public static void libroNuevo() {
       
            System.out.println("\nIntroduzca los datos del libro");
            String referencia, titulo, autor;
            int ejemplares;
            System.out.print("Referencia: ");
            referencia = sc.nextLine();
            if (!biblioteca.encontrar(referencia)) {
                System.out.print("Título: ");
                titulo = sc.nextLine();
                System.out.print("Autor: ");
                autor = sc.nextLine();
                System.out.print("Número de ejemplares: ");
                ejemplares = sc.nextInt();
                sc.nextLine();
                Libro libro = new Libro(referencia, titulo, autor, ejemplares, 0);
                biblioteca.nuevoLibro(libro);
            } else {
                System.out.println("Ya existe un libro con esa referencia");
            }
        }
    

/*	public static void libroNuevo() {

		System.out.print("Ingrese la referencia: ");
		referencia = sc.next();
		System.out.print("Ingrese el título: ");
		titulo = sc.next();
		System.out.print("Ingrese el autor: ");
		autor = sc.next();
		System.out.print("Ingrese el número de ejemplares: ");
		ejemplares = Integer.parseInt(sc.next());
		System.out.print("Ingrese el número de prestados: ");
		prestados = Integer.parseInt(sc.next());

		if (!biblioteca.encontrar(referencia)) {
			biblioteca.nuevoLibro(new Libro(referencia, titulo, autor, ejemplares, prestados));
		} else {
			System.out.println("El libro ya está en la biblioteca");
		}

	}
*/


	public static void mostrarLibros() {

	}

	public static void buscarLibros() {

	}

	public static void darDeBajaLibroPorReferencia() {

	}

	public static void darDeBajaLibroPorPosicion() {

	}

	public static void realizarPrestamo() {

	}

	public static void realizarDevolucion() {

	}

public static void mostrarLibrosDisponibles() {

}
}