package ZhanChangKongZhi.HuiHeKongZhi;

import ZhanChangKongZhi.JiBenDiTu.JiBenDiTu;

public class ZhanChangZhanShi {
		//战场初始化
		private String field2[][] = new String[20][40];
		//角色外形
		private String shapeT1[] = new String [4];
		private String shapeT2[] = new String [4];
		//技能外形
		private String shapeS1[] = new String [4];
		private String shapeS2[] = new String [4];
		//角色位置
		private int Roleposition1[][] = new int [4][2];
		private int Roleposition2[][] = new int [4][2];
		//技能位置
		private int Skillposition1[][] = new int [4][2];
		private int Skillposition2[][] = new int [4][2];
		//战场展示
		public void Show(RenWuChuShiHua stickRole,JueSeWeiZhi pos) {
			JiBenDiTu origin = new JiBenDiTu();
			int x,y,i;
			field2 = origin.getField();
			shapeT1 = stickRole.getShapeT1();
			shapeT2 = stickRole.getShapeT2();
			Roleposition1 =pos.getPosRole1();
			Roleposition2 =pos.getPosRole2();
			for (x=0;x<20;x++)
				for(y=0;y<40;y++) {
					for(i=0;i<4;i++) {
						if(Roleposition1[i][0]==x&&Roleposition1[i][1]==y) {
							field2[x][y] = shapeT1[i];
						}
						if(Roleposition2[i][0]==x&&Roleposition2[i][1]==y) {
							field2[x][y] = shapeT2[i];
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
