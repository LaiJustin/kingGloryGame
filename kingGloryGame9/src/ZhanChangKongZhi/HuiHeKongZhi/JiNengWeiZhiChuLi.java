package ZhanChangKongZhi.HuiHeKongZhi;

import java.util.ArrayList;
import ZhanChangKongZhi.*;
import DiTuFuZhuo.ZhuDongJiNeng;
import DiTuFuZhuo.ZhuDongJiNenShuXing.*;
import Role.Role;

public class JiNengWeiZhiChuLi {
	private ArrayList<Role> team1 = new ArrayList<Role>();
	private ArrayList<Role> team2 = new ArrayList<Role>();
	private String roleName[] = new String[8];
	private String pushDir[] = new String[8];
	private String skillName[] = new String[8];
	private ZhuDongJiNeng zSkill[] = new ZhuDongJiNeng [2]; 
	private ShapeOfRoleAndSkill shape = new ShapeOfRoleAndSkill();
	private int step[] = new int [8];
	private int posSkill[][] = new int [8][2];
	private int posRole[][] = new int [8][2];
	private Boolean canMove = true;
	private int flag = 0;
	public JiNengWeiZhiChuLi(ArrayList<Role> team1,ArrayList<Role> team2,String roleName[],String skillName[],
			String pushDir[],int posSkill[][],int posRole[][],ShapeOfRoleAndSkill shape) {
		
		this.team1 = team1;
		this.team2 = team2;
		this.roleName = roleName;
		this.skillName = skillName;
		this.pushDir = pushDir;
		this.posSkill = posSkill;
		this.posRole = posRole;
		this.shape = shape;
		
	}
	public void jiNengYiDong() {
		int x=0,y=0,j=0;
		//判断谁用技能，用什么技能（技能形状）
		for(int i=0; i<8; i++) {
			for(j=0; j<4; j++) {
				if(roleName[i].equals(team1.get(j).getName())) {
					zSkill = team1.get(j).getzSkill();
					break;
				}
				if(roleName[i].equals(team2.get(j).getName())) {
					zSkill = team2.get(j).getzSkill();
					j += 4;
					break;
					}
			}
			x = posRole[i][0]; y = posRole[i][1];
			/*for(int k=0; k<2; k++) {
				if(zSkill[k].getName().equals(skillName[i]) )
					shape.setShapeSkill(j,zSkill[k].getShape());
			}*/
			//根据方向设置技能初始位置
			canMove = !(x>1&&x<9&&y>5&&y<16||x>1&&x<9&&y>22&&y<33||
					x>10&&x<18&&y>5&&y<16||x>10&&x<18&&y>22&&y<33);
			if(canMove) {
				if(pushDir[i].equals("W")&&x>0) {
					posSkill[j][0] = posRole[j][0]-1;
					posSkill[j][1] = posRole[j][1];
				}
				else if(pushDir[i].equals("S")&&x<19) {
					posSkill[j][0] = posRole[j][0]+1;
					posSkill[j][1] = posRole[j][1];
				}
				else if(pushDir[i].equals("A")&&y>0) {
					posSkill[j][0] = posRole[j][0];
					posSkill[j][1] = posRole[j][1]-1;
				}
				else if(pushDir[i].equals("D")&&y<39) {
					posSkill[j][0] = posRole[j][0];
					posSkill[j][1] = posRole[j][1]+1;
				}
			}
			//根据技能作用范围，对技能进行移动
		}
	}
	public ShapeOfRoleAndSkill getShape() {
		return shape;
	}
	public int[][] getPosSkill() {
		return posSkill;
	}
	
}
