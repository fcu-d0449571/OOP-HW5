package fcu.iecs.oop.pokemon;

public class main {

	public static void main(String[] args) {
		pokemon p1 = new pokemon("Psyduck", 100);
		pokemon p2 = new pokemon("Pikachu", 300);
		GYM.fight(p1, p2); 
	}

}