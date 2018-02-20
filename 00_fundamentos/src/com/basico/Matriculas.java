package com.basico;

import java.util.HashMap;
import java.util.Iterator;

public class Matriculas {

	public static void main(String[] args) {

		HashMap<String, String> hm= new HashMap<String, String>();
		
		hm.put("1234AB", "Ford fiesta");
		hm.put("5678CD", "Seat Ibiza");	
		hm.put("9101EF", "Peugeot");	
		hm.put("2222GH", "Volvo");	
		
		Iterator <String> it= hm.keySet().iterator();
		while (it.hasNext()) {
			
			String key = it.next();
			System.out.println (key +" "+ hm.get(key));
		
			
		}
		
	}

}
