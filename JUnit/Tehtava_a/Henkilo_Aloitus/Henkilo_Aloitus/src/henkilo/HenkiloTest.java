package henkilo;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HenkiloTest {

	@Test
	void testGetIka() {
		// Lis‰‰ koodisi
	}

	private Henkilo createHenkiloWithIka(int ikaToTest) {
		int currentYear = LocalDate.now().getYear();	
		int syntVuosi = currentYear - ikaToTest;
		String syntPvm = syntVuosi + "-01-01";
		Henkilo h1 = new Henkilo("Matti", syntPvm);
		return h1;
	}

	@Test
	void testIs17YearOldIsNot18OrOlder() {
		// Lis‰‰ oma koodisi:
		
	}

	// Tee lis‰‰ testitapauksia metodeina_
	
	

}
