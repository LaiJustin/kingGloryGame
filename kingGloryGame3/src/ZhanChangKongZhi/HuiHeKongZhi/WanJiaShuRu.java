package ZhanChangKongZhi.HuiHeKongZhi;
import java.util.ArrayList;
import Role.*;
public class WanJiaShuRu {
	private String caoZuo[][] = new String[8][3];
	private ArrayList<Role> team1 = new ArrayList<Role>();
	private ArrayList<Role> team2 = new ArrayList<Role>();
	private int posRole1[][] = new int [4][2];
	private int posRole2[][] = new int [4][2];
	private int flag = 0;
	private String dir[] = new String[8];
	private int step[] = new int[8];
	public WanJiaShuRu(String[] shuRu,RenWuChuShiHua sta,JueSeWeiZhi pos) {
		for(int i=0;i<8;i++) {
			caoZuo[i] = shuRu[i].split(" ");
		}
		posRole1 = pos.getPosRole1();
		posRole2 = pos.getPosRole2();
		team1 = sta.getTeam1();
		team2 = sta.getTeam2();
	}
	public void HuiHe() {
		for(int i=0;i<8;i++) {
			dir[i] = caoZuo[i][1];
			step[i] = Integer.parseInt(caoZuo[i][2]);
		}
	}
	public int ChuLi() {
		for(int i=0;i<4;i++) {
			//System.out.println(caoZuo[i][0]+" 1 "+team1.get(i).getName());
			if(caoZuo[i][0].equals(team1.get(i).getName())&&step[i]>0) {
				step[i]--;
				//System.out.println(step[i]);
				int x = posRole1[i][0]; int y = posRole1[i][1];
				if(dir[i].equals("W")&&x>0&&(!(x>3&&x<15&&y>9&&y<30))) 
					posRole1[i][0]--;
				else if(dir[i].equals("S")&&x<19&&(!(x>3&&x<15&&y>9&&y<30)))
					posRole1[i][0]++;
				else if(dir[i].equals("A")&&y>0&&(!(x>3&&x<15&&y>9&&y<30)))
					posRole1[i][1]--;
				else if(dir[i].equals("D")&&y<39&&(!(x>3&&x<15&&y>9&&y<30)))
					posRole1[i][1]++;
			}
		}
		for(int i=4;i<8;i++) {
			if(caoZuo[i][0].equals(team2.get(i-4).getName())&&step[i]>0) {
				step[i]--;
				int x = posRole2[i-4][0]; int y = posRole2[i-4][1];
				if(dir.equals("W")&&x>0&&(!(x>3&&x<15&&y>9&&y<30)))
					posRole2[i-4][0]--;
				else if(dir[i].equals("S")&&x<19&&(!(x>3&&x<15&&y>9&&y<30)))
					posRole2[i-4][0]++;
				else if(dir[i].equals("A")&&y>0&&(!(x>3&&x<15&&y>9&&y<30)))
					posRole2[i-4][1]--;
				else if(dir[i].equals("D")&&y<39&&(!(x>3&&x<15&&y>9&&y<30)))
					posRole2[i-4][1]++;
			}
		}
		flag = 0;
		for(int i=0;i<8;i++)
			if(step[i]> 0) {
				flag = 1;
				//System.out.println(step[i]+ " "+i);
			}
		return flag;
	}
	public int[][] getPosRole1() {
		return posRole1;
	}
	public int[][] getPosRole2() {
		return posRole2;
	}
}
