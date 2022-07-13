package modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import modelo.Carta.Palo;

public class Mazo {
	
	private List<Carta> cartas;

	public Mazo() {
		cartas= new ArrayList<>();
		for (Palo palo : Palo.values()) {//recorro los palos
			for (int i=1;i<=13;i++) {
				Carta c = new Carta(i,palo);	
				cartas.add(c);
				}
		}
	}
	
	
	
}
