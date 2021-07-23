public class EmWageUC8 {
	public static final int parttime = 1;
	public static final int fultime = 2;

		
public static int computeEmp(String company,int emrperhr,int numofworkingdays,int maxhrspermonth)
{
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
	System.out.println("Day#:" + totalworkingdays + "EMPLOYEE HOURS\n  " +emphrs);
	}
	int totalempwag = totalemphr * emrperhr;
	System.out.println("TOTAL EMPLOYEEWAGE FOR COMPANY: " +company+" is:" +totalempwag);
	return totalempwag;
	}
public static void main(String[] args){
	 computeEmp("abc",20,2,10);
	 computeEmp("geeta",10,2,20);
	}
}

	
	
