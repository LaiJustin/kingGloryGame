package kingGloryGame;
import java.awt.*;
import javax.swing.*;
import java.util.*;

import DiTuFuZhuo.ZhuDongJiNenShuXing.*;
import DiTuFuZhuo.BeiDongJiNengShuXing.*;
import Role.*;
import ZhanChangKongZhi.HuiHeKongZhi.*;
import ZhanChangKongZhi.JiBenDiTu.*;

import java.util.ArrayList;

import javax.swing.JFrame;

public class Main {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(() ->
        {
           JFrame frame = new JiBenDiTu();
           RenWuChuShiHua start  = new RenWuChuShiHua();
        });
	}
}

		//角色创建
		/*Role hero1 = new Alien("player1",new HuoQiu(),new XuanFeng(),new BuDiaoXue());
		Role hero2 = new Alien("player2",new HuoQiu(),new XuanFeng(),new BuDiaoXue());
		Role hero3 = new Alien("player3",new DianJi(),new XuanFeng(),new BuDiaoXue());
		Role hero4 = new Alien("player4",new ZhiLiao(),new XuanFeng(),new BuDiaoXue());
		Role hero5 = new Robot("player5",new YiZiZhan(),new XuanFeng(),new BuDiaoXue());
		Role hero6 = new Robot("player6",new HuoQiu(),new XuanFeng(),new BuDiaoXue());
		Role hero7 = new Robot("player7",new HuoQiu(),new XuanFeng(),new BuDiaoXue());
		Role hero8 = new Robot("player8",new HuoQiu(),new XuanFeng(),new BuDiaoXue());
		Scanner in = new Scanner(System.in);
		//角色和技能形状
		ShapeOfRoleAndSkill shape = new ShapeOfRoleAndSkill();
		//人物初始化对象
		RenWuChuShiHua sta = new RenWuChuShiHua();
		//输入对象
		String shuRu[] = new String[8];
		//角色位置对象
		JueSeWeiZhi posRole = new JueSeWeiZhi();
		//技能位置对象
		JiNengWeiZhi posSkill = new JiNengWeiZhi();
		//每位英雄初始化
		sta.SetRole(hero1, 1);
		sta.SetRole(hero2, 1);
		sta.SetRole(hero3, 1);
		sta.SetRole(hero4, 1);
		sta.SetRole(hero5, 2);
		sta.SetRole(hero6, 2);
		sta.SetRole(hero7, 2);
		sta.SetRole(hero8, 2);
		sta.SetPosAndShape(posRole,shape);
		*/
		//战场控制对象
		
		//ZhanChangZhanShi HHKZ = new ZhanChangZhanShi();
//		HHKZ.Show(shape,posRole,posSkill);
//		System.out.println();
		//玩家输入对象
		//WanJiaShuRu sR = new WanJiaShuRu(sta,posRole,shape);
//		for(int i=0;i<3;i++){
//			for(int j=0;j<8;j++) {
//				shuRu[j] = in.nextLine();
//			}
			//对输入进行处理
//			sR.setShuRu(shuRu);
//			sR.HuiHe();
			//new Thread(new Runnable() {
	          //  public void run() {
//	            	sR.JueSeChuLi();
//	            	sR.JiNengChuLi();
//	            	shape = sR.getShape();
//					posRole.moveRoleAll(sR.getPosRole());
//					posSkill.moveSkillAll(sR.getPosSkill());
		//HHKZ.Change(shape,posRole,posSkill);
//		for(int i=0; i<50; i++) {
//			Thread t = new Thread(posRole);
//			t.start();
//			try {t.sleep(300);}
//			catch(InterruptedException e) {}
//		}
		
					/*	try {
		                    Thread.sleep(500);
		                } catch (InterruptedException e) {
		                    e.printStackTrace();
		                }*/
	            //}
	       // }).start();

