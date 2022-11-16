package pokemons;

import attacks.statusAttacks.Growl;
import attacks.statusAttacks.Leer;
import attacks.statusAttacks.Swagger;
import attacks.specialAttacks.FocusBlast;
import ru.ifmo.se.pokemon.*;

public class Marowalk extends Pokemon{
	public Marowalk(String name, int level) {
		super(name, level);
		this.setType(Type.GROUND);
		this.setStats(60, 80, 110, 50, 80, 45);
		this.addMove(new Growl());
		this.addMove(new Leer());
		this.addMove(new Swagger());
		this.addMove(new FocusBlast());
	}
}