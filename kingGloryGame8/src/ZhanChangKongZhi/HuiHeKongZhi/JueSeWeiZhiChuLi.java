package ZhanChangKongZhi.HuiHeKongZhi;

import java.util.ArrayList;

import Role.Role;

public class JueSeWeiZhiChuLi {
	private ArrayList<Role> team1 = new ArrayList<Role>();
	private ArrayList<Role> team2 = new ArrayList<Role>();
	private String roleName[] = new String[8];
	private String moveDir[] = new String[8];
	private int step[] = new int [8];
	private int posRole[][] = new int [8][2];
	private Boolean canMove = true;
	private int flag = 0;
	public JueSeWeiZhiChuLi(ArrayList<Role> team1,ArrayList<Role> team2,
			String roleName[],String moveDir[],int step[],int posRole[][]) {
		
		this.team1 = team1;
		this.team2 = team2;
		this.roleName = roleName;
		this.moveDir = moveDir;
		this.step = step;
		this.posRole = posRole;
		
	}
	public void jueSeYiDong(){
		int x=0,y=0,j=0;
		for(int i=0;i<8;i++) {
			canMove =false;
			for(j=0; j<4; j++) {
				if(roleName[i].equals(team1.get(j).getName())&&step[i]>0) {
					x = posRole[i][0]; y = posRole[i][1];
					canMove = !(x>1&&x<9&&y>5&&y<16||x>1&&x<9&&y>22&&y<33||
							x>10&&x<18&&y>5&&y<16||x>10&&x<18&&y>22&&y<33);
					break;
				}
				if(roleName[i].equals(team2.get(j).getName())&&step[i]>0) {
					x = posRole[i][0]; y = posRole[i][1];
					canMove = !(x>1&&x<9&&y>5&&y<16||x>1&&x<9&&y>22&&y<33||
							x>10&&x<18&&y>5&&y<16||x>10&&x<18&&y>22&&y<33);
					j += 4;
					break;
				}
			}
			if(canMove){
				
				if(moveDir[i].equals("W")&&x>0) 
					posRole[j][0]--;
				else if(moveDir[i].equals("S")&&x<19)
					posRole[j][0]++;
				else if(moveDir[i].equals("A")&&y>0)
					posRole[j][1]--;
				else if(moveDir[i].equals("D")&&y<39) 
					posRole[j][1]++;
			}
		}
		flag = 0;
		for(int i=0;i<8;i++)
			if(step[i]>0) 
				flag = 1;
		for(int i=0;i<8;i++)
			step[i]--;
	}
	public int[][] getPosRole() {
		return posRole;
	}
	
}
