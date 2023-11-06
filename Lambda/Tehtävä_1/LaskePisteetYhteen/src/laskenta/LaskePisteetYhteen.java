package laskenta;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class LaskePisteetYhteen {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Integer> pisteet = new ArrayList<Integer>();
		int piste;
		
		Summa sum = new Summa();
		
		for (int i=1; i<=7; i++) {
			System.out.print("Anna saamasi pisteet (nro " + i + ") " + ": ");
			piste = input.nextInt();
			pisteet.add(piste);
		} 
		
		pisteet.forEach(( n ) -> { 
			
			sum.setSum(sum.getSum() + n);
						
		});
		
		System.out.println("Viikko pisteesi ovat: " + sum.getSum());
		
		input.close();
	}

}
