package School;

public class daLuong {
	public static void main(String[] args) {
		Thread th1 = new Thread(new DnRunnable("Luong 1"));
		th1.start();
		Thread th2 = new Thread(new DnRunnable("Luong 1"));
		th2.start();
	}
}
class DnRunnable implements Runnable{
	private String theardName;
	public DnRunnable(String name ) {
		this.theardName = name;
	}
	@Override
	public void run() {
		System.out.println("bat dau thuc hien cong viec "+ theardName);
		for(int i=0;i<5;i++) {
			System.out.println(theardName+"Buoc "+i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("ket thuc cong viec cua "+theardName);
	}
}
