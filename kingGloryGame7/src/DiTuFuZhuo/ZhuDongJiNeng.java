package DiTuFuZhuo;

public interface ZhuDongJiNeng {
	//返回技能外观
	public abstract String getShape();
	//返回技能名字
	public abstract String getName();
	//返回技能攻击力
	public abstract int getPower();
	//返回技能消耗魔法值
	public abstract int getWasteMagicPoint();
	//返回技能射程
	public abstract int getDistence();
}
