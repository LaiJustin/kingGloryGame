package ZhanChangKongZhi.HuiHeKongZhi;
import java.util.ArrayList;

import Role.*;
import DiTuFuZhuo.*;
import DiTuFuZhuo.JueSeWaiXing.*;

public class RenWuChuShiHua {
	//人物初始化
	private ArrayList<Role> team1 = new ArrayList<Role>();
	private ArrayList<Role> team2 = new ArrayList<Role>();
	private String shapeT1[] = new String [4];
	private String shapeT2[] = new String [4];
	private int order1 = 0,order2 = 0,index1 = 16,index2 = 16;
	//
	public RenWuChuShiHua() {
		
	}
	public void SetRole(Role player,int team,JueSeWeiZhi pos) {
		if(player.getClass().equals(Alien.class)) {
			player.setShape(new AlienShape());
		}
		else if(player.getClass().equals(Robot.class)) {
			player.setShape(new RobotShape());
		}
		if(team==1) {
			shapeT1[order1] = player.shape();
			team1.add(player);
			pos.moveRoleOne(1, order1, 1, index1);
			index1 = index1+2;
			if(order1<3)
				order1++;
		}
		
		else {
			shapeT2[order2]=player.shape();
			team2.add(player);
			pos.moveRoleOne(2, order2, 18, index2);
			index2 = index2+2;
			if(order2<3)
				order2++;
			//System.out.println(456);
		}
	}
	public String[] getShapeT1() {
		return shapeT1;
	}
	public String[] getShapeT2() {
		return shapeT2;
	}
	public ArrayList<Role> getTeam1() {
		return team1;
	}
	public ArrayList<Role> getTeam2() {
		return team2;
	}
	
}
