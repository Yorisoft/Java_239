
class Loops{

	public static void main(String args[]){
		
		int sum;
		sum = 0;
		
		System.out.print("The value of sum BEFORE any loops: ");
		System.out.println(sum);
		
		// For loop
		for(int i = 1; i <= 100; i++){
			sum+=i;
		}
		
		System.out.print("The value of sum AFTER the FOR loop: ");
		System.out.println(sum);
		
		sum = 0;
		System.out.print("...Reset the value. Value of sum: ");
		System.out.println(sum);
		
		int counter = 1;
		while(counter <= 100){
			sum+=counter;
			
			counter++;
		}
		
		System.out.print("The value of sum AFTER the WHILE loop: ");
		System.out.println(sum);
		
		sum = 0;
		System.out.print("...Reset the value. Value of sum: ");
		System.out.println(sum);
		
		counter = 1;
		do {
			sum += counter;
			counter++;
		} while(counter <= 100);
		
		System.out.print("The value of sum AFTER the DO-WHILE loop: ");
		System.out.println(sum);
		
	}
		

}