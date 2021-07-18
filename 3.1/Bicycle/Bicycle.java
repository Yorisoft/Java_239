import java.io.*; 

class Bicycle {
String name;
String address;
int gears;
double price;
char model;
boolean instock;
String color;


Bicycle(String name,String address, String gears,
String price, String model, String instock,String color ) {
this.name      = name;
this.address   = address;
this.gears     = Integer.parseInt(gears);
this.price     = Double.parseDouble(price);
this.model     = model.charAt(0);
this.instock   = Boolean.parseBoolean(instock);
this.color = color;


}// Bicycle



public String toString() {

return("\n your name is "+this.name+
"\n your address is "+ this.address+
"\n the number of gears is "+this.gears+
"\n the price is "+this.price+
"\n the model is "+this.model+
"\n in stock "+this.instock+
"\n color is "+color);


}//toString


}// class Bicycle
