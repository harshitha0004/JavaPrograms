package frames;
import java.awt.*;
import java.awt.event.*;
import java.awt.Component;

public class calculator extends Frame {
    TextField textField;

    public calculator() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        setTitle("Calculator");
        setSize(340, 340);
        setLayout(new BorderLayout());
        textField = new TextField();
        textField.setEditable(false);
        add(textField, BorderLayout.NORTH);

        Button button7 = new Button("7");
        Button button8 = new Button("8");
        Button button9 = new Button("9");
        Button buttonMultiply = new Button("*");
        Button button4 = new Button("4");
        Button button5 = new Button("5");
        Button button6 = new Button("6");
        Button buttonAdd = new Button("+");
        Button button1 = new Button("1");
        Button button2 = new Button("2");
        Button button3 = new Button("3");
        Button buttonSubtract = new Button("-");
        Button buttonDecimal = new Button(".");
        Button button0 = new Button("0");
        Button buttonEqual = new Button("=");
        Button buttonDivide = new Button("/");
        Button buttonac = new Button("AC");
        
        button7.setBounds(10, 50, 80, 50);
        button8.setBounds(90, 50, 80, 50);
        button9.setBounds(170, 50, 80, 50);
        buttonMultiply.setBounds(250, 50, 80, 50);
        
        button4.setBounds(10, 110, 80, 50);
        button5.setBounds(90, 110, 80, 50);
        button6.setBounds(170, 110, 80, 50);
        buttonAdd.setBounds(250, 110, 80, 50);
        
        button1.setBounds(10, 170, 80, 50);
        button2.setBounds(90, 170, 80, 50);
        button3.setBounds(170, 170, 80, 50);
        buttonSubtract.setBounds(250, 170, 80, 50);
        
        buttonDecimal.setBounds(10, 230, 80, 50);
        button0.setBounds(90, 230, 80, 50);
        buttonEqual.setBounds(170, 230, 80, 50);
        buttonDivide.setBounds(250, 230, 80, 50);
        buttonac.setBounds(250, 270, 80, 50);
        add(button7);
        add(button8);
        add(button9);
        add(buttonMultiply);
        add(button4);
        add(button5);
        add(button6);
        add(buttonAdd);
        add(button1);
        add(button2);
        add(button3);
        add(buttonSubtract);
        add(buttonDecimal);
        add(button0);
        add(buttonEqual);
        add(buttonDivide);
        add(buttonac);

        setVisible(true);
    }

    public static void main(String[] args) {
        new calculator();
    }
}
