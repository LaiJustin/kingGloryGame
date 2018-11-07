package ZhanChangKongZhi.HuiHeKongZhi;

public class JueSeWeiZhi {
	//储存两队角色位置
	private int posRole1[][] = new int [8][2];
	private int posRole2[][] = new int [4][2];
	//移动一个角色
	public void moveRoleOne(int team,int who,int x,int y) {
		if(team==1) {
			posRole1[who][0]=x;
			posRole1[who][1]=y;
		}
		else {
			posRole2[who][0]=x;
			posRole2[who][1]=y;
		}
	}
	//移动所有角色
	public void moveRoleAll(int posRole1[][],int posRole2[][]) {
		this.posRole1 = posRole1;
		this.posRole2 = posRole2;
	}
	public int[][] getPosRole1() {
		return posRole1;
	}
	public int[][] getPosRole2() {
		return posRole2;
	}
}

