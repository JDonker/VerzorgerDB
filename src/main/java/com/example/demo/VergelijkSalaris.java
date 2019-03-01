package com.example.demo;

import java.util.Comparator;

public class VergelijkSalaris implements Comparator<Verzorger>{

	@Override
	public int compare(Verzorger v1, Verzorger v2) {
		if(v1.getSalaris()==v2.getSalaris()) {
			return 0;
		}else if (v1.getSalaris()>v2.getSalaris()) {
			return 1;
		}
		return -1;
	}
}
