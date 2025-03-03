//alternate method to compare string
class Carr{
	private String brand;
	private String model;
	private String RegNum;

	Carr(String brand, String model, String RegNum){
		this.brand=brand;
		this.model=model;
		this.RegNum=RegNum;
	}
	public boolean equals(Object o) {
	 
		if(o instanceof Carr) {
			Carr car= (Carr) o;
			if(car.getBrand()== this.brand && car.getModel()==this.getModel()&& car.getRegNum()==this.getRegNum()){
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand=brand;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model=model;
		}
		public String getRegNum() {
			return RegNum;
		}
		public void setRegNum(String RegNum) {
			this.RegNum=RegNum;
		}
}
public class Equals4 {

	public static void main(String[] args) {
		Carr myCar=new Carr("Mercedes","S-104","OD331773");
		Carr carInGarage=new Carr("Mercedes","S-104","OD331773");
		if(myCar.equals(carInGarage))
			System.out.println("That's my car");
		else
			System.out.println("That's not mine");
	}

}



