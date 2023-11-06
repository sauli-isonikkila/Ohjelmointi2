package laskenta;

public class Summa {
	private int sum;

	public Summa() {
		this.sum = 0;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	@Override
	public String toString() {
		return "Summa [sum=" + sum + "]";
	}

}
