package laskin;

public class Summa {
	private double sum;
	
	public Summa() {
		this.sum = 0;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	@Override
	public String toString() {
		return "Summa [sum=" + sum + "]";
	}
}
