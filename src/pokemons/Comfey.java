package pokemons;

import attacks.statusAttacks.Confide;
import attacks.statusAttacks.CalmMind;
import attacks.statusAttacks.Growth;
import attacks.statusAttacks.Swagger;
import ru.ifmo.se.pokemon.*;

public class Comfey extends Pokemon {
	
	public Comfey(String name, int level) {
		super(name, level);
		this.setType(Type.FAIRY);
		this.setStats(51, 52, 90, 82, 110, 100);
		this.addMove(new Confide());
		this.addMove(new CalmMind());
		this.addMove(new Growth());
		this.addMove(new Swagger());
	}
}