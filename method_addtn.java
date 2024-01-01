public class sum{
public int sum(int x , int y){
return(x+y);}
public int sum(int x,int y,int z){
return (x+y+z);}
public double sum(double x,double y,double z){
return (x+y+z);}
public static void main(String args[]){
sum s = new sum();
sum s1 = new sum();
sum s2 = new sum();
System.out.println(s.sum(10,20));
System.out.println(s1.sum(10,20,30));
System.out.println(s2.sum(10.3,20.7,15.5));
}
}
