package cse225g1;
import java.util.*;
public class trycatch {
	public int fact(int n) {
		try {
			if(n<0) {
				throw new IllegalArgumentException("Factorial is not defined for negative number");
			}
			if(n==0 || n==1) {
				return 1;
			}
			else {
				return n*fact(n-1);
			}
		}
		catch(Exception e) {
			System.out.println("Exception: " + e.getMessage());
			return -1;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp=new Scanner(System.in);
		int x;
		System.out.println("Enter value of number:");
		x=inp.nextInt();
		trycatch obj = new trycatch();
		int res=obj.fact(x);
		if(res!=-1) {
			System.out.println("The Factorial is: "+res);
		}
		

	}

}
