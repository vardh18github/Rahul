package com.velocity;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> sd=new ArrayList<String>();
		sd.add("Rahul");
		sd.add("Sachin");
		sd.add("Vardhaman");
		sd.add("Mahavir");
		sd.add("Atul");
		
		Iterator<String> it = sd.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
			
		}
		
		
		
		
		
	}

}

