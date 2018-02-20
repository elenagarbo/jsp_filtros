package com.hilos;

public class Sincronizado implements Runnable{

		public void run(){
			
			Escribir.escribirSincronizado("Primero hilo");
//			Escribir.escribe("Primero hilo");
		}

	

}
