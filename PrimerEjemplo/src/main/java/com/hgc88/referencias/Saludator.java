package com.hgc88.referencias;

public class Saludator {
	
	private String mensaje;
	
	public void setMensaje(String str) {
		this.mensaje = str; 
	}
	
	public String saludo() {
		return (mensaje == null) ? "Hola Mundo!!!" : mensaje;
	}

}