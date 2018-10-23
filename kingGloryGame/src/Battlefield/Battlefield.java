package Battlefield;
import Role.*;
public class Battlefield {
	String field[][] = new String [20][40];
	public Battlefield(){
		int x,y;
		for (x=0;x<20;x++)
			for(y=0;y<40;y++)
				field[x][y] = "⬜";
	}
	public static void main(String []arg) {
	}
	
	public void rolePosition(Role who,char direction) {
		int []pos = new int [2];
		int x,y;
		pos = who.getPosition();
		x=pos[1]; y=pos[0];
		field[y][x] = "⬜";
		if(pos[0]>0 && direction=='W')
			pos[0]--;
		else if(pos[1]>0 && direction=='A')
			pos[1]--;
		else if(pos[0]<40 && direction=='S')
			pos[0]++;
		else if(pos[1]<20 && direction=='D')
			pos[1]++;
		x=pos[1]; y=pos[0];
		field[y][x] = who.getShape();
	}
	public void display() {
		int x,y;
		for (x=0;x<20;x++)
			for(y=0;y<40;y++) {
				System.out.print(field[x][y]);
				if(y == 39)
					System.out.println();
			}
		}
}
