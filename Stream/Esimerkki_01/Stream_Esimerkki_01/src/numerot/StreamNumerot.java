package numerot;

import java.util.ArrayList;
import java.util.List;

public class StreamNumerot {

	public static void main(String[] args) {
		List<Integer> numerot = new ArrayList<Integer>();
		
		numerot.add(4);
		numerot.add(19);
		numerot.add(2);
		numerot.add(7);
		numerot.add(5);
		numerot.add(3);
		
		long lkm = numerot.stream().filter(numero -> numero<7).count();

		System.out.println("Numeroita, jotka ovat pienempiä kuin 7 on " + lkm);
	}

}
