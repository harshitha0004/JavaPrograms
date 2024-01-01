import java.lang.Math;
class tools{
	int x;
	String y;
	String z;
	public double sqrt(double x){
		return (Math.sqrt(x));}
	public String touc(String y){
		return(y.toUpperCase());}
	public String tolc(String z){
		return (z.toLowerCase());}
	public static void main(String args[]){
	tools a = new tools();
	tools b = new tools();
	tools c = new tools();
	System.out.println(a.sqrt(36));
	System.out.println(b.touc("hero"));
	System.out.println(b.tolc("HEROINE"));
}
}
