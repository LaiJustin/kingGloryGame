package DiTuFuZhuo.JueSeWaiXing;

import DiTuFuZhuo.JueSe;
import ZhanChangKongZhi.HuiHeKongZhi.JueSeWeiZhi;

import java.awt.*;
import javax.swing.*;

public class Shape_blackDragon extends JLabel  {
		public Shape_blackDragon()
		{
			ImageIcon image = new ImageIcon("image/blackDragon.png");
			image.setImage(image.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT ));
			setIcon(image);
			setSize(10,10);
		}
}
