import java.util.*;
class isevenodd{
public String check(int x){
if(x%2==0){
return("Even");}
else{
return("Odd");}
}
public static void main(String args[]){
System.out.println("ENTER A NUMBER YOU WANT TO CHECK:");
Scanner input=new Scanner(System.in);
int num=input.nextInt();
isevenodd a = new isevenodd();
System.out.println(a.check(num));
input.close();
}
}
