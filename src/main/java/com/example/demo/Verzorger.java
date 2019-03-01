package com.example.demo;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Verzorger implements Comparable<Verzorger> {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long Id;
	private String name;
	private String dier;
	private int leeftijd;
	private int salaris;
	
	
	public String getDier() {
		return dier;
	}
	public void setDier(String dier) {
		this.dier = dier;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public int getLeeftijd() {
		return leeftijd;
	}
	public void setLeeftijd(int leeftijd) {
		this.leeftijd = leeftijd;
	}
	public int getSalaris() {
		return salaris;
	}
	public void setSalaris(int salaris) {
		this.salaris = salaris;
	}
	@Override
	public int compareTo(Verzorger verzorger) {
		if(this.leeftijd==verzorger.leeftijd) {
			return 0;
		}else if (this.leeftijd>verzorger.leeftijd) {
			return 1;
			
		}
		return -1;
	}

}
