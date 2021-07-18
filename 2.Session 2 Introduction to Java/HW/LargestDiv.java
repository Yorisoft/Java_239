// Write a program to show me the largest number less than 100000 
// which is divisible by  7   11   13 and  17
//

import java.util.ArrayList;

class LargestDiv{
public static void main(String args[]){
	ArrayList<Integer> passingNums = new ArrayList<Integer>();
	
	for (int i = 1; i < 100000; i++){
		// Divide i by the four numbers. If it returns a remainder
		// it is not divisible. If it does not return a remainder
		// add to list. 
		int x = i%7;
		if(x != 0){
			continue;
		}
		
		x = i%11;
		if(x != 0){
			continue;
		}
		
		x = i%13;
		if(x != 0){
			continue;
		}
		
		x = i%17;
		if(x != 0){
			continue;
		}
		
		passingNums.add(i);
	}
	System.out.print("All number divisible by 7 11 13 and 17: ");
	System.out.println(passingNums);
	
	System.out.print("Largest number divisible by 7 11 13 and 17: ");
	System.out.println(passingNums.get(passingNums.size()-1));
}
}