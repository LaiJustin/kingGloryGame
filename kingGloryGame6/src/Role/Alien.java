package Role;
import DiTuFuZhuo.ZhuDongJiNeng;

public class Alien extends Role {
	public Alien(String name,ZhuDongJiNeng zSkill) {
		super.setName(name);
		super.setHP(100);
		super.setMP(0);
		super.setzSkill(zSkill);
	}
}
