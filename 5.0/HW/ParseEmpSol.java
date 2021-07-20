//HW 5 Double Credit 
// Add 3 more fields
// and two methods
//Finally, finish the toString()
// you may wish to make your own class if you really want to practice.

// HERE'S YOUR TOOLKIT USE IT !!!!
/*        i = Integer.parseInt(str);
        if(i==-1) break;

        l = Long.parseLong(str);
        f = Float.valueOf(str).floatValue();
        d = Double.valueOf(str).doubleValue();
        b =Boolean.valueOf(str).booleanValue();
        // as you will see you do the booleans
        // like the floats and doubles !!!

       // c=  str[0];// nope this is C or C++ or C#
         c = str.charAt(0);// correct way to read a cahracter in Java
                       // zero is the first character of the string object.

       System.out.println(i+" "+l+" "+f+" "+d+ "   "+ c);
*/


import java.io.*;
import java.text.*;
import javax.swing.JOptionPane;


interface College_Iface {

	double calc_gpa(int creds, double points);

	String calc_level();

}

class Emprec implements College_Iface{
  String name;
  char sex;
  int credits;
  double points;
  boolean active;
  // DECLARE THE NEW FIELD     STEP 1

Emprec (String name, String sex, String credits, String points, String active)  { 
//STEP 2 ADD IT TO THE PARAMETER LIST
	try{
		this.name = name;
		this.sex = sex.charAt(0);
		this.credits = Integer.parseInt(credits);
		this.points = Double.valueOf(points).doubleValue();
		this.active = Boolean.valueOf(active).booleanValue();

	// Step 3 ASSIGN IT TO THE OBJECT 
	} catch(NumberFormatException errmsg){
		System.out.println("Invalpoints format"+ errmsg);
     
		this.name  = "undefined";  
		this.sex  = ' ';
		this.credits  = 0; 
		this.points  = 0.0; 
		this.active  = false; 
	}//catch
}//Emprec constructor !!!!

public double calc_gpa(int creds, double points){
	double gpa = 0.0;

	if(creds != 0) gpa = points / creds;
	return gpa;
}

public String calc_level(){
	String level = "";

	if (this.credits < 45) level = "Freshman";
	else if (this.credits < 90) level = "Sophmore";
	else if (this.credits < 135) level = "Junior";
	else level = "Senior";
	return level;
}

// Step 4 ASSIGN IT TO THE toString() 
public  String toString(){

	return  ("\n Students name is: " + this.name +
		"\n Students sex is: " + (this.sex == 'F' ? "Female" : "Male") +
		"\n Students total credits are: " + this.credits +
		"\n Students total points are: " + this.points +
		"\n Students status is: " + (this.active == false ? "Inactive" : "Active"));
}//toString


// see if you can get the boolean to load from a text file.
// what's missing ????

//methods !!!!
// constructors !!!
}// Emprec

class ParseEmpSol {
  
public static void main(String args[]) throws IOException {
    BufferedReader inData = new BufferedReader(new InputStreamReader(System.in));

	// create strings for the input data for the Emprec object

    String str_name;
	String str_sex;
	String str_credits;
	String str_points;	
	String str_active;
     //Step 5 make a stunt double !!!!!	
    
   	for(;;){ 
		//READ THE FILE !!!!
		str_name = inData.readLine();

		if (str_name.equalsIgnoreCase("exit")) System.exit(0);

		str_sex = inData.readLine();	
		str_credits = inData.readLine();
		str_points = inData.readLine();
		str_active = inData.readLine();

		Emprec student = new Emprec(str_name, str_sex, str_credits, str_points, str_active);  
	
		//Step 7 pass the new field to the constructor !!!  V.O.
		System.out.println(student);

		// Print out Level
		System.out.println(" Students college level is:" + student.calc_level());  

		// Print out GPA
		System.out.printf(" Students gpa is: %.2f \n", student.calc_gpa(student.credits, student.points)); 
   	
		// TODO:Comment out until cicd pipline has desktop gui display 
		JOptionPane.showMessageDialog(null,
            student.toString(),
            "Student Record",
            JOptionPane.PLAIN_MESSAGE);
	}//for
}//main
}//ParseEmpSol

// you may try this method     System.exit(0);
// to exit from the program.


// ParseEmpSol

