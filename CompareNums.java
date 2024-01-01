package cse225g1;
import java.util.*;
public class prob4b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		if (a > b && a>c) {
			System.out.println("The Greatest is "+a);
		}
		else if(b>a && b>c) {
			System.out.println("The Greatest is "+b);
		}
		else {
			System.out.println("The Greatest is "+c);
		}
	}

}
