package ZhanChangKongZhi.JiBenDiTu;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class congLin extends JPanel{

	   private Image image;
	   public congLin()
	   {
	      image = new ImageIcon("image/congLin.jpg").getImage();
	   }
	   public void paintComponent(Graphics g)
	   {
	      if (image == null) return;
	      g.drawImage(image, 0, 0, 900, 800, null);   
	   }
	   public void paint(Graphics g) {
		   super.paint(g);
	   }
}
