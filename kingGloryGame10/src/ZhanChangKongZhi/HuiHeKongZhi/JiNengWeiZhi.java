package ZhanChangKongZhi.HuiHeKongZhi;

public class JiNengWeiZhi {
	private int posSkill[][] = new int [8][2];
	//设置技能位置
	public void moveSkillAll(int posSkill[][]) {
		this.posSkill = posSkill;
	}
	
	public int[][] getPosSkill() {
		return posSkill;
	}
	
}
