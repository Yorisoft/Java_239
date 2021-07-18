class Customer {

	private String Cust_Name;
	private String Item_Purchased;
	private double Item_Cost;
	private int Quantity_Bought;
	
	Customer(){};
	
	Customer(String name, String item, double cost, int quantity){
		Cust_Name = name;
		Item_Purchased = item;
		Item_Cost = cost;
		Quantity_Bought = quantity;
		
	}
	
	@Override
	public String toString(){
		return "Custumer name: "+Cust_Name + "\n" 
		+ "Item purchased: " + Item_Purchased + "\n" 
		+ "Cost: " + Item_Cost + "\n"
		+ "Quantity: " + Quantity_Bought + "\n";
	}
	
	public String getName(){
		return Cust_Name;
	}
	
	public String getItem(){
		return Item_Purchased;
	}
	
	public double getCost(){
		return Item_Cost;
	}
	
	public int getQuantity(){
		return Quantity_Bought;
	}
	
	public void setName(String n){
		Cust_Name = n;
	}
	
	public void setItem(String i){
		Item_Purchased = i;
	}
	
	public void setCost(double c){
		Item_Cost = c;
	}
	
	public void setQuantity(int q){
		Quantity_Bought = q;
	}

}