package kingGloryGame;
import java.util.Scanner;

import DiTuFuZhuo.ZhuDongJiNenShuXing.*;
import DiTuFuZhuo.BeiDongJiNengShuXing.*;
import Role.*;
import ZhanChangKongZhi.HuiHeKongZhi.*;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		//角色创建
		Role hero1 = new Alien("player1",new HuoQiu(),new XuanFeng(),new BuDiaoXue());
		Role hero2 = new Alien("player2",new HuoQiu(),new XuanFeng(),new BuDiaoXue());
		Role hero3 = new Alien("player3",new HuoQiu(),new XuanFeng(),new BuDiaoXue());
		Role hero4 = new Alien("player4",new HuoQiu(),new XuanFeng(),new BuDiaoXue());
		Role hero5 = new Robot("player5",new HuoQiu(),new XuanFeng(),new BuDiaoXue());
		Role hero6 = new Robot("player6",new HuoQiu(),new XuanFeng(),new BuDiaoXue());
		Role hero7 = new Robot("player7",new HuoQiu(),new XuanFeng(),new BuDiaoXue());
		Role hero8 = new Robot("player8",new HuoQiu(),new XuanFeng(),new BuDiaoXue());
		Scanner in = new Scanner(System.in);
		//人物初始化对象
		RenWuChuShiHua sta = new RenWuChuShiHua();
		//输入对象
		String shuRu[] = new String[8];
		//角色位置对象
		JueSeWeiZhi posRole = new JueSeWeiZhi();
		//每位英雄初始化
		sta.SetRole(hero1, 1,posRole);
		sta.SetRole(hero2, 1,posRole);
		sta.SetRole(hero3, 1,posRole);
		sta.SetRole(hero4, 1,posRole);
		sta.SetRole(hero5, 2,posRole);
		sta.SetRole(hero6, 2,posRole);
		sta.SetRole(hero7, 2,posRole);
		sta.SetRole(hero8, 2,posRole);
		//战场控制对象
		ZhanChangZhanShi HHKZ = new ZhanChangZhanShi();
		HHKZ.Show(sta,posRole);
		//玩家输入对象
		WanJiaShuRu sR = new WanJiaShuRu(sta,posRole);
		for(int i=0;i<3;i++){
			for(int j=0;j<8;j++) {
				shuRu[j] = in.nextLine();
			}
			//对输入进行处理
			sR.setShuRu(shuRu);
			sR.HuiHe();
			new Thread(new Runnable() {
	            public void run() {
	                sR.JueSeChuLi();
					posRole.moveRoleAll(sR.getPosRole());
					HHKZ.Show(sta,posRole);
					System.out.println();
						try {
		                    Thread.sleep(500);
		                } catch (InterruptedException e) {
		                    e.printStackTrace();
		                }
	            }
	        }).start();
		}
	}
}
