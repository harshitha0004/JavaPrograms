package Frames;
import java.awt.*;
import java.awt.event.*;
public class WindowExample extends Frame{
	WindowExample(){
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				dispose();
			}
		});
		setSize(400,400);
		setBounds(30,60,80,120);
		setLayout(null);
		setVisible(true);
	}
	public void paint(Graphics g)
	{
		g.drawRect(200, 110, 120, 20);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new WindowExample();

	}

}
