package com.basico;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Colecciones {

	public static void main(String[] args) {
		System.out.println("ARRAY LIST Y LINKEDLIST, permite valor repetido ");
		
		//List <String> listado= new ArrayList<String>();
		List <String> listado= new LinkedList<String>();
		System.out.println(listado.size());
		listado.add("Madrid");
		listado.add("Sevilla");
		listado.add("Valencia");
		listado.add("Valencia");
		
		listado.remove(1);
		
		Iterator<String> it= listado.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	
		System.out.println(listado.size());
		System.out.println("");
	}

}
