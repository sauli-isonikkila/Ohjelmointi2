package model;

public class Tuote {
	private String nimi;
	private double hinta;
	
	public Tuote() {
		// TODO Auto-generated constructor stub
	}

	public Tuote(String nimi, double hinta) {
		this.nimi = nimi;
		this.hinta = hinta;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public double getHinta() {
		return hinta;
	}

	public boolean setHinta(double hinta) {
		boolean isOk = false;
		if (hinta >= 0) {
			this.hinta = hinta;
			isOk = true;
		} else {
			isOk = false;
		}
		return isOk;
	}

	@Override
	public String toString() {
		return "Tuote [nimi=" + nimi + ", hinta=" + hinta + "]";
	}
}
