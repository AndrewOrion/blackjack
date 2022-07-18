package modelo;

import java.util.ArrayList;

public class Mano extends Mazo{

	public Mano() {
		this.cartas= new ArrayList<>();//le paso una lista de cartas
	}
	
	public int valorMano() {
		int suma=0;
		for (Carta carta : cartas) {
			suma=suma+carta.getValor();
		}
		return suma;
	}
	
	public boolean finDeJuego() {
		return valorMano()>=21;//devuelve si esta condicion es verdadera o falsa
	}

	@Override
	public String toString() {
		return "Valor de la Mano:" + valorMano() + "\n" + super.toString();
	}

	public void pedirCarta(Mazo m) {
		if (!finDeJuego()) {
			Carta c = m.solicitarCarta();
			this.cartas.add(c);
		}
		
	}
	
}
