package ZhanChangKongZhi.HuiHeKongZhi;

import ZhanChangKongZhi.JiBenDiTu.JiBenDiTu;

public class ZhanChangZhanShi {
		//战场初始化
		private String field2[][] = new String[20][40];
		//角色外形
		private String shapeT[] = new String [8];
		//技能外形
		private String shapeS[] = new String [8];
		//角色位置
		private int Roleposition[][] = new int [8][2];
		//技能位置
		private int Skillposition[][] = new int [8][2];
		//战场展示
		public void Show(RenWuChuShiHua stickRole,JueSeWeiZhi pos) {
			JiBenDiTu origin = new JiBenDiTu();
			int x,y,i;
			field2 = origin.getField();
			shapeT = stickRole.getShapeT();
			Roleposition =pos.getPosRole();
			for (x=0;x<20;x++)
				for(y=0;y<40;y++) {
					for(i=0;i<4;i++) {
						if(Roleposition[i][0]==x&&Roleposition[i][1]==y) {
							field2[x][y] = shapeT[i];
						}
						if(Roleposition[i+4][0]==x&&Roleposition[i+4][1]==y) {
							field2[x][y] = shapeT[i+4];
						}
					}
				}
			for (x=0;x<20;x++)
				for(y=0;y<40;y++) {
					System.out.print(field2[x][y]);
					if(y == 39)
						System.out.println();
				}
		}
}
