package School;

public class myTheard extends Thread{
	@Override
	public void run() {
		System.out.println("Luong dang chay");
	}
	 
	public static void main(String[] args) {
		myTheard Th1 = new myTheard();
		Th1.start();	}
}
