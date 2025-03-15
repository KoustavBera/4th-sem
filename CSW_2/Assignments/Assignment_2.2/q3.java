// /package CSW_2.Assignments.Assignment_2

import java.util.ArrayList;
import java.util.Collections;

public class q3 {
	public static void main(String[] args) {
		CarApp ca = new CarApp();
		ca.getCars();
	}
}

class Car implements Comparable<Car> {
	int modelNo, stock;
	String name;

	public Car(int m, int s, String n) {
		modelNo = m;
		stock = s;
		name = n;
	}

	@Override
	public int compareTo(Car c2) {
		return this.stock - c2.stock;
	}

	@Override
	public String toString() {
		return "Model No:" + modelNo + "\n Name:" + name + "\n stock" + stock;
	}
}

class CarApp {
	public void getCars() {
		ArrayList<Car> arr = new ArrayList<>();
		arr.add(new Car(723861, 10, "2013 Creta 10"));
		arr.add(new Car(723834, 30, "2020 MG 13"));
		arr.add(new Car(723867, 5, "2017 thar 2-door"));
		arr.add(new Car(723894, 1, "2021 XUV 700"));
		System.out.println("\nBefore Sorting\n----------------");
		for (Car c : arr) {
			System.out.println(c);
		}
		Collections.sort(arr);
		System.out.println("\nAfter sorting\n-----------------");
		for (Car c : arr) {
			System.out.println(c);
		}
	}
}