package laskin;

import java.util.Scanner;


public class LaskeSumma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		System.out.print("Anna numero 1: ");
		double num1 = input.nextDouble();
		
		System.out.print("Anna numero 2: ");
		double num2 = input.nextDouble();

		IAddable sum =  (double n1, double n2) -> { 
			
			double s = 0;
			s = n1 + n2; 
			return s;
			};
		
		System.out.println("Summa on " + sum.add(num1, num2));
	}

}
