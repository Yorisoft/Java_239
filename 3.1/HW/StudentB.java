import java.io.*;
import java.text.*;
import javax.swing.JOptionPane;

// Student class
class StudentRec {
    String name;
    String address;
    long studen_id;
    int year_of_grad;
    double semester_tuition;

    StudentRec(String name, String address, String id, String yog, String cost){
        try{
            this.name = name;
            this.address = address;
            this.studen_id = Long.parseLong(id);
            this.year_of_grad = Integer.parseInt(yog);
            this.semester_tuition = Double.parseDouble(cost);
        } 
        catch (NumberFormatException errmsg) {
            System.out.println("Invalid format" + errmsg);

            this.name = "";
            this.address = "";
            this.studen_id = 0;
            this.year_of_grad = 0;
            this.semester_tuition = 0.0;
        }
    }

    public String toString(){
        NumberFormat num_frm = NumberFormat.getCurrencyInstance();

        return ("Student Information:" +
        "\n Name: \t\t\t" + this.name +
        "\n Address: \t\t" + this.address + 
        "\n ID: \t\t\t" + this.studen_id +
        "\n Expected Y.O.G: \t" + this.year_of_grad + 
        "\n Semester Tuition: \t" + num_frm.format(this.semester_tuition) + '\n');
    }

}

class StudentB{
    public static void main(String args[]) throws IOException{
        BufferedReader dataReader = new BufferedReader(new InputStreamReader(System.in));

        String str_name;
        String str_address;
        String str_id;
        String str_yog;
        String cost;

        for(;;){
            str_name = dataReader.readLine();

            // When left as "equals" it compiles and runs but gives error if word is not exact. 
            if(str_name.equals("exit")) System.exit(0);

            str_address = dataReader.readLine();
            str_id = dataReader.readLine();
            str_yog = dataReader.readLine();
            cost = dataReader.readLine();

            StudentRec student = new StudentRec(str_name, str_address, str_id, str_yog, cost);

            System.out.println(student);

            /* JOptionPane.showMessageDialog(null,
            student.toString(),
             "Student Record",
             JOptionPane.PLAIN_MESSAGE); */
        }
    }
}