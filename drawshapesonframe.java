package Frames;
import java.awt.Component;
import java.awt.*;
public class firstframe{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("My First Frame");
		f.setSize(400,300);
		f.add(new MyComponent());
		f.setVisible(true);
	}
	static class MyComponent extends Component{
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(50, 100, 60, 120);
		g.setColor(Color.BLACK);
		g.drawLine(50, 180, 120, 300);
		g.setColor(Color.BLACK);
		g.fillOval(190, 250, 320, 290);
		g.setColor(Color.BLACK);
		g.drawRoundRect(110, 220, 150, 300, 120, 360);
		g.setColor(Color.BLUE);
		g.fillArc(90, 130, 145, 165, 180,60);
		
		
	}
	}
}
