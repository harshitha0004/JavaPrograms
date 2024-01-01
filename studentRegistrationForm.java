package Frames;
import java.awt.*;
import java.awt.event.*;
import java.awt.Component;
public class registration extends Frame{
	registration(){
		addWindowListener(new WindowAdapter()
		{
		public void windowClosing(WindowEvent e)
		{
			dispose();
		}
		});
		setTitle("STUDENT REGISTRATION FORM");
		setSize(1000,1600);
		setLayout(null);
		setVisible(true);
		Label titleLabel = new Label("STUDENT REGISTRATION FORM");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18)); 
        titleLabel.setBounds(350,100,500,100); 
        add(titleLabel);
        Label nameLabel = new Label("Student Name:");
        nameLabel.setBounds(80, 198, 100, 30); 
        add(nameLabel);
        TextField nameField = new TextField();
        nameField.setBounds(190, 198, 200, 30); 
        add(nameField);
        Label rollLabel = new Label("Roll Number:");
        rollLabel.setBounds(80, 235, 100, 30); 
        add(rollLabel);
        TextField rollField = new TextField();
        rollField.setBounds(190, 235, 200, 30); 
        add(rollField);
        Label emailLabel = new Label("Email:");
        emailLabel.setBounds(80, 279, 100, 30);
        add(emailLabel);
        TextField emailField = new TextField();
        emailField.setBounds(190, 279, 200, 30); 
        add(emailField);
        Label dobLabel = new Label("Date Of Birth:");
        dobLabel.setBounds(80, 325, 100, 30);
        add(dobLabel);
        TextField dobField = new TextField();
        dobField.setBounds(190, 325, 200, 30); 
        add(dobField);
        Label passwordLabel = new Label("Password:");
        passwordLabel.setBounds(80, 365, 100, 30);
        add(passwordLabel);
        TextField passwordField = new TextField();
        passwordField.setBounds(190, 365, 200, 30); 
        add(passwordField);
        Button registerButton = new Button("Register");
        registerButton.setBounds(350, 500, 100, 30); 
        add(registerButton);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new registration();
	}
}
