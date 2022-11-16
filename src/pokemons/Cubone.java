package pokemons;

import attacks.statusAttacks.Growl;
import attacks.statusAttacks.Leer;
import attacks.statusAttacks.Swagger;
import ru.ifmo.se.pokemon.*;

public class Cubone extends Pokemon {
	public Cubone(String name, int level) {
		super(name, level);
		this.setType(Type.GROUND);
		this.setStats(50, 50, 95, 40, 50, 35);
		this.addMove(new Growl());
		this.addMove(new Leer());
		this.addMove(new Swagger());
	}
}