import java.lang.Math;
class tools{
	int x;
	String y;
	String z;
	public double sqrt(){
		int x = 64;
		double sq=Math.sqrt(x);
		return(sq);}
	public String touc(){
		String y = "java";
		String up=y.toUpperCase();
		return (up);}
	public String tolc(){
		String z ="JAVA";
		String lw=z.toLowerCase();
		return (lw);}
	public static void main(String args[]){
	tools a = new tools();
	tools b = new tools();
	tools c = new tools();
	System.out.println(a.sqrt());
	System.out.println(b.touc());
	System.out.println(b.tolc());
}
}
