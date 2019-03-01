package com.example.demo;

import java.util.Comparator;

public class VergelijkNaam implements Comparator<Verzorger>{

	@Override
	public int compare(Verzorger o1, Verzorger o2) {
	String n1 = o1.getName();
	String n2 = o2.getName();
	return CompareText.compare(n1, n2);
	}
	


}
	
	
	

