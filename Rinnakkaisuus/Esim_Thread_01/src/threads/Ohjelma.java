package threads;

public class Ohjelma extends Thread {

	public static void main(String[] args) {
		Ohjelma thread1 = new Ohjelma();
		thread1.start();
		System.out.println("T�m� koodi on s�ikeen ulkopuolella!");

	}
	
	public void run() {
		System.out.println("T�m� koodi on s�ikeen sis�puolella!");
	}

}
