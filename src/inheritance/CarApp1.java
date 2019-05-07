package inheritance;

import java.util.ArrayList;
import java.util.Scanner;
public class CarApp1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ArrayList<Car> cars=new ArrayList<>();
		String make,model;
		int year;
		double price;
		System.out.println("Welcome to the Grand Circus Motors admin console!");
		System.out.println("How many cars are you entering:");
		int num=scan.nextInt();
		scan.nextLine(); //garbage line
		
		for(int i=0;i<num;i++) {
			make=Validator.getString(scan ,"Enter Car#"+(i+1)+ " Make");
			model=Validator.getString(scan ,"Enter Car #"+(i+1)+ " Model");
			year=Validator.getInt(scan,"Enter Car #"+(i+1)+ " Year");
			price=Validator.getDouble(scan,"Enter Car #"+(i+1)+ " Price");
			scan.nextLine();//garbage line)
			cars.add(new Car(make,model,year,price));
		}
		System.out.println("Current Inventory:");
		for(int i=0;i<cars.size();i++) {
			System.out.println(cars.get(i));
		}
		
		scan.close();
	}


}


