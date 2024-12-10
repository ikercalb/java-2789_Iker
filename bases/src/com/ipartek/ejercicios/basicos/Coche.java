package com.ipartek.ejercicios.basicos;

public class Coche {
//atrícula (String), marca (String), año de matriculación (int), eléctrico (boolean).
	private String matricula;
	private String marca;
	private Integer ano_matr;
	private Boolean electrico;
	
	//por defecto
	public Coche() {}
	
	//clase
	public Coche(String matricula, String marca, Integer ano_matr,Boolean electrico) {
		this.matricula = matricula;
		this.marca = marca;
		this.ano_matr = ano_matr;
		this.electrico = electrico;
		
	}
	//copia
	public Coche(Coche coche) {
		this(coche.getMatricula(),coche.matricula,coche.getAno_matr(),coche.getElectrico());
	}
	
	
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Integer getAno_matr() {
		return ano_matr;
	}
	public void setAno_matr(Integer ano_matr) {
		this.ano_matr = ano_matr;
	}
	public Boolean getElectrico() {
		return electrico;
	}
	public void setElectrico(Boolean electrico) {
		this.electrico = electrico;
	}

	@Override
	public String toString() {
	    return matricula + " " + marca + " Año:" + ano_matr + " " + (electrico ? "ELectrico" : "No electrico");
	}

	

	public static void main(String[] args) {
		 Coche coche1 = new Coche();
	       coche1.setMatricula("1234JMV");
	       coche1.setMarca("Renault");
	       coche1.setAno_matr(2022);
	       coche1.setElectrico(true);
	       
	       System.out.println(coche1);
		                 
	       var coche2 = new Coche(coche1);
	       coche2.setMatricula("5678bbb");
	       
	       System.out.println(coche2);
}	
}

