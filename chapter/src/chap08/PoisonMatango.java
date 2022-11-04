package chap08;

public class PoisonMatango extends Matango {
	int poisonAttack = 5;
	
	public PoisonMatango(char suffix, int hp, int level) {
		super(suffix, hp, level);
	}
	public PoisonMatango(char suffix, int hp) {
		super(suffix, hp, 10);
	}
	public PoisonMatango(char suffix) {
		super(suffix, 10, 10);
	}
	
	public void attack(Hero h) {
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ");
		h.hp -= 10;
		
		if(poisonAttack != 0) {
			System.out.println("さらに毒の胞子をばら撒いた");
			int poisonDamage = h.hp / 5;
			System.out.println(poisonDamage + "ポイントのダメージ");
			h.hp -= poisonDamage;
			this.poisonAttack--;
		}
	}
}
