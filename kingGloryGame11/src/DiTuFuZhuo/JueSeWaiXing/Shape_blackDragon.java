package DiTuFuZhuo.JueSeWaiXing;

import java.awt.*;
import javax.swing.*;

public class Shape_blackDragon extends JLabel  {
	int x,y;
	int width = 50,height = 50;
	public Shape_blackDragon(int x,int y)
	{
		this.x = x; this.y = y;
		ImageIcon image = new ImageIcon("image/blackDragon.png");
		image.setImage(image.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT ));
		setIcon(image);
		setBounds(x, y, width, height);
	}
}
