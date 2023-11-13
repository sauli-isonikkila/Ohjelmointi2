package henkilo;

import java.time.LocalDate;
import java.time.Period;

public class Henkilo {
	
	private String nimi;
	private LocalDate syntPvm;

	public Henkilo() {
		// TODO Auto-generated constructor stub
	}

	public Henkilo(String nimi, String syntPvm) {
		this.nimi = nimi;
		this.syntPvm = parseSyntPvm(syntPvm);
	}
	
	private LocalDate parseSyntPvm(String syntPvm) {
		int vvvv = Integer.parseInt(syntPvm.substring(0,4));
		int kk = Integer.parseInt(syntPvm.substring(5,7));
		int pv = Integer.parseInt(syntPvm.substring(8,10));
		return LocalDate.of(vvvv, kk, pv);
	}
	
	public int getIka() {
		Period ika = Period.between(syntPvm, LocalDate.now());
		return ika.getYears();
	}
	
	public boolean is18orOlder() {
		return getIka() >= 18;
	}
	
	public boolean isValidAge() {
		return getIka() >= 0;
	}
	
	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	
	public LocalDate getSyntPvm() {
		return syntPvm;
	}

	public void setSyntPvm(String syntPvm) {
		this.syntPvm = parseSyntPvm(syntPvm);
	}

	@Override
	public String toString() {
		return "Henkilo [nimi=" + nimi + ", syntPvm=" + syntPvm + "]";
	}
	
}
