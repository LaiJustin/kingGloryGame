package ZSkill;

import Skill.ZSkill;
import DiTuFuZhuo.JiNen;

public class HuoQiu extends ZSkill {
	public HuoQiu() {
		super.setGongJiLi(25);
		super.setHaoZhi(5);
		super.setShape(new HuoQiu());
	}
}
