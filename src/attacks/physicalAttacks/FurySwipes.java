package attacks.physicalAttacks;

import ru.ifmo.se.pokemon.*;

public class FurySwipes extends PhysicalMove {
	
	public FurySwipes() {
		super(Type.NORMAL, 18, 80);
	}
	
	@Override
	protected void applyOppDamage(Pokemon def, double damage) {
		def.setMod(Stat.HP, (int) Math.round(damage));
		Effect secondHit = new Effect().chance(3.0/8.0).stat(Stat.HP, -36);
		Effect thirdHit = new Effect().chance(3.0/8.0).stat(Stat.HP, -54);
		Effect forthHit = new Effect().chance(1.0/8.0).stat(Stat.HP, -72);
		Effect fifthHit = new Effect().chance(1.0/8.0).stat(Stat.HP, -90);
	}
	
	@Override
	protected String describe() {
		return "применяет Fury Swipes";
	}
}