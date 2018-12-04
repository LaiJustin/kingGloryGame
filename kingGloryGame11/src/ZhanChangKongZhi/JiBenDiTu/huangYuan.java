package ZhanChangKongZhi.JiBenDiTu;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class huangYuan extends JPanel{
	   private Image image;
	   public huangYuan()
	   {
	      image = new ImageIcon("image/huangYuan.jpg").getImage();
	   }
	   public void paintComponent(Graphics g)
	   {
	      if (image == null) return;
	      g.drawImage(image, 0, 0, 900, 800, null);   
	   }
}
