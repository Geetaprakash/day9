
	public class EmWageUC9{
	public static final int parttime = 1;
	public static final int fultime = 2;
	private final String company;
	 private final int emrperhr;
	private final int numofworkingdays;
	private final int maxhrspermonth;
	private int totalempwag;
		
public EmWageUC9(String company, int emrperhr, int numofworkingdays, int maxhrspermonth)
{
	this.company = company;
	this.emrperhr = emrperhr;
	this.numofworkingdays = numofworkingdays;
	this.maxhrspermonth = maxhrspermonth;
}
public void computeEmp(){
	int emphrs = 0,totalemphr = 0, totalworkingdays = 0;
	while (totalemphr <= maxhrspermonth && 
	totalworkingdays < numofworkingdays) 
	{
	totalworkingdays++;	
	int empcheck = (int) Math.floor(Math.random() * 10) % 3;
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
	System.out.println("Day#:" + totalworkingdays + "EMPLOYEE HOURS: " +emphrs);
	}
	 totalempwag = totalemphr * emrperhr;
	}
	@Override
	public String toString() {
	return "TOTAL EMPLOYEEWAGE FOR COMPANY: " + company +" is:" +totalempwag;

	}
public static void main(String[] args){
	EmWageUC9 obj1 = new EmWageUC9("Kmart",20,2,10);
	 EmWageUC9 obj2 = new EmWageUC9("Dmart",10,2,20);
	obj1.computeEmp();
	System.out.println(obj1 );
	obj2.computeEmp();
	System.out.println(obj2);
	}
}

	
	
