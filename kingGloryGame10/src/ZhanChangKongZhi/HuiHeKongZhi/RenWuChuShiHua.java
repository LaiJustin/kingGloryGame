package ZhanChangKongZhi.HuiHeKongZhi;
import java.util.ArrayList;

import Role.*;
import DiTuFuZhuo.*;
import DiTuFuZhuo.JueSeWaiXing.*;

public class RenWuChuShiHua {
	//建立两个队伍
	private ArrayList<Role> team1 = new ArrayList<Role>();
	private ArrayList<Role> team2 = new ArrayList<Role>();
	//角色形状
	private int order1 = 0,order2 = 0;
	private int[][] posRole = new int [8][2];
	//private String[] shapeR = new  String [8];
	//人物初始化
	public void SetRole(Role player,int team, ShapeOfRoleAndSkill shape) {
		//创建角色形状
		if(player.getClass().equals(Alien.class)) 
			shape.setShapeRole(new Shape_blackDragon());
		//角色队伍归属
		if(team==1) {
			team1.add(player);
			if(order1<3)
				order1++;
		}
		else {
			team2.add(player);
			if(order2<3)
				order2++;
		}
	}
	public void SetPosAndShape(ShapeOfRoleAndSkill shape) {
		//pos.setPosRole(posRole);
		//shape.setShapeRole(this.shapeR);
	}
	public ArrayList<Role> getTeam1() {
		return team1;
	}
	public ArrayList<Role> getTeam2() {
		return team2;
	}
	
}
