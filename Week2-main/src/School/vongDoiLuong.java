package School;

public class vongDoiLuong {
	public static void main(String[] args) {
		Thread th1 = new Thread(new DnRunable2());
		th1.start();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		th1.interrupt();
	}
}
class DnRunable2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Luong dang chay - Trang thai " + Thread.currentThread().getState());
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("Luong bi ngat  - Trang thai " + Thread.currentThread().getState());
		}
		System.out.println("Luong da ket thuc - Trang thai " + Thread.currentThread().getState());
	}
	
}
