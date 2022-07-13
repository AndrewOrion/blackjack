package modelo;

public class Carta {
	enum Palo {
		TREBOL, DIAMANTES, CORAZONES, PICAS;
	}
	
	private int num;
	private Palo palo;
	
	public Carta(int num, Palo palo) {
		if (num>1 && num<13) {
			this.num = num;
			this.palo = palo;
		}
		
	}

	public int getNum() {
		return num;
	}

	public Palo getPalo() {
		return palo;
	}
	
	public int getValor() {
		if (this.num==1) return 11;
		else if (this.num==11 || this.num==12 || this.num==13) return 10;
		else return this.num;		
	}
	
	public String mostrarNum() {
		if (this.num==1) return "AS";
		else if (this.num==11) return "J";
		else if (this.num==12) return "Q";
		else if (this.num==13) return "K";
		else return Integer.toString(this.num);//Convierte a string el entero
		//return ""+this.num; //sobrecargo el + y lo imprime
	}

	@Override
	public String toString() {
		return "["+ num + " - " + palo + "]";
	}
	
	
}
