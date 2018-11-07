package Role;
import java.lang.*;
import DiTuFuZhuo.*;
abstract public class Role {
	//血量、魔法值、经验
	private int HP,MP;
	//英雄名字
	private String name;
	//英雄外貌
	private JueSe shape;
	//英雄技能
	private ZhuDongJiNeng zSkill[] = new ZhuDongJiNeng [2];
	private BeiDongJiNeng bSkill;
	//英雄技能使用方法
	public void skill() {
	}
	public String shape() {
		return shape.getShape();
	}
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setShape(JueSe shape) {
		this.shape = shape;
	}
	public ZhuDongJiNeng[] getzSkill() {
		return zSkill;
	}
	public void setzSkill(ZhuDongJiNeng zSkill[]) {
		this.zSkill = zSkill;
	}
	public BeiDongJiNeng getbSikll() {
		return bSkill;
	}
	public void setbSikll(BeiDongJiNeng bSkill) {
		this.bSkill = bSkill;
	}
}