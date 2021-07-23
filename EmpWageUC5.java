public class EmpWageUC5 {
	public static final int parttime = 1;
	public static final int fultime = 2;
	public static final int emrperhr = 20;
	public static final int numofworkingdays = 2;
	
	public static int emphrs = 0;
	public static int empwage = 0;
	public static int totalempwag = 0;
	public static int empcheck = (int) Math.floor(Math.random() * 10) % 3;
	public static void CalculateWage(){
	for (int day = 0; day < numofworkingdays; day++) {
	switch (empcheck) {
	case parttime:
	emphrs = 4;
	break;
	case fultime:
	emphrs = 8;
	break;
default:
	emphrs = 0;
}
empwage = emphrs * emrperhr;
totalempwag += empwage;
System.out.println("empwage: " + empwage);
}
System.out.println("total emp empwage: " + totalempwag);
}
public static void main(String[] args) {
 CalculateWage();

}
}

