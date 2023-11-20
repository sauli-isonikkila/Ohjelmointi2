package numerot;

public class Sum {

	private Double sum;

	public Sum() {
		this.sum = 0.0;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}

	@Override
	public String toString() {
		return "Summa [sum=" + sum + "]";
	}
}
