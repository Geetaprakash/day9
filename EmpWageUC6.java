public class EmpWageUC6 {
	public static final int parttime = 1;
	public static final int fultime = 2;
	public static final int emrperhr = 20;
	public static final int numofworkingdays = 2;
	public static final int maxhrsinmonth = 10;
	public static int emphrs = 0;
	public static int totalemphr = 0;
	public static int totalworkingdays = 0;	
	public static int empcheck = (int) Math.floor(Math.random() * 10) % 3;
	
	
	public static void totalworkinghrs(){
	while (totalemphr <= maxhrsinmonth && 
	totalworkingdays < numofworkingdays) {
	totalworkingdays++;	

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
totalemphr += emphrs;
System.out.println("Day#:" + totalworkingdays + "emp hr: " +emphrs);
}
int totalempwag = totalemphr * emrperhr;
System.out.println("total emp empwage: " + totalempwag);
}
public static void main(String[] args) {
totalworkinghrs();
}
}
