package frames;

import java.awt.*;

import java.awt.event.*;

public class add extends Frame{
	public Frame frame1;
	add()
	{
		frame1=new Frame();
		frame1.setTitle("1stFrame");
		frame1.setSize(600,600);
		frame1.setLayout(null);
		frame1.setVisible(true);
		 frame1.addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent e) {
	            frame1.dispose();
	         }
	     });

	Label l1=new Label("First Number : ");
	l1.setBounds(50,90,100, 30);
	frame1.add(l1);
	Label l2=new Label("Second Number : ");
	l2.setBounds(50,140,100, 70);
	frame1.add(l2);
	Label l3=new Label("Result: ");
	l3.setBounds(50,400,200, 30);
	frame1.add(l3);
	TextField t1 = new TextField();
	t1.setSize(50,50);
	t1.setBounds(200,90,100,30);
	t1.setVisible(true);
	frame1.add(t1);
	TextField t2 = new TextField();
	t2.setSize(50,50);
	t2.setBounds(200,160,100,30);
	t2.setVisible(true);
	frame1.add(t2);
	Button b1 = new Button("ADD");
	b1.setBounds(50,250, 100, 50);
	b1.setVisible(true);
	frame1.add(b1);
	b1.addActionListener(new ActionListener()
			{
		public void actionPerformed(ActionEvent e)

		{
			String s1=t1.getText();

			String s2=t2.getText();

			if(s1.isEmpty() || s2.isEmpty()) {



				l3.setText("Please Enter The data");

				}else {

				int a = Integer.parseInt(s1);

				int b = Integer.parseInt(s2);

				int c = a+b;

				String result = String.valueOf(c);

				l3.setText("Total :"+result);

				}

		}

		

			});

	Button b2=new Button("Subtract");

	b2.setBounds(150,250,100,50);

	frame1.add(b2);

	b2.addActionListener(new ActionListener()

	{

public void actionPerformed(ActionEvent e)

{

	String s1=t1.getText();

	String s2=t2.getText();

	if(s1.isEmpty() || s2.isEmpty()) {

		l3.setText("Please Enter The data");

		}else {

		int a = Integer.parseInt(s1);

		int b = Integer.parseInt(s2);

		int c = a-b;

		String result = String.valueOf(c);

		l3.setText("DIFFERENCE :"+result);

		}

}

	});

Button b3=new Button("Multiply");

b3.setBounds(250,250,100,50);

frame1.add(b3);

b3.addActionListener(new ActionListener()

{

public void actionPerformed(ActionEvent e)

{

String s1=t1.getText();

String s2=t2.getText();

if(s1.isEmpty() || s2.isEmpty()) {

	l3.setText("Please Enter The data");

	}else {

	int a = Integer.parseInt(s1);

	int b = Integer.parseInt(s2);

	int c = a*b;

	String result = String.valueOf(c);

	l3.setText("PRODUCT :"+result);

	}
}
});
Button b4=new Button("DIVIDE");

b4.setBounds(350,250,100,50);

frame1.add(b4);

b4.addActionListener(new ActionListener()

{

public void actionPerformed(ActionEvent e)

{

String s1=t1.getText();

String s2=t2.getText();

if(s1.isEmpty() || s2.isEmpty()) {



	l3.setText("Please Enter The data");

	}else {

	int a = Integer.parseInt(s1);

	int b = Integer.parseInt(s2);

	double c = a/b;

	String result = String.valueOf(c);

	l3.setText("QUOTIENT :"+result);

	}

}

});

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

      new add();

	}

	}
