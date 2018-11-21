package ZhanChangKongZhi.HuiHeKongZhi;
import ZhanChangKongZhi.HuiHeKongZhi.JueSeWeiZhiChuLi;
import ZhanChangKongZhi.HuiHeKongZhi.JiNengWeiZhiChuLi;
import java.util.ArrayList;
import Role.*;
public class WanJiaShuRu {
	//操作储存
	private String caoZuo[][] = new String[8][5];
	//队伍
	private ArrayList<Role> team1 = new ArrayList<Role>();
	private ArrayList<Role> team2 = new ArrayList<Role>();
	//角色位置
	private int posRole[][] = new int [8][2];
	//技能位置
	private int posSkill[][] = new int [8][2];
	private int flag = 0;
	//角色和技能形状
	private ShapeOfRoleAndSkill shape = new ShapeOfRoleAndSkill();
	//角色名字
	private String roleName[] = new String[8];
	//移动方向
	private String moveDir[] = new String[8];
	//技能方向
	private String pushDir[] = new String[8];
	//角色技能使用
	private String skillName[] = new String[8];
	//移动步数
	private int step[] = new int[8];
	//能否移动
	private boolean canMove = true;
	//构造函数
	public WanJiaShuRu(RenWuChuShiHua sta,JueSeWeiZhi pos,ShapeOfRoleAndSkill shape) {
		posRole = pos.getPosRole();
		team1 = sta.getTeam1();
		team2 = sta.getTeam2();
		this.shape = shape;
	}
	//对输入转化
	public void setShuRu(String[] shuRu){
		for(int i=0;i<8;i++) {
			caoZuo[i] = shuRu[i].split(" ");
			// player  moveDir  1  jiNeng  pushDir 
		}
	}
	//对输入存储
	public void HuiHe() {
		for(int i=0;i<8;i++) {
			roleName[i] = caoZuo[i][0];
			moveDir[i] = caoZuo[i][1];
			step[i] = Integer.parseInt(caoZuo[i][2]);
			skillName[i] = caoZuo[i][3];
			pushDir[i] = caoZuo[i][4];
		}
	}
	//判断角色移动
//	public void JueSeChuLi() {
//		JueSeWeiZhiChuLi jS = new JueSeWeiZhiChuLi
//				(team1,team2,roleName,moveDir,step,posRole);
//		jS.jueSeYiDong();
//		posRole = jS.getPosRole();
//	}
	//判断技能移动
	public void JiNengChuLi() {
		JiNengWeiZhiChuLi jN = new JiNengWeiZhiChuLi
				(team1,team2,roleName,skillName,pushDir,posSkill,posRole,shape);
		jN.jiNengYiDong();
		posSkill = jN.getPosSkill();
		shape = jN.getShape();
	}
	public int[][] getPosRole() {
		return posRole;
	}
	public int[][] getPosSkill() {
		return posSkill;
	}
	public ShapeOfRoleAndSkill getShape() {
		return shape;
	}
	
}
