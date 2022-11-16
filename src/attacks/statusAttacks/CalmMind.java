package attacks.statusAttacks;

import ru.ifmo.se.pokemon.*;

public class CalmMind extends StatusMove{
	
	public CalmMind() {
		super(Type.PSYCHIC, 0, 100);
	}
	
	@Override
	protected void applySelfEffects(Pokemon pokemon) {
		pokemon.setMod(Stat.SPECIAL_ATTACK, 1);
		pokemon.setMod(Stat.SPECIAL_DEFENSE, 1);
	}
	
	@Override
	protected String describe(){
		return "применяет Confide";
	}
}