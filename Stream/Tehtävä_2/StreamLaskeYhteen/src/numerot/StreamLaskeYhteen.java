package numerot;

import java.util.ArrayList;
import java.util.List;

public class StreamLaskeYhteen {

	public static void main(String[] args) {
		List<Double> numerot = new ArrayList<Double>();
		
		numerot.add(2.5);
		numerot.add(6.0);
		numerot.add(4.25);
		numerot.add(10.0);
		numerot.add(1.25);
		
		
		long lkm = numerot.stream().filter((numero)->(numero>=3)).count();
		
		System.out.println("Numeroita, jotka ovat yhtäsuuria tai suurempia kuin 2 on " + lkm);
	}
}
