package laskin;

import java.util.Scanner;

public class LaskeSumma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Anna numero 1: ");
		double num1 = input.nextDouble();
		
		System.out.print("Anna numero 2: ");
		double num2 = input.nextDouble();

		IAddable sum =  (n1, n2) -> (  n1 + n2 );
		
		System.out.println("Summa on " + sum.add(num1, num2));
	}

}
