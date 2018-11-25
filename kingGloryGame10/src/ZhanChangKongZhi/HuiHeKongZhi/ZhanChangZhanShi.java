package ZhanChangKongZhi.HuiHeKongZhi;

import java.awt.*;

import javax.swing.*;

import DiTuFuZhuo.JueSeWaiXing.Shape_blackDragon;
import ZhanChangKongZhi.JiBenDiTu.congLin;

public class ZhanChangZhanShi extends JFrame{
		public JPanel diTu;
		//角色外形、技能外形
		public ShapeOfRoleAndSkill ShapeOfRoleAndSkill= new ShapeOfRoleAndSkill();
		//角色位置
        public JueSeWeiZhi JueSeWeiZhi = new JueSeWeiZhi();
		private int posRole[][] = new int [8][2];
		//技能位置
		private int posSkill[][] = new int [8][2];
		//战场展示
		public ZhanChangZhanShi() {
	           //posRole = JueSeWeiZhi.getPosRole();
	           chooseDiTu();
	           addRole();
		}
		public void chooseDiTu() {
			diTu = new congLin();
		}
		public void addRole() {
			diTu.add(new Shape_blackDragon());
		}
		public void setPos() {
			for(int i=0; i<8; i++) {
	        	   JComponent role = ShapeOfRoleAndSkill.RoleShape.get(i);
	        	   role.setAlignmentX(posRole[i][0]);
	        	   role.setAlignmentY(posRole[i][1]);
	           }
		}
		public void zhanShiDiTu(){
		   
			   setSize(900,820);
			   setContentPane(diTu);
			   setTitle("王者荣耀-简陋版");
			   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			   setVisible(true);
		}
		
}
