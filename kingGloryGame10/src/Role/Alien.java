package Role;
import DiTuFuZhuo.ZhuDongJiNeng;
import DiTuFuZhuo.BeiDongJiNeng;

public class Alien extends Role {
	public Alien(String name,ZhuDongJiNeng zSkill1,ZhuDongJiNeng zSkill2,BeiDongJiNeng bSkill) {
		ZhuDongJiNeng zD[] = new ZhuDongJiNeng[2];
		zD[0] = zSkill1;
		zD[1] = zSkill2;
		super.setName(name);
		super.setHP(100);
		super.setMP(0);
		super.setzSkill(zD);
		super.setbSikll(bSkill);
	}
}
