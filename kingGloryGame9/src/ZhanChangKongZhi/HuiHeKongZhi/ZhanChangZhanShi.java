package ZhanChangKongZhi.HuiHeKongZhi;

import java.awt.*;

import javax.swing.*;

public class ZhanChangZhanShi extends JFrame{
		//战场初始化
		private String field2[][] = new String[800][600];
		//角色外形
		private String shapeT[] = new String [8];
		//技能外形
		private String shapeS[] = new String [8];
		//角色位置
		private int Roleposition[][] = new int [8][2];
		//技能位置
		private int Skillposition[][] = new int [8][2];
		//战场展示
		public void Change(ShapeOfRoleAndSkill shape,JueSeWeiZhi posR,JiNengWeiZhi posS) {
			//this.setTitle("Move Text Demo");
			//this.setSize(800,600);
//			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//			JTextArea text = new JTextArea();
//			JFrame origin = new JiBenDiTu();
//			JButton bu = new JButton(); 
//			bu.setSize(30, 40);
			int x,y,i;
			//field2 = origin.getField();
//			shapeT = shape.getShapeRole();
//			shapeS = shape.getShapeSkill();
			Roleposition = posR.getPosRole();
			Skillposition = posS.getPosSkill();
			/*for (x=0;x<20;x++)
				for(y=0;y<40;y++) {
					for(i=0;i<4;i++) {
						if(Roleposition[i][0]==x&&Roleposition[i][1]==y) {
							field2[x][y] = shapeT[i];
						}
						if(Roleposition[i+4][0]==x&&Roleposition[i+4][1]==y) {
							field2[x][y] = shapeT[i+4];
						}
						if(Skillposition[i][0]==x&&Skillposition[i][1]==y) {
							field2[x][y] = shapeS[i];
							//System.out.println(shapeS[i]);
						}
						if(Skillposition[i+4][0]==x&&Skillposition[i][1]==y) {
							field2[x][y] = shapeS[i+4];
						}
					}
				}
			this.setVisible(true);*/
		}
}
