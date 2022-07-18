package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import modelo.Carta.Palo;

public class Mazo {
	
	protected List<Carta> cartas;

	public Mazo() {
		cartas= new ArrayList<>();
		for (Palo palo : Palo.values()) {//recorro los palos
			for (int i=1;i<=13;i++) {
				Carta c = new Carta(i,palo);	
				cartas.add(c);
				}
		}
	}
	
	public void barajar() {
		Collections.shuffle(cartas);//importar java.util.Collections
	}
	
	@Override
	public String toString() {
		String texto= "";
		for (Carta carta : cartas) {
			texto= texto + carta + "\n";
		}
		
		return texto;
	}
	
	public Carta solicitarCarta(){
		//Carta c = cartas.get(0);//cartas es la lista(coge la primera carta del mazo)
		Carta c = cartas.get(cartas.size()-1);// Cojo las del final
		cartas.remove(cartas.size()-1);
		//cartas.remove(0);//la quito de la lista (elimino la primera y se desplazan)
		return c;
	}
		
	public static void main(String[] args) {
		Mazo m= new Mazo();
		System.out.println(m);
		m.barajar();
		System.out.println("Barajando mazo...");
		System.out.println(m);
		Carta c = m.solicitarCarta();//pruebo el metodo solicitar carta
		System.out.println("La carta es: "+c);
		System.out.println(m);// ya no muestra la carta c (la primera)
	}
	
}
