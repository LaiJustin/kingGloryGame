package ZhanChangKongZhi.HuiHeKongZhi;
import java.util.*;
import Role.*;
import DiTuFuZhuo.*;
import java.math.*;
import java.awt.*;
import javax.swing.*;
import DiTuFuZhuo.JueSeWaiXing.*;

public class RenWuChuShiHua {
	private RoleAndSkillShape allRoles =new RoleAndSkillShape();
	Vector<Role> hero = new Vector<>(); 
	public RenWuChuShiHua(Role myHero) {
		hero.add(myHero);
		setRoleShapeAndSkill(myHero.name,800,60);
		ChuangJianJiQiRen();
	}
	/**
	 * 加载机器人
	 */
	private void ChuangJianJiQiRen() {
		int x,y;
		for(int i=0; i<7; i++) {
//			随机数选择机器人
			if(i<3) { x=800; y=60;}
			else { x=60; y=700;}
			int j = (int)(1+Math.random()*2);	
			Role newRole;
			//System.out.println(123);
			newRole = ChooseRole(j);
			hero.add(newRole);
			setRoleShapeAndSkill(newRole.name,x,y);
		}
	}
	
	private Role ChooseRole(int j) {
		switch(j) {
			case 1:return new bear();
			default:return new blackDragon();
			}
	}
	/**
	 * 
	 * @param heroName
	 */
	private void setRoleShapeAndSkill(String heroName,int x,int y) {
		if(heroName.equals("bear")) {
			allRoles.roleShape.add(new Shape_bear(x,y));
		}
		else if(heroName.equals("blackDragon")) {
			allRoles.roleShape.add(new Shape_blackDragon(x,y));
		}
	}
	public RoleAndSkillShape getRoleAndSkillShape() {
		return allRoles;
	}
}
