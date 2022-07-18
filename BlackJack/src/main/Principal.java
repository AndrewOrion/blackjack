package main;

import java.util.Scanner;

import modelo.Mano;
import modelo.Mazo;

public class Principal {

	public static void main(String[] args) {

		Mazo mazo= new Mazo();
		Mano jugador = new Mano();
		
		System.out.println("Barajando carta...");
		mazo.barajar();
		
		Scanner entrada = new Scanner(System.in);
	
		int opcion;
		do {
			System.out.println("¿Quieres carta? 1-Si, 0-No");
			opcion = entrada.nextInt();
			if (opcion == 1) {
				jugador.pedirCarta(mazo);
				System.out.println(jugador);
			} else {
				System.out.println("Te has plantado. Puntuacion: "+jugador.valorMano());
			}
		}while(opcion!=0 && !jugador.finDeJuego());
		
		Mano banca= new Mano();
		System.out.println("Juega la banca");
		
		if (jugador.valorMano()>21) {
			System.out.println("Pierde el jugador (+ de 21)");
		} else {
			do {
				System.out.println("Pidiendo carta...");
				banca.pedirCarta(mazo);
				System.out.println(banca);
			}while (banca.valorMano()<=16);
			System.out.println("_________________________");
			if (jugador.valorMano()>banca.valorMano() || banca.valorMano()>21) {
				System.out.println("Enhorabuena! Has ganado!: "+jugador);
			} else if (jugador.valorMano()==banca.valorMano()){
				System.out.println("Empate! \nJugador: "+jugador+"Banca: "+banca);
			}else {
				System.out.println("Gana la banca: "+ banca);
			}
				
			}
		
		
		/*
		System.out.println("Fin de juego." +jugador);
		System.out.println("_________________________");
		
		if (jugador.valorMano()==21) {
			System.out.println("Campeon! Has conseguido 21!!!");
		}else if (jugador.valorMano()>21) {
			System.out.println("("+jugador.valorMano()+") Te has pasado de 21");
		}else {
			System.out.println("Te has plantado con "+jugador.valorMano());
		}*/
	}

}
