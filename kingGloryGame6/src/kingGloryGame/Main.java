package kingGloryGame;
import java.util.Scanner;

import DiTuFuZhuo.ZhuDongJiNenShuXing.*;
import Role.*;
import ZhanChangKongZhi.HuiHeKongZhi.*;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		/*;
		hero.setiSkill(new HuoQiu());
		hero.skill();*/
		Role hero1 = new Alien("player1",new HuoQiu());
		Role hero2 = new Alien("player2",new XuanFeng());
		Role hero3 = new Alien("player3",new XuanFeng());
		Role hero4 = new Alien("player4",new HuoQiu());
		Role hero5 = new Robot("player5",new DianJi());
		Role hero6 = new Robot("player6",new DianJi());
		Role hero7 = new Robot("player7",new YiZiZhan());
		Role hero8 = new Robot("player8",new YiZiZhan());
		Scanner in = new Scanner(System.in);
		RenWuChuShiHua sta = new RenWuChuShiHua();
		String shuRu[] = new String[8];
		JueSeWeiZhi pos = new JueSeWeiZhi();
		sta.SetRole(hero1, 1,pos);
		sta.SetRole(hero2, 1,pos);
		sta.SetRole(hero3, 1,pos);
		sta.SetRole(hero4, 1,pos);
		sta.SetRole(hero5, 2,pos);
		sta.SetRole(hero6, 2,pos);
		sta.SetRole(hero7, 2,pos);
		sta.SetRole(hero8, 2,pos);
		ZhanChangZhanShi HHKZ = new ZhanChangZhanShi();
		HHKZ.Show(sta,pos);
		WanJiaShuRu sR = new WanJiaShuRu(sta,pos);
		for(int i=0;i<3;i++){
			for(int j=0;j<8;j++) {
				shuRu[j] = in.nextLine();
			}
			sR.setShuRu(shuRu);
			sR.HuiHe();new Thread(new Runnable() {
	            public void run() {
	                //while(false) {
	                sR.JueSeChuLi();
					pos.moveRoleAll(sR.getPosRole1(), sR.getPosRole2());
					HHKZ.Show(sta,pos);
					System.out.println();
						try {
		                    Thread.sleep(500);
		                } catch (InterruptedException e) {
		                    e.printStackTrace();
		                }
					//}
	            }
	        }).start();
		}
	}
}
