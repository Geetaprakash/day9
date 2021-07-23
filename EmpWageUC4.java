public class EmpWageUC4 {
	public static final int parttime = 1;
	public static final int fultime = 2;
	public static final int emrperhr = 20;
	private static int emphrs = 0;
	private static int empwage = 0;
	private static int empcheck = (int) Math.floor(Math.random() * 10) % 3;
	public static void Switchcaseemp(){
	switch (empcheck) {
	case parttime:
	emphrs = 4;
	break;
	case fultime:
	emphrs = 8;
	break;
       }
empwage = emphrs * emrperhr;
System.out.println("empwage: " + empwage);
}
public static void main(String[] args) {
Switchcaseemp();
}
}

