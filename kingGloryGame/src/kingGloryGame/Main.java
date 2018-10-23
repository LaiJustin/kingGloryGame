package kingGloryGame;
import java.util.Scanner;
import Battlefield.Battlefield;
import Role.*;
import Skill.impl.*;

import java.util.ArrayList;

public class Main {
	/*public Main() {
		Scanner in = new Scanner(System.in);
		ArrayList<Alien> team1 = new ArrayList<Alien>();
		char direction;
		int pos[] = new int [2];
		int time = 10;
		int i;
		String 
		Battlefield field =  new Battlefield();
		//field.display();
		for(i=0; i<5;i++) {
			Alien R = new Alien(100,100);
			team1.add(R);
		}
		direction = in.next().charAt(0);
		field.rolePosition(team1.get(0), direction);
		field.display();
	}*/
	public static void main(String[] args) {
		Role hero = new Aline();
		hero.setiSkill(new HuoQiu());
		hero.skill();
		
	}
}
