package laskin;

import java.util.Scanner;

public class LaskeSumma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Summa sum = new Summa();
		
		System.out.print("Anna numero 1: ");
		double num1 = input.nextDouble();
		
		System.out.print("Anna numero 2: ");
		double num2 = input.nextDouble();

		sum.setSum( ( num1, num2 ) -> { num1 + num2});
	}

}
