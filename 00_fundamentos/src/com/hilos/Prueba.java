package com.hilos;

public class Prueba {

	public static void main(String[] args) {
		
		new Thread(new Sincronizado()).start();
		Escribir.escribirSincronizado("otro");

		
//		new Thread(new Sincronizado()).start();
//		Escribir.escribe("otro");
	}

}
