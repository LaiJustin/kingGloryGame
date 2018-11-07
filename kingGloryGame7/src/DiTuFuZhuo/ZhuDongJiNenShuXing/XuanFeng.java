package DiTuFuZhuo.ZhuDongJiNenShuXing;

import DiTuFuZhuo.ZhuDongJiNeng;

public class XuanFeng implements ZhuDongJiNeng {
	final int power = 15;
	final int wasteMagicPoint = 10;
	final int distence = 6;
	final String name = "XuanFeng";
	@Override
	public String getShape() {
		return "🌪️";
	}
	@Override
	public int getPower() {
		// TODO Auto-generated method stub
		return power;
	}
	@Override
	public int getWasteMagicPoint() {
		// TODO Auto-generated method stub
		return wasteMagicPoint;
	}
	@Override
	public int getDistence() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
