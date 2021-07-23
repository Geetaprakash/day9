public class EmWageUC7 {
	public static final int parttime = 1;
	public static final int fultime = 2;
	public static final int emrperhr = 20;
	public static final int numofworkingdays = 2;
	public static final int maxhrsinmonth = 10;
	public static int emphrs = 0;
	public static int totalemphr = 0;
	public static int totalempwag = 0;
	public static int empwage = 0;
	public static int totalworkingdays = 0;	
	public static int empcheck = (int) Math.floor(Math.random() * 10) % 3;	
public static void Emppresentabsent()
{
	if (empcheck == fultime)
	System.out.println("EMPLOYEE IS PRESENT\n");
	else
	System.out.println("EMPLOYEE IS ABSENT\n");
	
}
public static void Dailywage() 
	{
		if (empcheck == fultime)
	   	empwage = emphrs * emrperhr;
		System.out.println("EMP DAILYWAGE: " + empwage);
			
	}
public static void Empfulhalftime()
{
	if (empcheck == fultime)
	emphrs = 4;
        else
	emphrs = 8;
	empwage = emphrs * emrperhr;
	System.out.println("EMPWAGEWAGE FULL AND HALFTIME: " + empwage);
}
public static void Switchcaseemp()
{
	switch (empcheck) {
	case parttime:
	emphrs = 4;
	break;
	case fultime:
	emphrs = 8;
	break;
       }
	//empwage = emphrs * emrperhr;
	System.out.println("EMPLOYEEWAGE: " + empwage);
}
public static void CalculateWage()
{
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
	System.out.println("EMPLOYEEWAGE:" + empwage);
	}
	System.out.println("TOTAL EMPLOYEEWAGE: " + totalempwag);
}
public static void totalworkinghrs()
{
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
	System.out.println("Day#:" + totalworkingdays + "EMPLOYEE HOURS\n  " +emphrs);
	}
	int totalempwag = totalemphr * emrperhr;
	System.out.println("TOTAL EMPLOYEEWAGE\n " + totalempwag);
}
public static void main(String[] args) 
{
Emppresentabsent();
Dailywage();
Empfulhalftime();
Switchcaseemp();
CalculateWage();
totalworkinghrs();
}
}

