package com.hilos;

public class Ejecutar {

	public static void main(String[] args) {

		Hilo h1 = new Hilo();
		h1.setName("Hilo 1");
		h1.setPriority(Thread.MIN_PRIORITY);
		System.out.println(h1.isAlive());
		h1.Escribir("Soy el mensaje hilo 1");
		
		
		h1.start();
		
		System.out.println(h1);

		Hilo h2 = new Hilo();
		h2.setName("Hilo 2");
		h2.setPriority(Thread.MAX_PRIORITY);
		System.out.println(h2.isAlive());
		h2.Escribir("Soy el hilo 2");
		h2.start();

	}

}

class Hilo extends Thread {
	public void run() {
		int i = 0;
		while (i < 50) {
			System.out.println(this.getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;

		}
	}
	
public static synchronized void Escribir(String mensaje) {
		
		for (int i = 0; i < 100; i++) {
			System.out.println(mensaje);	
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	

}

	}
	
}
