package attacks.physicalAttacks;

import ru.ifmo.se.pokemon.*;
import java.util.Arrays;

public class Facade extends PhysicalMove {
	
	public Facade() {
		super(Type.NORMAL, 70, 100);
	}
	
	@Override
	protected void applyOppDamage(Pokemon def, double damage) {
		if (Arrays.asList(Status.BURN, Status.POISON, Status.PARALYZE).contains(def.getCondition())) {
			def.setMod(Stat.HP, (int) Math.round(damage) * 2);
		}
		def.setMod(Stat.HP, (int) Math.round(damage));
	}
	
	@Override
	protected String describe() {
		return "применяет Facade";
	}
}