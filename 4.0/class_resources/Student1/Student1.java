import java.io.*;
import java.text.*;
import javax.swing.JOptionPane;

//import java.swing.*;
class Emprec {

    String name;
    String address;
    int year;


    Emprec (String name,String address,String year)
    {
        try
        {
            this.name=name;
            this.address=address;
            this.year=Integer.parseInt(year);

        }
        catch(NumberFormatException errmsg)
        {
            System.out.println("Invalid format"+ errmsg);
            this.name = "";

        }//catch

    }//Emprec constructor !!!!

    public String toString()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();

        return
        (   "\n Name:\t\t\t"+ this.name +
            "\n Address:\t\t"+ address +
            "\n Age:\t\t\t"+ year
        );

    }//toString


}// Emprec


 class Student1
{
    
    
    
    public static void main(String args[]) throws IOException
    {
        BufferedReader inData = new BufferedReader(new InputStreamReader(System.in));

        // create strings for the input data for the Emprec object
        String str_name;
        String str_address;
        String str_year;

        NumberFormat fmt = NumberFormat.getCurrencyInstance();

        for(;;){
            //READ THE FILE !!!!
         System.out.println("\n\tEnter\nname \naddress \nyear of graduation \nPress ENTER after each entry\t\t\ntype 'exit' to exit program");
            str_name = inData.readLine();

            if(str_name.equalsIgnoreCase("exit")) System.exit(0);

            str_address = inData.readLine();

            str_year = inData.readLine();



            Emprec employee=new Emprec(str_name,str_address,str_year);

            System.out.println(employee);

            JOptionPane.showMessageDialog(null,
                "Student Information:" +
                "\n Name: "+ employee.name +
                "\n Address: "+ employee.address +
                "\n Age: "+ employee.year,

                "Student Information Being Processed",
                JOptionPane.PLAIN_MESSAGE );


        }//for
    }//main
}//Assignment21
