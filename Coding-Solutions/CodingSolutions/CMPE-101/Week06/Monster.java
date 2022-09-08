package week06;

import java.util.Random;

public class Monster {
	private String name;
	private int power;
	private int criticalChance;
	
	//DEFAULT CONSTRUCTOR
	public Monster() {
		name="Troll";
		power=50;
		criticalChance=5;
	}//END DEFAULT
	
	
	//CONSTRUCTOR
	public Monster(String name, int power, int criticalChance) {
		//super();
		this.name = name;
		this.power = power;
		this.criticalChance = criticalChance;
	}//END CONSTRUCTOR
	
	//GETTER SETTTER
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getCriticalChance() {
		return criticalChance;
	}

	public void setCriticalChance(int criticalChance) {
		this.criticalChance = criticalChance;
	}// END GETTER SETTER

	//toString
	@Override
	public String toString() {
		return "Monster [name=" + name + ", power=" + power + ", criticalChance=" + criticalChance + "]";
	}//END toString
	
	public int critProb(int crit) {
		Random ran = new Random();
		this.criticalChance = crit;
		int random_int = ran.nextInt(100);
		
		
		if(random_int<crit) { // EX: critChance= 10 ==> %10 crit, so if random is lower(0,99) than crit it meets the expected probability,
			return this.power*this.criticalChance;
		}else{
			return this.power;
		}
		
	}
	
	
	
	
}
