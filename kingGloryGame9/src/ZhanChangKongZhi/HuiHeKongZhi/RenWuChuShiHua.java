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
	private int order1 = 0,order2 = 0,index1 = 15,index2 = 15;
	private int[][] posRole = new int [8][2];
	private String[] shapeR = new  String [8];
	//人物初始化
	public void SetRole(Role player,int team, ShapeOfRoleAndSkill shape) {
		//创建角色形状
		if(player.getClass().equals(Alien.class)) {
			//shape.setShapeRole(team, AlienShape);
		}
		else if(player.getClass().equals(Robot.class)) {
			player.setShape(new RobotShape());
		}
		//角色队伍归属
		if(team==1) {
			shapeR[order1] = player.shape();
			team1.add(player);
			posRole[order1][0] = 1;
			posRole[order1][1] = index1;
			index1 = index1+3;
			if(order1<3)
				order1++;
		}
		else {
			shapeR[order2+4] = player.shape();
			team2.add(player);
			posRole[order2+4][0] = 18;
			posRole[order2+4][1] = index2;
			index2 = index2+3;
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
