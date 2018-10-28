package ZhanChangKongZhi.HuiHeKongZhi;

import ZhanChangKongZhi.JiBenDiTu.JiBenDiTu;

public class ZhanChangZhanShi {
		//战场初始化
		private String field2[][] = new String[20][40];
		private String shapeT1[] = new String [4];
		private String shapeT2[] = new String [4];
		private int position1[][] = new int [4][2];
		private int position2[][] = new int [4][2];
		//战场展示
		public void ZhanChangZhanShi() {
			}
		public void Show(RenWuChuShiHua stickRole,JueSeWeiZhi pos) {
			JiBenDiTu origin = new JiBenDiTu();
			int x,y,i;
			field2 = origin.getField();
			shapeT1 = stickRole.getShapeT1();
			shapeT2 = stickRole.getShapeT2();
			position1 =pos.getPosRole1();
			position2 =pos.getPosRole2();
			for (x=0;x<20;x++)
				for(y=0;y<40;y++) {
					for(i=0;i<4;i++) {
						if(position1[i][0]==x&&position1[i][1]==y) {
							field2[x][y] = shapeT1[i];
						}
						if(position2[i][0]==x&&position2[i][1]==y) {
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
