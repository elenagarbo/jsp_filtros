package com.hilos;

public class Escribir {

	public static synchronized void escribirSincronizado(String texto) {
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(texto + "---" + i);

		}

	}

	public static void escribe(String texto) {
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(texto + "---" + i);

		}
	}

}
