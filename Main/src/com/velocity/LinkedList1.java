




package com.velocity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
	LinkedList<Integer> df =new LinkedList<Integer>();
	ArrayList<Integer> as =new ArrayList<Integer>();
	as.add(23);
	df.add(3);
	df.add(34);
	df.add(33);
	df.add(3436);
	
	df.add(33);
	
//	Iterator<Integer> it2 = df.iterator();
//	
//	while(it2.hasNext()) {
//		System.out.println(it2.next());
//	}
	df.add(345);
	for(int h:df) {
	System.out.println(h);	
	
	}
	Iterator<Integer> it = as.iterator();
	while (it.hasNext()) {
		System.out.println(it.next());
	}
	}
	}

