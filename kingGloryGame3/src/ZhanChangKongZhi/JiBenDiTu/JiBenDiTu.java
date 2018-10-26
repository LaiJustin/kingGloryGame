package ZhanChangKongZhi.JiBenDiTu;

public class JiBenDiTu {
	private String field[][] = new String [20][40];
	public JiBenDiTu(){
		int x,y;
		for (x=0;x<20;x++)
			for(y=0;y<40;y++)
				if(x>3&&x<15&&y>9&&y<30)
					field[x][y] = "🌳";
				else
					field[x][y] = "⬜";
	}
	public String[][] getField() {
		return field;
	}
	
}
