package Skill;

import DiTuFuZhuo.JiNen;

public abstract class ZSkill {
	//技能攻击力、消耗魔法值
	private int gongJiLi,haoZhi;
	//技能名字
	private String name;
	//技能外观
	private JiNen shape;
	public void setGongJiLi(int gongJiLi) {
		this.gongJiLi = gongJiLi;
	}
	public void setHaoZhi(int haoZhi) {
		this.haoZhi = haoZhi;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShape() {
		return shape.getShape();
	}
	public void setShape(JiNen shape) {
		this.shape = shape;
	}
	public int getGongJiLi() {
		return gongJiLi;
	}
	public int getHaoZhi() {
		return haoZhi;
	}
	
}
