package ZhanChangKongZhi.HuiHeKongZhi;

public class JueSeWeiZhi {
	//储存两队角色位置
	private int posRole[][] = new int [8][2];
	//移动一个角色
	public void moveRoleOne(int team,int who,int x,int y) {
		if(team==1) {
			posRole[who][0]=x;
			posRole[who][1]=y;
		}
		else {
			posRole[who+4][0]=x;
			posRole[who+4][1]=y;
		}
	}
	//移动所有角色
	public void moveRoleAll(int posRole[][]) {
		this.posRole = posRole;
	}
	public int[][] getPosRole() {
		return posRole;
	}
}

