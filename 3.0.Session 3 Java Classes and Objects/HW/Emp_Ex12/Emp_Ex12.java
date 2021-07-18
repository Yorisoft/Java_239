// save this file as Emp_Ex12.java

import java.text.*;

class Emprec {
  String name;
  double hours;
  double rate;
  char sex;


// Need to define default constructor

Emprec(){};

// Signature: String doube double
 Emprec(String n, char s, double h, double r)
{

name = n;

hours = h;

rate = r;


System.out.println("Inside of String char double double");
}// constructor

Emprec(String n, char s, float h, double r)
{

name = n;

hours = h;

rate = r;

System.out.println("Inside of String char float double \n");

}// constructor

double calc_gross_pay()
{

   return (hours * rate);

}// calc_gross_pay


double calc_fed_tax(double h, double r)
{

  double yearly_income;

  yearly_income = h * r *52;

   if (yearly_income < 30000.00) return (h * r *.28);

   else if ( yearly_income < 50000.00 ) return (h * r* .32);

   else return (h * r * .38);


}// calc_fed_tax


double calc_state_tax(double h, double r)
{

  double state_tax;

  state_tax = h * r * .0561;

  return (state_tax);

}// calc_state_tax


@Override
public String toString(){
	return name + "\n" + hours + "\n" + rate + "\n" + sex + "\n";
}

}// Emprec

// This class declares an object of type Box.

class Emp_Ex12 {

   public static void main(String args[]) {

    Emprec employee = new Emprec("Mary Smith",'F',40d,15);

    Emprec employee2 = new Emprec("Butch Barkley",'M',3,6.25);
	
	Emprec employee_Ref;

    double employee_gross_pay;

    double employee_fed_tax;

    // let's display the output for employee first
    System.out.print(" The gross salary for " + employee.name );
    System.out.println(" is " + employee.calc_gross_pay());
    System.out.println(" The federal income tax is " + employee.calc_fed_tax(employee.hours, employee.rate));
    System.out.println(" The state income tax is " + employee.calc_state_tax(employee.hours, employee.rate));

	System.out.println();

    // now let's print the output for employee2
    System.out.print(" The gross salary for " + employee2.name );
	System.out.println(" is " + employee.calc_gross_pay());
    System.out.printf(" The federal income tax is %6.2f \n", employee2.calc_fed_tax(employee2.hours, employee2.rate));
    System.out.println(" The state income tax is " + employee2.calc_state_tax(employee.hours, employee.rate));

	// Saving employee2 data to employee_ref
	employee_Ref = employee2;

  // now let's see if employee2 can be made to be a reference
	employee2 = employee;

  // let's redisplay the data for employee2
  // remember if it is now a reference for employee
  // it will display employee's data.

    // now let's print the output for  employee2
    // which is now a reference for employee
	
	System.out.println();
    System.out.print(" The gross salary for " + employee2.name );
    System.out.println(" is " + employee2.calc_gross_pay());
    System.out.printf("The federal income tax is %6.2f \n", employee2.calc_fed_tax(employee2.hours, employee2.rate));
    System.out.println(" the state income tax is " + employee2.calc_state_tax(employee.hours, employee.rate));

	System.out.println();
	
	//Printing out all info for first employee
	System.out.println("Object in 'employee2' ");
	System.out.println(employee2);
	
	System.out.println();
	
	//Printing out all info for second employee
	System.out.println("Object in 'employee_Ref' ");
	System.out.println(employee_Ref.toString());
	

  }//main

}// Emp_Ex12

