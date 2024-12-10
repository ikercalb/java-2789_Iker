package com.ipartek.Personal.fabrica;

import java.io.IOException;
import java.util.Properties;



public class fabrica {
static {
	
		try {
			//carga los ajustes de personal.properties
			Properties props = new Properties();
			props.load(fabrica.class.getClassLoader().getResourceAsStream("personal.properties"));
			
			//carga los archivos de imprmentacion
			var daoProductoClase = props.getProperty("dao.producto.implementacion");
			var daoCategoriaClase = props.getProperty("dao.categoria.implementacion");
			
			//carga los accesos a la bd
			var url = props.getProperty("dao.url");
			var user = props.getProperty("dao.user");
			var pass = props.getProperty("dao.pass");
			
			
			
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
