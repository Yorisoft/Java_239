import java.nio.*;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.*;

class Encrypt{
	public static void main(String args[]){

		char chr=0;
		String file_name = args[0];
		try {
			FileWriter file_writer = new FileWriter(file_name);
			Scanner my_scanner = new Scanner(System.in); //System.in is a standard input stream
			//System.out(sc);
			while(my_scanner.hasNextLine()){
				String str= my_scanner.nextLine();
				
				for (int i=0; i < str.length(); i++){
					
					chr = str.charAt(i);
					file_writer.write(++chr);
				}
				file_writer.write('\n');
			}
			file_writer.close();
		
		} catch (IOException e) {
			System.out.println("An error occurred." + e);
			e.printStackTrace();
		}
	}
}