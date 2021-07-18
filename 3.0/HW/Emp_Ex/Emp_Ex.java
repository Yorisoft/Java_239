// save this file as Emp_Ex.java


/*class Emprec {
  String name;
  String address;  
  double hours;
  double rate;
  char sex;
  int age;
  boolean active;
} */

// Using Emprec file/object, learning how to work across files

class Emp_Ex{

   public static void main(String args[]) {

    double employee_gross_pay;

    // Let's assign values to employee's instance variables
	
	// Since data types are defined in Empred class,
	// and because the Emprec constructor is expecting String for all args,
	// I'll be initializing all 

    String name = "Mary Smith ";
	String address = "Boston, MA";
    String hours = Integer.toString(40);
    String rate = String.valueOf(15.00);
	String sex = Character.toString('F');
	String age = String.valueOf(32);
	String active = Boolean.toString(true);
	 
	// Converting the variables into strings when passing them resulted in compile error. 
	//Emprec employee = new Emprec(name, address, Integer.toString(hours), String.valueOf(rate), Character.toString(sex), String.valueOf(age), Boolean.toString(active));

	Emprec employee = new Emprec(name, address, hours, rate, sex, age, active);
	
	// Let's print out some fields
	System.out.println("Employees name is: " + employee.getName() );
	System.out.println("Employees address is: " + employee.getAddress() );
	System.out.println("Employees hours is: " + employee.getHours() );
	System.out.println("Employees rate is: " + employee.getRate() );
	System.out.print("Employees sex is: ");
	System.out.println((employee.getSex() == 'F' ? "Female" : "Male" ));
	System.out.println("Employees age is: " + employee.getAge() );
	System.out.println("Employees status is: " + employee.getStatus() );
	
	
    // Let's compute the gross salary for this employee

    employee_gross_pay = employee.getHours() * employee.getRate();
	
	// Let's compute the gross salary for this employee	

    // now let's print the output for this employee

    System.out.print(" The gross salary for " + employee.getName() );

    System.out.println(" is  " + employee_gross_pay );
  }//main

}// Emp_Ex

