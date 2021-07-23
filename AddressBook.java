class AddressBook {

private String firstName;
private String lastName;
private String Address;
private String city;
private String state;
private String zip;
private String phonenumber;
private String email;

public AddressBook(String firstName,String lastName,String Address,String city,String state,String zip,String phonenumber,String email)
{

                        this.firstName = firstName;
                        this.lastName  = lastName;
                        this.Address = Address;
                        this.city = city;
                        this.state = state;
                        this.zip = zip;
			this.phonenumber = phonenumber;
                        this.email = email;
                     
                        }

public AddressBook(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
}

public String getfirstName() {
    return firstName;
}

public void setfirstName(String firstName) {
    this.firstName = firstName;
}

public String getlastName() {
    return lastName;
}

public void setlastName(String lastName) {
    this.lastName = lastName;
}

public String getAddress() {
    return Address;
}

public void setAddress(String Address) {
    this.Address = Address;
}

public String getcity() {
    return city;
}

public void setcity(String city) {
    this.city = city;
}

public String getstate() {
    return state;
}

public void setstate(String state) {
    this.state = state;
}

public void setzip(String zip) {
    this.zip = zip;
}

public String getzip() {
    return zip;
}



public String getphonenumber() {
    return phonenumber;
}

public void setphonenumber(String phonenumber) {
    this.phonenumber = phonenumber;
}

public String getemail() {
    return email;
}

public static String compareNames(String name1, String name2) {
    String nameEquals;
    if ( name1.equals(name2) ) {
        nameEquals = (name1 + " and " + name2 + " are equal names.");
        return nameEquals;
    }
    else {
        nameEquals = (name1 + " and " + name2 + " are not equal names.");
        return nameEquals;
    }
}
}

public class TestAddressBook {

public static void main(String[] args) {

    System.out.println("ENTRY 1");

    AddressBook entry1 = new AddressBook("Robert", "Smith", "3 Fake St", "banglore","karnataka","560057","9880957533","abc1212@gmail.com");
                                         

    System.out.println( "First Name:        " + entry1.getfirstName() );
    System.out.println( "last  Name:        " + entry1.getlastName() );
    System.out.println( "Address:           " + entry1.getAddress() );
    System.out.println( "city:              " + entry1.getcity() );
    System.out.println( "phonenumber:       " + entry1.getphonenumber() );
    System.out.println( "zip:               " + entry1.getzip() );
    System.out.println( "state:             " + entry1.getstate() );
    System.out.println( "emai:              " + entry1.getemail() );

    System.out.println("\nENTRY 2");

   AddressBook entry2 = new AddressBook("abcs", "Sss", "3rd croos", "banglore","karnataka","560058","9880843758","ab1212@gmail.com");
   System.out.println( "First Name:        " + entry2.getfirstName() );
    System.out.println( "last  Name:        " + entry2.getlastName() );
    System.out.println( "Address:           " + entry2.getAddress() );
    System.out.println( "city:              " + entry2.getcity() );
    System.out.println( "phonenumber:       " + entry2.getphonenumber() );
    System.out.println( "zip:               " + entry2.getzip() );
    System.out.println( "state:             " + entry2.getstate() );
    System.out.println( "emai:              " + entry2.getemail() );


    System.out.println("\nENTRY 3");

    AddressBook entry3 = new AddressBook("Rhshd", "Smdb", "3 Fdsns", "banglore","karnataka","560497","988092323","ac1212@gmail.com");                                        

    System.out.println( "First Name:        " + entry3.getfirstName() );
    System.out.println( "last  Name:        " + entry3.getlastName() );
    System.out.println( "Address:           " + entry3.getAddress() );
    System.out.println( "city:              " + entry3.getcity() );
    System.out.println( "phonenumber:       " + entry3.getphonenumber() );
    System.out.println( "zip:               " + entry3.getzip() );
    System.out.println( "state:             " + entry3.getstate() );
    System.out.println( "emai:              " + entry3.getemail() );


AddressBook.compareNames(entry1.getfirstName() + " " + entry1.getlastName().charAt(0) + " " +entry1.getlastName(), entry2.getfirstName() + " " +  entry2.getfirstName().charAt(0) + " " +entry2.getlastName() ); 
}
}