// Making variables private and creating get/set functins
public class Emprec {
  private String name;
  private String address;  
  private double hours;
  private double rate;
  private char sex;
  private int age;
  private boolean active;  //this is extra credit




// This is the classes's constructor !!!!

public Emprec (String name,String address,String hours,String rate,String sex,String age,String active)
{

try{
this.name=name;
this.address=address;
this.hours=Double.valueOf(hours).doubleValue();
this.rate=Double.valueOf(rate).doubleValue();
this.sex=sex.charAt(0);
this.age=Integer.parseInt(age);
this.active=Boolean.valueOf(active).booleanValue();
} catch(NumberFormatException errmsg)
{
  System.out.println("Invalid format"+ errmsg);
     
     this.name  = "";  
     this.hours = 0.0;
     this.rate  = 0.0;

}//catch

}//Emprec constructor !!!!

public String getName(){
	return name;
}

public String getAddress(){
	return address;
}

public double getHours(){
	return hours;
}

public double getRate(){
	return rate;
}

public char getSex(){
	return sex;
}

public int getAge(){
	return age;
}

public boolean getStatus(){
	return active;
}


double calc_fed_tax(double hours,double rate)
{

  double yearly_income;

  yearly_income = hours * rate *52;

   if (yearly_income < 30000.00) return (hours * rate *.28);

   else if ( yearly_income < 50000.00 ) return (hours * rate* .32);

   else return (hours * rate * .38);


}// calc_fed_tax


double calc_gross_pay()
{

   return (hours * rate);

}// calc_gross_pay


double calc_state_tax(double hours, double rate)
{

  double state_tax;

  state_tax = hours * rate * .0561;

  return (state_tax);

}// calc_state_tax




 public  String toString()
{

return
("\n your name is   "+   String.format("\n \n here is your name formatted %-25s",this.name)+
"\n your address is "+   this.address+
"\n your hours are   "+   String.format("\n here it is formatted %.2f",hours)+
"\n your rate is    "+   String.format("\n here is the rate formatted %10.3f",rate)+
"\n your sex is     "+    String.format("\n here it is the sex formatted %c ",sex)+
"\n your age is     "+   String.format("\n here is the age formatted %d",age)+
"\n your status is " + active+
"\n your gross pay is "+String.format("\n here is the gross pay formatted %g",calc_gross_pay())+
"\n  your state tax is "+this.calc_state_tax(this.hours,this.rate)   );


}//toString


// see if you can get the boolean to load from a text file.
// what's missing ????

//methods !!!!
// constructors !!!
}// Emprec
