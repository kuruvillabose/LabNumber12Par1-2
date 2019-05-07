package inheritance;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<UsedCar> usedCars = new ArrayList<>();
		int num = 0;
		String ans;

		usedCars.add(new UsedCar("Nikolai", "Models", 2017, 54999.90));
		usedCars.add(new UsedCar("Ford", "Escape", 2017, 31999.90));
		usedCars.add(new UsedCar("Chevy", "Vette", 2017, 44989.95));

		usedCars.add(new UsedCar("Honda", "Prior", 2015, 14795.95, 35987.6));
		usedCars.add(new UsedCar("GC", "Chirpus", 2013, 8500.00, 12345.0));
		usedCars.add(new UsedCar("GC", "Witherell", 2016, 1414450.00, 3500.3));
		System.out.println(usedCars.size());
		do {
			for (int i = 0; i < usedCars.size(); i++) {
				System.out.println((i + 1) + "." + usedCars.get(i));
			}
			System.out.println(usedCars.size() + 1 + ".Quit");
			try {
				System.out.println("Which car would you like");
				num = scan.nextInt();

				System.out.println(usedCars.get(num - 1));
			} catch (IndexOutOfBoundsException e) {
				if (num == usedCars.size() + 1) {
					System.out.println("Have a great day");
					break;
				} else {
					System.out.println("Sorry that car is not in Stock!");
					continue;
				}
			}
			scan.nextLine();
			System.out.println("Would you like to buy this car? (y/n)");
			ans = scan.next();
			if (ans.equalsIgnoreCase("Y")) {
				System.out.println("Excellent! Our finance departmnet will be in touch shortly");
				System.out.println(" ");
				System.out.println(" ");
				usedCars.remove(num - 1);
			} else {
				continue;
			}
		} while (num <= 0 || num > usedCars.size());

		scan.close();
	}

}
