package ZhanChangKongZhi.HuiHeKongZhi;
import java.awt.*;
import java.util.*;
import javax.swing.*;

public class ShapeOfRoleAndSkill extends JComponent {
	public Vector<JComponent> RoleShape = new Vector<>();
	private Vector<Image> teamSkillShape = new Vector<>();
	public ShapeOfRoleAndSkill(){
	}
	public void setShapeRole(JComponent shape) {
			RoleShape.add(shape);
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
