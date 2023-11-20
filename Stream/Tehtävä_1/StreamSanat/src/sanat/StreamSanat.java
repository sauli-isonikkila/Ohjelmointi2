package sanat;

import java.util.ArrayList;
import java.util.List;

public class StreamSanat {

	public static void main(String[] args) {
		List<String> sanat = new ArrayList<String>();
		sanat.add("talo");
		sanat.add("on");
		sanat.add("punainen");
		sanat.add("ja");
		sanat.add("sijaitsee");
		sanat.add("tuulisella");
		sanat.add("mäellä");
		
		long lkm = sanat.stream().filter(sana -> sana.length()>=4).count();
		
		System.out.println("Sanoja, joiden pituus on 4 merkkiä tai enemmän on " + lkm);
	}

}
