package lista;

import java.util.ArrayList;

public class ListanLapiKayntiOhjelma {
	private Integer sum = 0;
	
	public static void main(String[] args) {
		ArrayList<Integer> pisteet = new ArrayList<Integer>();
		
		pisteet.add(5);
		pisteet.add(20);
		pisteet.add(12);
		pisteet.add(30);
		pisteet.add(7);
		
		pisteet.forEach( (n) -> { System.out.println(n);});
		
		ListanLapiKayntiOhjelma o1 = new ListanLapiKayntiOhjelma();
		
		pisteet.forEach( (n) -> {o1.lisaaYksi(n);} );
	}

		public  void lisaaYksi(Integer num) {
			sum = sum + num;
		}
}
