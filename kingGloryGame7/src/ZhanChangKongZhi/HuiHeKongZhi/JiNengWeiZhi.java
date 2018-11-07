package ZhanChangKongZhi.HuiHeKongZhi;

public class JiNengWeiZhi {
	private int posSkill1[][] = new int [4][2];
	private int posSkill2[][] = new int [4][2];
	//设置技能位置
	public void moveSkillAll(int posSkill1[][],int posSkill2[][]) {
		this.posSkill1 = posSkill1;
		this.posSkill2 = posSkill2;
	}
	
	public int[][] getPosSkill1() {
		return posSkill1;
	}
	public int[][] getPosSkill2() {
		return posSkill2;
	}
	
}
