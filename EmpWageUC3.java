public class EmpWageUC3 {
 
	private static int parttime = 1;
	private static int fultime = 2;
	public static final int rperhr = 20;
	public static int emphrs = 0;
	public static int empwage = 0;
	public static double empcheck = Math.floor(Math.random() * 10) % 2;
	public static void Empfulhalftime(){
	if (empcheck == fultime)
	emphrs = 4;
    else
	emphrs = 8;
empwage = emphrs * rperhr;
System.out.println("empwage: " + empwage);
}
public static void main(String[] args) {
Empfulhalftime();
}
}
