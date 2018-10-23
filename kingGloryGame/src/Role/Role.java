package Role;
import java.lang.*;
import Skill.ISkill;
abstract public class Role {
	//血量、魔法值、经验
	private int HP,MP,Exp;
	//英雄名字
	private String name;
	//英雄技能
	private ISkill iSkill;
	//英雄外貌
	private String shape;
	//普通攻击
	public abstract void normalAttack();
	//英雄技能使用方法
	public void skill() {
		iSkill.useSkill();
	}
	/*
	public Role(int HP, int MP) {
		this.HP = HP;
		this.MP = MP;
		this.Exp = 0;
	}
	abstract void setShape();
	public String getShape() {
		return shape;
	}
	public static void main(String []arg) {
	}*/
	public int getHP() {
		return HP;
	}
	public void setHP(int hP) {
		HP = hP;
	}
	public int getMP() {
		return MP;
	}
	public void setMP(int mP) {
		MP = mP;
	}
	public int getExp() {
		return Exp;
	}
	public void setExp(int exp) {
		Exp = exp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public void setiSkill(ISkill iSkill) {
		this.iSkill = iSkill;
	}
	
}