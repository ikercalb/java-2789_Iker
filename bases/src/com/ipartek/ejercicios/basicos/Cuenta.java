package com.ipartek.ejercicios.basicos;

public class Cuenta {
	
	
		private String nombre;
		private String numero;
		private Double tipo;
		private Double saldo;
		
		//por defecto
		public Cuenta() {}
		
		//clase
		public Cuenta(String nombre, String numero, Double tipo,Double saldo) {
			this.nombre = nombre;
			this.numero = numero;
			this.tipo = tipo;
			this.saldo = saldo;
			
		}
		//copia
		public Cuenta(Cuenta cuenta) {
			this(cuenta.getNombre(),cuenta.getNumero(),cuenta.getTipo(),cuenta.getSaldo());
		}
		
		
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getNumero() {
			return numero;
		}

		public void setNumero(String numero) {
			this.numero = numero;
		}

		public Double getTipo() {
			return tipo;
		}

		public void setTipo(Double tipo) {
			this.tipo = tipo;
		}

		public Double getSaldo() {
			return saldo;
		}

		public void setSaldo(Double saldo) {
			this.saldo = saldo;
		}

		public boolean ingreso(double importe) {
	        if (importe > 0) {
	            this.saldo += importe;
	            return true;
	        }
	        return false;
	    }
		
		public boolean reintegro(double importe) {
	        if (importe > 0 || importe-this.saldo>0) {
	            this.saldo -= importe;
	            return true;
	        }
	        return false;
	    }
		
		public boolean transferencia(Cuenta cuentades, Double importe) {
	        if (importe > 0 || importe-this.saldo>0) {
	            cuentades.setSaldo(cuentades.saldo+importe);
	            this.saldo -= importe;
	            return true;
	        }
	        return false;
	    }	
		
		
		@Override
		public String toString() {
		    return nombre + " " + numero + " " + tipo + " " + saldo ;
		}

		public static void main(String[] args) {
			Cuenta cuenta1 = new Cuenta("Juan Ferrández Rubio", "12345678901234567890", 1.75, 300.00); 
			Cuenta cuenta3 = new Cuenta("Iker Caballero Cano ", "56789012345678900000", 1.75, 600.00); 
			
			System.out.println(cuenta1);		
			System.out.println(cuenta3);
			
			cuenta3.transferencia(cuenta1, 100.00);
			
			System.out.println(cuenta1);		
			System.out.println(cuenta3);
			
			
			
		
		}
	


}
