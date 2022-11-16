package pokemons;

import attacks.physicalAttacks.AerialAce;
import attacks.physicalAttacks.Facade;
import attacks.physicalAttacks.FurySwipes;
import attacks.physicalAttacks.RockTomb;
import ru.ifmo.se.pokemon.*;

public class Slaking extends Pokemon {
	public Slaking(String name, int level) {
		super(name, level);
		this.setType(Type.NORMAL);
		this.setStats(150, 160, 100, 95, 65, 100);
		this.addMove(new AerialAce());
		this.addMove(new Facade());
		this.addMove(new FurySwipes());
		this.addMove(new RockTomb());
	}
}