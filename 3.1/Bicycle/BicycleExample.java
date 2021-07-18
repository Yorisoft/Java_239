import java.io.*;
import javax.swing.JOptionPane;


class BicycleExample {


public static void main(String args[]) throws IOException {

//// HERE IS HOW TO HAND INPUT THE DATA !!!!
 //BufferedReader inData = new BufferedReader
 //(new InputStreamReader(System.in));

 
 // NOW HERE IS HOW TO USE A TEXTFILE NAMED BICYCLE.DAT  !!!!!


 BufferedReader inData = new BufferedReader(new FileReader("Bicycle.dat"));

 
 
String str_name;
String str_address;
String str_gears;
String str_price;
String str_model;
String str_instock;
String str_color;

for(;;) {

str_name    = inData.readLine();

if(str_name.equalsIgnoreCase("exit")) System.exit(0);



str_address = inData.readLine();
str_gears   = inData.readLine();
str_price   = inData.readLine();
str_model   = inData.readLine();
str_instock = inData.readLine();
str_color =inData.readLine();

Bicycle  bicycle = new Bicycle(str_name,str_address,
str_gears,str_price,str_model,str_instock,str_color);

System.out.println(bicycle.toString());

  JOptionPane.showMessageDialog(null,
                "Bicycle Information:" +
                bicycle.toString(),
                "Bicycle Info Being Processed",
                JOptionPane.PLAIN_MESSAGE );




}//for


}//main



}// class BicycleExample




