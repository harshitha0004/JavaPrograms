import java.util.*;
class largest{
public int compare(int x,int y,int z){
if(x>y && x>z){
return(x);}
else if(x<y && y>z){
return(y);}
else{
return(z);}
}
public static void main(String args[]){
System.out.println("ENTER THE NUMBERS TO COMPARE:");
Scanner input=new Scanner(System.in);
System.out.println("ENTER FIRST NUMBER:");
int l = input.nextInt();
System.out.println("ENTER SECOND NUMBER:");
int m = input.nextInt();
System.out.println("ENTER THIRD NUMBER:");
int n = input.nextInt();
largest obj = new largest();
System.out.println("THE LARGEST NUMBER IS: "+obj.compare(l,m,n));
input.close();}
}
