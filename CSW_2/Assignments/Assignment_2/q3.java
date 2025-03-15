package CSW_2.Assignments.Assignment_2;

import java.util.*;


public class q3 {

 static class Car implements Comparable<Car>{
		String model,color;
		int speed;

		//constructor
		public Car(int speed, String model, String color){
			this.speed = speed;
			this.model = model;
			this.color = color;
		}

		//Getters
		public String getModel(){
			return model;
		}
		public String getColor(){
			return color;
		}
		public int getSpeed(){
			return speed;
		}
  
  //ii. Compare the cars based on their speed. 
		@Override
		public int compareTo(Car c2){
			return this.speed - c2.speed;
		}
  @Override
    public String toString() {
        return "Model: " + model + ", Color: " + color + ", Speed: " + speed + " km/h";
    }
	}
	public static void main(String[] args) {
		
		//i. Instantiate two Car objects. 
		Car obj1 = new Car(49, "RAM", "black");
		Car obj2 = new Car(50, "Hummer", "white");
  Car fasterCar = obj1.compareTo(obj2)>0?obj1:obj2;
		//iii. Print the details of the car with the greater speed. 
		System.out.println("\nThe faster car is : "+fasterCar);

	}
}