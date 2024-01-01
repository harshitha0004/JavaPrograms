package cse225g1;
import java.awt.*;
import java.awt.event.*;
import java.awt.Component;
public class perform extends Frame {
	public Frame f;
	public perform() {
		f = new Frame();
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
        f.setTitle("operations");
        f.setSize(1000,1600);
        f.setLayout(null);
        f.setVisible(true);
        Label l=new Label("PERFORM YOUR OPERATIONS!!");
        l.setFont(new Font("Arial", Font.BOLD, 22));
        l.setBounds(330,100,500,100);
        f.add(l);
        Label l1=new Label("NUM1:");
        l1.setFont(new Font("Arial", Font.BOLD, 18));
        l1.setBounds(80,304,100,30);
        f.add(l1);
        TextField t1 = new TextField();
        t1.setFont(new Font("Arial", Font.BOLD, 18));
        t1.setBounds(190, 298, 90, 60); 
        f.add(t1);
        Label l2=new Label("NUM2:");
        l2.setFont(new Font("Arial", Font.BOLD, 18));
        l2.setBounds(80,441,100,30);
        f.add(l2);
        TextField t2 = new TextField();
        t2.setFont(new Font("Arial", Font.BOLD, 18));
        t2.setBounds(190, 435, 90, 60); 
        f.add(t2);
        Label l3=new Label("RESULT:");
        l3.setFont(new Font("Arial", Font.BOLD, 18));
        l3.setBounds(560,341,100,30);
        f.add(l3);
        Label l4=new Label();
        l4.setFont(new Font("Arial", Font.BOLD, 18));
        l4.setBounds(680,341,200,30);
        f.add(l4);
        Button b1 =new Button("ADD");
        b1.setFont(new Font("Arial", Font.BOLD, 16));
        b1.setBounds(120,591,120,60);
        f.add(b1);
        Button b2 =new Button("SUBTRACT");
        b2.setFont(new Font("Arial", Font.BOLD, 16));
        b2.setBounds(270,591,120,60);
        f.add(b2);
        Button b3 =new Button("MULTIPLY");
        b3.setFont(new Font("Arial", Font.BOLD, 16));
        b3.setBounds(420,591,120,60);
        f.add(b3);
        Button b4 =new Button("DIVIDE");
        b4.setFont(new Font("Arial", Font.BOLD, 16));
        b4.setBounds(590,591,120,60);
        f.add(b4);
        b1.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e) {
                try {
                    String num1 = t1.getText();
                    String num2 = t2.getText();
                    float n2 = Float.parseFloat(num2);
                    float n1 = Float.parseFloat(num1);
                    float result = n1 + n2;
                    l4.setText(Float.toString(result));
                } catch (NumberFormatException ex) {
                    l4.setText("Invalid input");
            }}
			});
        b2.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e) {
                try {
                    String num1 = t1.getText();
                    String num2 = t2.getText();
                    float n2 = Float.parseFloat(num2);
                    float n1 = Float.parseFloat(num1);
                    float result = n1 - n2;
                    l4.setText(Float.toString(result));
                } catch (NumberFormatException ex) {
                    l4.setText("Invalid input");
            }}
			});
        b3.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e) {
                try {
                    String num1 = t1.getText();
                    String num2 = t2.getText();
                    float n2 = Float.parseFloat(num2);
                    float n1 = Float.parseFloat(num1);
                    float result = n1 * n2;
                    l4.setText(Float.toString(result));
                } catch (NumberFormatException ex) {
                    l4.setText("Invalid input");
            }}
			});
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String num1 = t1.getText();
                    String num2 = t2.getText();
                    float n1 = Float.parseFloat(num1);
                    float n2 = Float.parseFloat(num2);
                    if (n2 == 0.0f || n1 == 0.0f) {
                        throw new ArithmeticException("Cannot divide by zero");
                    }
                    float result = n1 / n2;
                    l4.setText(Float.toString(result));
                } catch (NumberFormatException ex) {
                    l4.setText("Invalid input");
                } catch (ArithmeticException ex) {
                    l4.setText("Cannot divide by zero");
                }
            }
        });

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new perform();

	}

}
