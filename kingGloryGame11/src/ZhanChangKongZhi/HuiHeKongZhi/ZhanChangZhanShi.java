package ZhanChangKongZhi.HuiHeKongZhi;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;
import javax.swing.*;

import DiTuFuZhuo.JueSeWaiXing.*;
import ZhanChangKongZhi.JiBenDiTu.*;

public class ZhanChangZhanShi extends JFrame{
		public JPanel diTu;
		public roleMove moveListener;
		private Point moveDir ;
		private Point pushDir ;
		private RoleAndSkillShape RoleAndSkillShape;
		private MyHeroMove MyHeroMove;
		public ZhanChangZhanShi() {
			setSize(900,820);
			setTitle("王者荣耀-简陋版");
		 	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 	setVisible(true);
			moveListener = new roleMove();
			RoleAndSkillShape = new RoleAndSkillShape();
			moveDir = new Point();
			pushDir = new Point();
			chooseDiTu();
		}
		public void chooseDiTu() {
			diTu = new huangYuan();
			diTu.setLayout(null);
			setContentPane(diTu);
			diTu.addMouseListener(moveListener);
		}
		
		
		public void setRole() {
			diTu.add(RoleAndSkillShape.roleShape.get(0));
			diTu.add(RoleAndSkillShape.roleShape.get(1));
			diTu.add(RoleAndSkillShape.roleShape.get(2));
			diTu.add(RoleAndSkillShape.roleShape.get(3));
			diTu.add(RoleAndSkillShape.roleShape.get(4));
			diTu.add(RoleAndSkillShape.roleShape.get(5));
			diTu.add(RoleAndSkillShape.roleShape.get(6));
			
			MyHeroMove = new MyHeroMove(RoleAndSkillShape.roleShape.get(0));
			moveDir.x = RoleAndSkillShape.roleShape.get(0).getX();
			moveDir.y = RoleAndSkillShape.roleShape.get(0).getY();
			MyHeroMove.setMoveDir(moveDir);
			MyHeroMove.start();
			
		}
		
		public void zhanShiDiTu() {
		}
		
		public  class roleMove extends MouseAdapter {
			public void mouseClicked(MouseEvent e) {
				
				moveDir.x = e.getX();
				moveDir.y = e.getY();
				MyHeroMove.setMoveDir(moveDir);
//				为所控制的英雄创一个线程
			}
			public void mouseMoved(MouseEvent e) {
				pushDir.x = e.getX();
				pushDir.y = e.getY();
			}
		}
		public void setRoleAndSkillShape(RoleAndSkillShape s) {
			RoleAndSkillShape = s;
		}
}


