package DiTuFuZhuo.JueSeWaiXing;

import java.awt.*;
import javax.swing.*;

public class Shape_bear extends JLabel {
	int x,y;
	int width = 40,height = 40;
	public Shape_bear(int x,int y)
	{
		this.x = x; this.y = y;
		ImageIcon image = new ImageIcon("image/bear.png");
		image.setImage(image.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT ));
		setIcon(image);
		setBounds(x, y, width, height);
	}
}
