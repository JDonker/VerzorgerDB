package com.example.demo;

import java.util.Comparator;

public class VergelijkDier implements Comparator<Verzorger>{

	@Override
	public int compare(Verzorger o1, Verzorger o2) {
	String n1 = o1.getDier();
	String n2 = o2.getDier();
	return CompareText.compare(n1, n2);
	}
}