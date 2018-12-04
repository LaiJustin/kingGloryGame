package Role;
import java.lang.*;
import DiTuFuZhuo.*;
abstract public class Role {
	//血量、魔法值、经验
	public int HP,MP,Speed;
	//英雄名字
	public String name;
	//英雄技能
	public ZhuDongJiNeng zSkill[] = new ZhuDongJiNeng [2];
	public BeiDongJiNeng bSkill;
	//英雄技能使用方法
	public void skill() {
	}
}