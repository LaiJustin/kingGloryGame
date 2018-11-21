package ZhanChangKongZhi.JiBenDiTu;

import java.awt.*;
import javax.swing.*;

public class JiBenDiTu extends JFrame{
	public JiBenDiTu()
	   {
		   setSize(900,820);
		   add(new ImageComponent());
		   setTitle("王者荣耀-简陋版");
		   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   setResizable(false);
		   setVisible(true);
	   }
}
class ImageComponent extends JComponent
{

   private Image image;

   public ImageComponent()
   {
      image = new ImageIcon("image/diTu.jpg").getImage();
   }

   public void paintComponent(Graphics g)
   {
      if (image == null) return;
      g.drawImage(image, 0, 0, 900, 800, null);   
   }
}
   
   
