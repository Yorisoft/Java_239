import java.io.*;
import java.text.*;
import javax.swing.JOptionPane;

// Student class
class StudentRec {
    String name;
    String address;
    long studen_id;
    int year_of_grad;

    Studen(String name, String address, String id, String yog){
        this.name = name;
        this.address = address;
        this.studen_id = id;
        this.year_of_grad = yog;
    }

    public String toString(){
        return ("Student Information:" +
        "\n Name: \t\t" + this.name +
        "\n Address: \t\t" + this.address + 
        "\n ID: \t\t" + this.studen_id +
        "\n Expected year of graduation: \t " + this.year_of_grad + '\n');
    }

}

class HomeWork{
    public static void main(String args[]){
        BufferedReader dataReader = new BufferedReader(FileReader("Studen.dat"));

        String str_name;
        String str_address;
        String str_id;
        String str_yog;

        for(;;){
            str_name = dataReader.readLine();

            if(str_name.equals("EXIT"))
                System.exit(0);

            str_address = dataReader.readLine();
            str_id = dataReader.readLine();
            str_yog = dataReader.readLine();

            StudentRec studen = new StudentRec(String str_name, String str_address, String str_id, String str_yog);

            System.out.printls(studen);

            
        }
    }
}