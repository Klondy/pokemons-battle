package pokemons;

import attacks.physicalAttacks.AerialAce;
import attacks.physicalAttacks.Facade;
import attacks.physicalAttacks.FurySwipes;
import ru.ifmo.se.pokemon.*;

public class Vigoroth extends Pokemon {
	public Vigoroth(String name, int level){
		super(name,level);
		this.setType(Type.NORMAL);
		this.setStats(80, 80, 80, 55, 55, 90);
		this.addMove(new AerialAce());
		this.addMove(new Facade());
		this.addMove(new FurySwipes());
	}
}