import java.awt.event.*;
import java.awt.Component;
public class Program extends Frame{
	public Frame frame,frame1;
	Program(){
		frame1=new Frame();
		frame1.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				frame1.dispose();}
		});
		frame1.setTitle("frame1");
		frame1.setSize(800,800);
		frame1.setLayout(null);
		frame1.setVisible(true);
		frame1.setBackground(Color.BLACK);
		Button b1 = new Button("NEXT");
		b1.setBounds(300,250,100,80);
		b1.setBackground(Color.pink);
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				frame = new Frame();
				frame.setTitle("frame2");
				frame.setSize(800,800);
				frame.setBackground(Color.white);
				frame.setLayout(null);
				Label titleLabel = new Label("WELCOME TO NEW FRAME!");
				titleLabel.setFont(new Font("Arial",Font.BOLD, 18)); 
		        titleLabel.setBounds(300,100,500,100); 
		        frame.add(titleLabel);
				Button b3 = new Button("NEXT");
				b3.setBounds(300,350,100,80);
				b3.setBackground(Color.YELLOW);
				frame.addWindowListener(new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						frame.dispose();}
				});
				frame.setVisible(true);
				frame.add(b3);
			}
		});
		frame1.add(b1);
		Button b2 = new Button("Close");
		b2.setBounds(300,350,100,80);
		b2.setBackground(Color.pink);
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {	
				System.exit(0);		
			}
		});
		frame1.add(b2);
}
public static void main(String[] args) {
	new Program();
}
}
