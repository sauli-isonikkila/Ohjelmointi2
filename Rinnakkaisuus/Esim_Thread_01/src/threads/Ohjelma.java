package threads;

public class Ohjelma extends Thread {

	public static void main(String[] args) {
		Ohjelma thread1 = new Ohjelma();
		thread1.start();
		System.out.println("Tämä koodi on säikeen ulkopuolella!");

	}
	
	public void run() {
		System.out.println("Tämä koodi on säikeen sisäpuolella!");
	}

}
