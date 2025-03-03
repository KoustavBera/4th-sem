class Car{
	private String brand;
	private String model;
	private String RegNum;

	Car(String brand, String model, String RegNum){
		this.brand=brand;
		this.model=model;
		this.RegNum=RegNum;
	}
	public boolean equals(Object a) {
	 
		if(a==this)
			return true;
		if(!(a instanceof Car))
			return false;
		
		Car b=(Car) a;
		
		return brand.equals(b.brand)==true 
				&& model.equals(b.model)==true 
				&& RegNum.equals(b.RegNum)==true;
}
}
public class Equals3 {

	public static void main(String[] args) {
		Car myCar=new Car("Mercedes","S-104","OD331773");
		Car carInGarage=new Car("Mercedes","S-104","OD331773");
		if(myCar.equals(carInGarage))
			System.out.println("That's my car");
		else
			System.out.println("That's not mine");
	}

}
