// Yelsin Sepulveda
// CSC_239

import java.text.*;
import java.io.*;
// CD is now an abstract class
// it cannot have any object because it it as yet unfinished, incomplete
// however, it can have a reference

abstract class CD {	
	double interest_rate;
	int months;
	abstract double calc_interest();// this method is not finished !!!

	CD(){
		this.interest_rate = 0.00;
		this.months = 0;
	}

	CD(String i, String m){
		this.interest_rate = Double.parseDouble(i);
		this.months = Integer.parseInt(m);
	}

	public String cdToString(){
		return("Certificate of Deposit: " +
			"\n Interest Rate: \t" + this.interest_rate +
			"\n Months: \t\t" + this.months + '\n'); // could have also used super.months	
	}
}//class CD

class Customer extends CD {

String name;
String address;
double deposit;

Customer(String n, String a, String d, String ir, String m) throws IOException{
	super(ir, m);
	try{
		
		this.name = n;
		this.address = a;
		this.deposit = Double.parseDouble(d);
	
	} catch(NumberFormatException err){
		System.out.println("Error accured: " + err );
	}
}

double calc_interest(){
	// we will use the simple formula I = P * R * T;
	System.out.println(" This calc_interest() method is from Customer !");

	return (deposit * interest_rate * months/12.0);
}//calc_interest

public String toString(){
	NumberFormat num_fmt = NumberFormat.getCurrencyInstance();
	
	return ("Customer Info: " +
		"\n Name: \t\t" + this.name +
		"\n Address: \t\t" + this.address +
		"\n Deposit: \t\t" + num_fmt.format(this.deposit) + '\n'); // could have also used super.months	
}	

}

class Customer2 extends Customer {

String name;
String address;
double deposit;


Customer2(String n, String a, String d, String ir, String m) throws IOException{
	//CD(ir, m);
	super(n, a, d, ir, m);
	try{
		this.name = n;
		this.address = a;
		this.deposit = Double.parseDouble(d);
	
	} catch(NumberFormatException err){
		System.out.println("Error accured: "+ err );
	}
}

double calc_interest(){
// we will use the simple formula I = P * R * T;
System.out.println(" This calc_interest() method is from Customer2 !");

return (deposit * interest_rate * months/12.0);
}

double x(){
 	return super.calc_interest();
}

public String toString(){
	NumberFormat num_fmt = NumberFormat.getCurrencyInstance();
	
	return("Customer Info: " +
		"\n Name: \t\t" + this.name +
		"\n Address: \t\t" + this.address +
		"\n Deposit: \t\t" + num_fmt.format(this.deposit) + '\n'); // could have also used super.months	
}


}// class Customer

class Customer3 extends Customer2 {

String name;
String address;
double deposit;


public Customer3(String n, String a, String d, String ir, String m) throws IOException {
	super(n, a, d, ir, m);
	try{
		
		this.name = n;
		this.address = a;
		this.deposit = Double.parseDouble(d);
	
	} catch(NumberFormatException err){
		System.out.println("Error accured: "+ err );
	}
}

double calc_interest(){
// we will use the simple formula I = P * R * T;
System.out.println(" This calc_interest() method is from Customer3 !");

return (deposit * interest_rate * months/12.0);
}

double z(){
	return super.calc_interest();
}

public String toString(){
	NumberFormat num_fmt = NumberFormat.getCurrencyInstance();
	
	return("Customer Info: " +
		"\n Name: \t\t" + this.name +
		"\n Address: \t\t" + this.address +
		"\n Deposit: \t\t" + num_fmt.format(this.deposit) + '\n'); // could have also used super.months	
	}

}// class Customer



class Inherit13 {

public static void main(String args[]) throws IOException {

	NumberFormat num_fmt = NumberFormat.getCurrencyInstance();
// let's create the object first
try {
Customer3 person = new Customer3("Jenny B. Bayer", "6626 Rue Drive", "3569.07",
							".04", "12");

//Customer person_ref;// this is a reference
CD person_ref;// this is now a reference to the class CD
double total_interest;

// we will now assign the reference
person_ref = person; // person_ref is now an alias for person

//Lets print out the object
System.out.println(person);
System.out.println(person_ref.cdToString());

// now we will load DIFFERENT DATA into the object
System.out.println("New Customer !!! ");
((Customer2 )person).name = "Michael T. Bayer"; // why didn't super.name work??
((Customer2 )person).address = "6626 Rue Drive";
((Customer2 )person).deposit = 4456.06;

// we can now load the following fields
person_ref.interest_rate = .05;
person_ref.months = 12;

// let us now display the data
System.out.println(" customer's name " + ((Customer2 )person).name);
System.out.println(" customer's address " + ((Customer2 )person).address);
System.out.println(" customer's initial deposit " + num_fmt.format(((Customer2 )person).deposit) + '\n');


// we can now display the following data
System.out.println(" the rate of interest on the CD is  " + person_ref.interest_rate + "percent");
System.out.println(" the number of months the principal is deposited for is  " + person_ref.months + '\n');

// we can now display the total interest earned through person_ref method
total_interest = person_ref.calc_interest();
System.out.println(" Customer3: ");
System.out.println(" the total interest on the deposited amount is " + num_fmt.format(total_interest) + '\n');

// we can now display the total interest earned through Customer2 method
total_interest = person.z();
System.out.println(" Customer2: ");
System.out.println(" the total interest on the deposited amount is " + num_fmt.format(total_interest) + '\n');

// we can now display the total interest earned through Customer method
total_interest = person.x();
System.out.println(" Customer: ");
System.out.println(" the total interest on the deposited amount is " + num_fmt.format(total_interest) + '\n');

} catch (NumberFormatException err){
	System.out.println("Error accured: "+ err );
}

}//main

}//class Inherit13


