package com.ipartek.Personal.pojos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

import com.ipartek.almacen.pojos.Categoria;

public class Cargo implements Serializable {

	private static final long serialVersionUID = 6243030315819383283L;

	private Integer id;
	private String nombre;
	private BigDecimal salario;

	public Cargo(Integer id,String nombre, BigDecimal salario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nombre, salario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cargo other = (Cargo) obj;
		return Objects.equals(id, other.id) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(salario, other.salario);
	}

	@Override
	public String toString() {
		return String.format("Cargo[id=%, nombre=%, salario=%]", id,nombre,salario);
	}
	

}
