
class Customer_Ex {
	public static void main(String args[]){
		Customer new_customer = new Customer();
		Customer current_customer;
		
		// Loading fields
		new_customer.setName("Suzi Carlichi");
		new_customer.setItem("Head Phones");
		new_customer.setCost(19.99);
		new_customer.setQuantity(2);
		
		// Printing fields of new_customer
		System.out.println(new_customer);
		
		//Moving to refrence current_customer, to make space for newest customer
		current_customer = new_customer;
		
		new_customer = new Customer("Adrian Rodriguez", "Keyboard", 35.67, 1);
		
		// Printing fields of newest customer
		System.out.println(new_customer);
		
		System.out.println("New customer decided to leave..");		
		System.out.println("Printing out current customers");
		System.out.println();
		
		new_customer = current_customer;
		
		System.out.println(new_customer);
	}
	
}