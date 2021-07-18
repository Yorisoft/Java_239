

/*
   Here is another example.
   Call this file "AddTwo.java".
*/
class AddTwo {

  public static void main(String args[]) {

    int a,b,c; // this declares 2 variables
    // of type integer
	
	
    double sum=0;// this declares an integer named sum and
    // sets its initial value to zero

    a=5;  // a now has the value 5

    b=10; // b now has the value 10
	
	c = 7;

    sum = a + b + c; // the value of sum is now 15

   
    System.out.print("The sum of "+a);
    System.out.print(" and "+b);
	System.out.print(" and "+c);
    System.out.println(" is " + sum);

   
    
    sum /=3;  // note that the value of sum is 7 and not 7.5
    // you only get the integer portion of the number.

    System.out.print("The average of the two numbers is ");
    // note the this print statement has the ln left off !!!!

    System.out.println(sum); // the value of sum will be printed on the same line.
    // and the cursor will then move to the next line.
  }//main
}//AddTwo

