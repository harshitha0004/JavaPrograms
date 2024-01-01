package frames;
import java.awt.*;
import java.awt.event.*;
import java.awt.Component;
public class buttonevent extends Frame{
  buttonevent(){
	  addWindowListener(new WindowAdapter()
	 {
		  public void windowClosing(WindowEvent e)
		  {
			  dispose();
		  }
	 });
	  setTitle("Events");
	  setSize(600,800);
	  setLayout(null);
	  Button blue = new Button("BLUE");
	  blue.setBounds(300,250,120,60);
	  blue.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
              setBackground(Color.BLUE);
          }
      });
	  add(blue);
	  
	  Button yellow = new Button("YELLOW");
	  yellow.setBounds(300,320,120,60);
	  yellow.addActionListener(new ActionListener() {
	     public void actionPerformed(ActionEvent e)
		{
		      setBackground(Color.YELLOW);
			  }
	  });
	  add(yellow);
	  Button pink = new Button("PINK");
	  pink.setBounds(300,390,120,60);
	  pink.addActionListener(new ActionListener() {
		  public void actionPerformed(ActionEvent e)
		  {
			  setBackground(Color.magenta);
		  }
	  });
	  add(pink);
	  setVisible(true);	  
  }
  public static void main(String[] args) {
	  new buttonevent();
  }
}
