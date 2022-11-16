package pokemons;

import attacks.physicalAttacks.AerialAce;
import attacks.statusAttacks.Leer;
import ru.ifmo.se.pokemon.*;

public class Slakoth extends Pokemon {
	public Slakoth(String name, int level){
		super(name, level);
		this.setType(Type.NORMAL);
		this.setStats(60, 60, 60, 35, 35, 30);
		this.addMove(new AerialAce());
		this.addMove(new Leer());
	}
}