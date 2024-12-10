package com.ipartek.ejercicios.avanzados;

import java.util.Arrays;

public class biblioteca {

	private static Libro libros[];
	private static Integer indice = 0;
	
	
	public biblioteca() {
		libros = new Libro[100];
	}
	
	
	public void indice() {
		
		System.out.println(indice);
	}
	
	public boolean nuevoLibro(Libro libro) {
		if((indice<100)) {
			libros[indice] = libro;
			indice ++;
			return true;
		}
		System.out.println("Falta de espacio");
		return false;
	}
	
	
	public boolean eliminarLibro(String referencia) {
		var p = encontrarLibroReferencia(referencia);
		
		if(p>0) {
			for (int i = p; i < indice; i++) {
				libros[i] = libros[i+1];
			}
		}
		
		return false;
	}
	
	public boolean eliminarLibro(Integer pos) {
		
		if(pos>0) {
			for (int i = pos; i < indice; i++) {
				libros[i] = libros[i+1];
			}
		}
		
		return false;
	}
	
	
	public void mostrartodos() {
		
		
		for (int i = 0; i < indice; i++) {
			if(libros[i]!=null) {
			System.out.println("posicion: "+ i +" "+libros[i]);
			}
		}
	}
	
	
	
	
	public Integer encontrarLibroReferencia(String referencia) {
		
		for (int i = 0; i < indice; i++) {
		
            if (libros[i].getReferencia() == referencia) {
   
                System.out.println(i);
                
                return i;
            }
	}
		System.out.println("Libro no encontrado");
		return -1;
}
	public Integer disponibles() {
		System.out.println(100-indice);
		return 100-indice;
	}
	

	public static boolean encontrar(String referencia) {
		
		for (int i = 0; i < indice; i++) {
			
            if (libros[i].getReferencia() == referencia) {
                return true;
            }
		
	}
		return false;	
}
	
	
	public Libro encontrarlibro(String referencia) {
		
		for (int i = 0; i < indice; i++) {
			
            if (libros[i].getReferencia() == referencia) {
                return libros[i];
            }
		
	}
		return null;		
	}
	
	@Override
	public String toString() {
		return "biblioteca =" + Arrays.toString(libros);
	}


	public static void main(String[] args) {
		
		var b = new biblioteca();
		b.nuevoLibro(new Libro("l000", "Harry Potter y la piedra filosofal", "J.K. Rowling", 25, 8));
		b.nuevoLibro(new Libro("l001", "El código Da Vinci", "Dan Brown", 18, 9));
		b.nuevoLibro(new Libro("l002", "El misterio de la luna", "Julia Fernández", 5, 4));
		b.nuevoLibro(new Libro("l003", "La sombra del viento", "Carlos Ruiz Zafón", 10, 3));
		b.nuevoLibro(new Libro("l004", "Cuentos de hadas", "Ana Martínez", 7, 1));
		b.nuevoLibro(new Libro("l005", "La casa de papel", "Antonio García", 8, 6));
		b.nuevoLibro(new Libro("l006", "El principito", "Antoine de Saint-Exupéry", 15, 10));
		b.nuevoLibro(new Libro("l007", "1984", "George Orwell", 6, 2)); 
		b.nuevoLibro(new Libro("l008", "El Alquimista", "Paulo Coelho", 12, 3));
		b.nuevoLibro(new Libro("l009", "Los pilares de la tierra", "Ken Follett", 20, 4)); 
	
		System.out.println(b);
		
	}
	
}
