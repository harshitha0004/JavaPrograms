import java.util.*;
class isdiv{
int x;
public String div(int x,int y){
if(x%y==0){
return("True");}
else{
return("False");}
}
public static void main(String args[]){
System.out.println("ENTER A NUMBER YOU WANT TO CHECK: ");
Scanner input=new Scanner(System.in);
int num = input.nextInt();
System.out.println("ENTER A NUMBER YOU WANT TO CHECK THE DIVISIBILITY: ");
int num1 = input.nextInt();
isdiv a = new isdiv();
System.out.println(a.div(num,num1));
input.close();
}
}
