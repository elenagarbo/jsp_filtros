package com.basico;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;


public class Colecciones2 {

	public static void main(String[] args) {
		System.out.println("SET y QUEUE");
		
//		Set <String> listado= new HashSet<String>();
		Queue <String> listado= new PriorityQueue<>();
		
		System.out.println(listado.size());
		
		listado.add("Valencia");
		listado.add("Madrid");
		listado.add("Sevilla");
		
//		listado.add("Zaragoza");
//		
//		listado.add("Valencia");
//		
//		listado.add("Barcelona");
		
		
		
		listado.remove(1);
		
		Iterator<String> it= listado.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	
		System.out.println(listado.size());
		System.out.println("");
	}

}
