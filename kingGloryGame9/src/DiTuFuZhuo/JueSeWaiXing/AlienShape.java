package DiTuFuZhuo.JueSeWaiXing;

import DiTuFuZhuo.JueSe;
import java.awt.*;
import javax.swing.*;

public class AlienShape extends JComponent  {
		private Image image;
		public AlienShape()
		{
			image = new ImageIcon("image/wolf.jpg").getImage();
		}

	   /*public void paintComponent(Graphics g)
	   {
	      if (image == null) return;
	      g.drawImage(image, 800, 30, 30, 30, null);   
	   }*/
}
