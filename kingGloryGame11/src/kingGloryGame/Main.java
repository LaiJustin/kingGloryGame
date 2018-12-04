package kingGloryGame;
import java.awt.*;
import javax.swing.*;
import java.util.*;

import DiTuFuZhuo.ZhuDongJiNenShuXing.*;
import DiTuFuZhuo.BeiDongJiNengShuXing.*;
import Role.*;
import ZhanChangKongZhi.HuiHeKongZhi.*;
import ZhanChangKongZhi.JiBenDiTu.*;

import javax.swing.JFrame;

public class Main {
	public Vector<Role> hero = new Vector<>(); 
	public static void main(String[] args) {
		
		EventQueue.invokeLater(() ->
        {
//        	选择页面
//        	选择英雄和战场Button
//			创建战场
        	ZhanChangZhanShi ZhanChangZhanShi = new ZhanChangZhanShi();
//        	载入英雄(自己英雄/机器英雄)
        	RenWuChuShiHua RenWuChuShiHua =new RenWuChuShiHua(new blackDragon());
        	ZhanChangZhanShi.setRoleAndSkillShape(RenWuChuShiHua.getRoleAndSkillShape());
        	ZhanChangZhanShi.setRole();
//			玩家输入   
//        	(角色移动)
//        	(技能发出)
        	
//        	战场展示
			ZhanChangZhanShi.zhanShiDiTu();
        });
	}
}

