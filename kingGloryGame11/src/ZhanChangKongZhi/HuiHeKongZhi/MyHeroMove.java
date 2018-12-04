package ZhanChangKongZhi.HuiHeKongZhi;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import java.math.*;

/**
 * 
 * @author dreamson
 *
 */
public class MyHeroMove extends Thread implements Runnable {
	private Point moveDir = new Point();
	private JLabel myHero;
	int x, y;
	int width,height;
	boolean isEast;
	public MyHeroMove(JLabel myHero) {
		this.myHero = myHero;
		width = myHero.getWidth(); height = myHero.getHeight();
//		System.out.println(123);
		
	}
	public void setMoveDir(Point Dir) {
		moveDir.setLocation((int)Dir.getX()-width/2, (int)Dir.getY()-height/2); 
	}
	
	public synchronized void run(){
		while(!isInterrupted())
		{
			try {
				x = myHero.getX();	y =myHero.getY();					
	//			判断是否向东走
				isEast = isEast(x-moveDir.getX());
						
	//			斜率为：	(y-moveDir.getY())/(x-moveDir.getX())
				Point p = eachTimeMoveDistance((y-moveDir.getY())/(x-moveDir.getX()),isEast);
				if(isStop(x,y)) {
					break;
				}
				else {
					myHero.setBounds((int)(x-p.getX()), (int)(y-p.getY()), width, height);
	//				System.out.println(x+" "+y);
					}
				this.sleep(80);
				} catch (InterruptedException e) {
					e.printStackTrace();
					System.out.println(123);
				}
//			myHero.repaint();
		}
	}
		
	
//	计算每一步移动距离
	private Point eachTimeMoveDistance( double k, boolean isEast) {
		Point p =new Point();
		p.x =(int) (10 * Math.cos(Math.atan(k)));
		p.y = (int) (10 * Math.sin(Math.atan(k)));
		if(isEast) {p.x = -p.x; p.y = -p.y;}
		return p;
	}
	
	private boolean isEast(double num) {
		if(num>0)
			return false;
		return true;
	}
	
//	判断角色移动是否结束
	private boolean isStop(int x,int y) {
		if(Math.abs(x-moveDir.getX())<5 && Math.abs(y-moveDir.getY())<5) 
			return true;
		return false ;
	}
}

