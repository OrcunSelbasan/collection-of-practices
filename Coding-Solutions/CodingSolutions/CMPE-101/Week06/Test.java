package week06;

public class Test {
	
	public String battle(Monster monster, int wizardHealth) {
		
		while (wizardHealth>0) {
			int dmg = monster.critProb(monster.getCriticalChance()); // Given damage
			
			if(dmg >monster.getPower()) {// If damage is critical
				System.out.println("CRITICAL DAMAGE!");
				wizardHealth-=dmg;		
				System.out.println("Wizard health: "+wizardHealth);
			}else {// If damage is not critical
				wizardHealth-=dmg;
				System.out.println("Wizard health: "+wizardHealth);			
			}
		} 		
		return "Wizard is dead";
	}
	
	public static void main(String[] args) {
		Test run = new Test();
		
		//First Monster
		Monster m1 = new Monster("Orc",100,10);
		System.out.println(m1);
		//Default monster
		Monster def = new Monster();
		System.out.println(def);
		
		// orc against wizard
		System.out.println(run.battle(m1, 1000));
		
		System.out.println();
		//  troll(default) against wizard
		System.out.println(run.battle(def, 1000));
	}
}
