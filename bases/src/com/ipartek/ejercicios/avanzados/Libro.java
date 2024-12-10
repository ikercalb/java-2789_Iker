package com.ipartek.ejercicios.avanzados;

public class Libro {
	private String referencia;
	private String titulo;
	private String autor;
	private Integer ejemplares;
	private Integer prestados;
	
	
	public Libro() {
		
	}
	
	public Libro(String referencia, String titulo, String autor, Integer ejemplares, Integer prestados) {
		setReferencia(referencia);
		setTitulo(titulo);
		setAutor(autor);
		setEjemplares(ejemplares);
		setPrestados(prestados);
	}
	
	public Libro(Libro libro) {
		this(libro.getReferencia(),libro.getTitulo(),libro.getAutor(),libro.getEjemplares(),libro.getPrestados());
	}
	

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Integer getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(Integer ejemplares) {
		this.ejemplares = ejemplares;
	}

	public Integer getPrestados() {
		return prestados;
	}

	public void setPrestados(Integer prestados) {
		this.prestados = prestados;
	}

	@Override
	public String toString() {
		return "referencia=" + referencia + ", titulo=" + titulo + ", autor=" + autor + ", ejemplares="
				+ ejemplares + ", prestados=" + prestados;
	}
	
	public boolean prestamo() {
		  if (this.prestados < this.ejemplares) {
	            this.prestados += 1;
	            return true;
	        }
		  	
	        return false;
	}
	
	public boolean devolucion() {
		 if (this.prestados > 0 ) {
	            this.prestados -= 1;
	            return true;
	        }
		  	
	        return false;
	}
	
	public boolean estaDisponible() {
		 if (this.prestados < this.ejemplares) {
			 
	            return true;
	        }
		  	
	        return false;
	}
	
	public Integer ejemplaresDisponibles() {
		return(this.ejemplares-this.prestados);
	}
	
	
}
