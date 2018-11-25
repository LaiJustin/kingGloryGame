package ZhanChangKongZhi.HuiHeKongZhi;

public class JueSeWeiZhi {
	//储存两队角色位置
	public int posRole[][] = new int [8][2];
	public JueSeWeiZhi() {
		for (int i=0; i<4; i++) {
			posRole[i][0] = 800;
			posRole[i][1] = 60;
		}
		for (int i=4; i<8; i++) {
			posRole[i][0] = 60;
			posRole[i][1] = 800;
		}
	}
	/*
	移动一个角色
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
	移动所有角色
	public void setPosRole(int posRole[][]) {
		this.posRole = posRole;
	}
	*/
	public int[][] getPosRole() {
		return posRole;
	}
	/*
	public void run() {
		int x,y;
		Boolean[] canMove = new Boolean[4];
		int[] num = new int [8]; 
		for(int i=0; i<8; i++)
			num[i]=(int)(Math.random()*4);
		for(int i=0; i<4; i++)
			canMove[i] = true;	//上[0]、下[1]、左[2]、右[3]
		for(int i=0; i<8; i++) {
			x = posRole[i][0]; y = posRole[i][1];
			canMove[0] = !(x==8||x==17||x==0);
			canMove[1] = !(x==2||x==11||x==19);
			canMove[2] = !(y==16||y==33||y==0);
			canMove[3] = !(y==7||y==24||y==39);
			//System.out.println(123);
			switch (num[i]) {
			case 1: 
				if(canMove[0]) x--; break;
			case 2: 
				if(canMove[1]) x++; break;
			case 3: 
				if(canMove[2]) y--; break;
			case 4: 
				if(canMove[3]) y++; break;
			default : break;
			}
			posRole[i][0] = x; posRole[i][1] = y;
		}
			
	}*/
}

