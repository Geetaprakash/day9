public class EmWageUC1 {
public static final int fulltime = 1;
private static double empcheck = Math.floor(Math.random() * 10) % 2;
public static void Emppresentabsent(){
if (empcheck == fulltime)
System.out.println("employee is present");
else
System.out.println("employee is absent");
}
public static void main (String[] args) {
Emppresentabsent();
}
}
