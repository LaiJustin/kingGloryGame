package ZhanChangKongZhi.HuiHeKongZhi;
import java.awt.*;
import java.util.*;
import javax.swing.*;

public class ShapeOfRoleAndSkill extends JComponent {
	private Vector<Image> team1RoleShape = new Vector<>();
	private Vector<Image> team2RoleShape = new Vector<>();
	private Vector<Image> team1SkillShape = new Vector<>();
	private Vector<Image> team2SkillShape = new Vector<>();
	public ShapeOfRoleAndSkill(){
	}
	public void setShapeRole(int i, Image shape) {
		if(i==1)
			team1RoleShape.add(shape);
		else 
			team2RoleShape.add(shape);
	}
	/*public void setShapeSkill(int i, String shape) {
		shapeSkill[i] = shape;
	}
	public String[] getShapeRole() {
		return shapeRole;
	}
	public String[] getShapeSkill() {
		return shapeSkill;
	}*/
}
