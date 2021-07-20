 // save this file as Inherit2.java

class CD {

}//class CD

class Customer extends CD{

double interest_rate;
int months;

String name;
String address;
double deposit;

}// class Customer

class Inherit1 {

public static void main(String args[])

{

// let's create the object first

Customer customer = new Customer();

// now we will load it with data

customer.name = "Michael T. Bayer";
customer.address = "6626 Rue Drive";
customer.deposit = 4456.06;

// we can now load the following fields
customer.interest_rate = .05;
customer.months = 12;

// let us now display the data

System.out.println(" customer's name " + customer.name);
System.out.println(" customer's address" + customer.address);
System.out.println(" customer's initial deposit" + customer.deposit);

// we can now display the following data
System.out.println(" the rate of interest on the CD is  " + customer.interest_rate + "percent");
System.out.println(" the number of months the principal is deposited for is  " + customer.months);
}//main

}//class Inherit1








