public class EmWageUC2 {
        public static int fulltime = 1;
	private static int  rperhr = 20;
	private static int emphrs = 0;
	private static int empwage = 0;
	private static double empcheck = Math.floor(Math.random() * 10) % 2;
	}
	public static void Dailywage() 
	{
		if (empcheck == fulltime)
	   	empwage = emphrs * rperhr;
		System.out.println("empwage: " + empwage);
	}
 public static void main(String[] args) {
Dailywage();
}
}
	
	