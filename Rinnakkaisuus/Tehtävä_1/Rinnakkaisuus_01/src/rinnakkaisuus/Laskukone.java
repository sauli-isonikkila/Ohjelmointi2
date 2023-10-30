package rinnakkaisuus;

public class Laskukone extends Thread {
	private int sum;
	
	public  Laskukone() {
		this.sum = 0;
	}
	
	public static void main(String[] args) {
		Laskukone laskin1 = new Laskukone();
		
		laskin1.start();
		
		laskin1.setSum(laskin1.getSum() + 1);
		System.out.println("sum muuttujan arvon säikeen ulkopuolella on " + laskin1.toString());	

	}

	public void run() {
		sum++;
		System.out.println("sum muuttujan arvo säikeen sisällä on " + sum);
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	
	@Override
	public String toString() {
		return "Laskukone [sum=" + sum + "]";
	}

}
