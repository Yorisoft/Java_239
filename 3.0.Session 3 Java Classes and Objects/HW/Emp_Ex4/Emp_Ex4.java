// save this file as Emp_Ex4.java

class Emprec {
  String name;
  double hours;
  double rate;
  char sex;

double calc_gross_pay()
{

 return  (hours * rate);

}// calc_gross_pay


}// Emprec



class Emp_Ex4 {

   public static void main(String args[]) {

    Emprec employee = new Emprec();
    Emprec employee2 = new Emprec();
    double employee_gross_pay;
	Emprec employee_ref;

    // Let's assign values to both employee's objects

    employee.name = " Mary Smith ";
    employee.hours = 40;
    employee.rate = 15.00;
	employee.sex = 'F';
	
    employee2.name = " Butch Barkley ";
    employee2.hours = 3;
    employee2.rate = 6.25;
	employee2.sex = 'F';

    // Let's compute the gross salary for Mary
    employee_gross_pay = employee.calc_gross_pay();

    // now let's print the output for this employee

    System.out.print(" The gross salary for " + employee.name );
    System.out.println(" is  " + employee_gross_pay );
	
	
	// First Employee Info
	employee_ref = employee;
	
	System.out.println(" Employee name is: " + employee_ref.name);
	System.out.println(" Employee hours is: " + employee_ref.hours);
	System.out.println(" Employee rate is: " + employee_ref.rate);
	System.out.print(" Employee sex is: ");
	System.out.println((employee.sex == 'F' ? "Female" : "Male" ));
	
	System.out.println();
	
	// Let's compute the gross salary for Butch
    employee_gross_pay = employee2.calc_gross_pay();

    // now let's print the output for this employee

    System.out.print(" The gross salary for " + employee2.name );
    System.out.println(" is  " + employee_gross_pay );
	
	// Second Employee Info
	employee_ref = employee2;
	
	System.out.println(" Employee name is: " + employee_ref.name);
	System.out.println(" Employee hours is: " + employee_ref.hours);
	System.out.println(" Employee rate is: " + employee_ref.rate);
	System.out.print(" Employee sex is: ");
	System.out.println((employee.sex == 'F' ? "Female" : "Male" ));


  }//main

}// Emp_Ex4


