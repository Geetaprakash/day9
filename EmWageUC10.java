public class EmWageUC10{
	public final String company;
	public final int emrperhr;
	public final int numofworkingdays;
	public final int maxhrspermonth;
	private int totalempwag;

public void EmWageUC9(String company, int emrperhr, int numofworkingdays, int maxhrspermonth)
{
	this.company = company;
	this.emrperhr = emrperhr;
	this.numofworkingdays = numofworkingdays;
	this.maxhrspermonth = maxhrspermonth;
}
public void settotalempwag(int totalempwag){
	this.totalempwag =  totalempwag;
	}
@Override
	public String toString() {
	return "TOTAL EMPLOYEEWAGE FOR COMPANY: " + company +" is:" +totalempwag;

	}	
}
public class EmpwageArray{
	public static final int parttime = 1;
	public static final int fultime = 2;
	
	private int numofcompany = 0;
	private companyEmWage[] companyempwageArray;
		
	public void EmwageArray(){
	companyempwageArray = new companyempwageArray[5];
	}	

        private void addEmpanywage(String company, int emrperhr, int numofworkingdays, int maxhrspermonth){
	companyempwageArray[numofcompany] = new companyempwageArray(company,emrperhr,numofworkingdays,maxhrspermonth);
	numofcompany++;
	}
private void computeEmpwage(){
	for(int i=0; i<numofcompany;i++){
	companyempwageArray[i].settotalempwag(this.companyEmWage(companyempwageArray[i]));
	System.out.println(companyempwageArray[i]);
	}
}
private int computeEmpwage(companyEmpwage companyEmpwage){
int emphrs = 0, totalemphr = 0, totalworkingdays = 0;
while (totalemphr <= companyEmpwage.maxhrspermonth && 
	totalworkingdays < companyEmpwage.numofworkingdays) 
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
	 return totalemphr * companyEmpwage.emphrs;
	}
	
public static void main(String[] args){
	 EmwageArray obj1 = new EmwageArray();
	obj1.addcompanyEmpwage ("Dmart",10,2,20);
	obj1.addcompanyEmpwage ("Kmart",20,2,10);
	obj1.computeEmpwage();
	}
}

		
