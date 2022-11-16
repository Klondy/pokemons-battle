package attacks.physicalAttacks;

import ru.ifmo.se.pokemon.*;

public class RockTomb extends PhysicalMove {
	
	public RockTomb() {
		super(Type.ROCK, 60, 95);
	}
	
	@Override
	protected void applyOppEffects(Pokemon pokemon) {
		pokemon.setMod(Stat.SPEED, -1);
	}
	
	@Override
	protected String describe() {
		return "применяет Rock Tomb";
	}
}