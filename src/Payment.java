
public class Payment {
	
	//Instance fields
	public String type;
	public Float price;
	
	//Constructor
	public Payment(String type, float price){
		this.type= type;
		this.price= price;
	}
	
	//Accessor Methods
	public String getType(){
		return type;
	}
	public double getPrice(){
		return price;
	}
}
