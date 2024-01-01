import java.util.*;
class swap{
public static void main(String args[]){
System.out.println("ENTER NUMBERS TO PERFORM SWAPPING:");
Scanner input=new Scanner(System.in);
System.out.println("ENTER FIRST NUMBER:");
int x=input.nextInt();
System.out.println("ENTER SECOND NUMBER:");
int y=input.nextInt();
int temp;
temp=x;
x=y;
y=temp;
System.out.println("FIRST NUMBER:"+ x);
System.out.println("SECOND NUMBER:"+ y);
}
}
