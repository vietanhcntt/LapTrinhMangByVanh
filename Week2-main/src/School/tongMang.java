package School;

public class tongMang {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		int numThears =2;
		Thread[] ths = new Thread[numThears];
		SumCalculator[] cals = new 	SumCalculator[numThears];
		for(int i=0;i<numThears;i++) {
			cals[i] = new SumCalculator(array, i, numThears);
			ths[i] = new Thread(cals[i]);
			ths[i].start();
		}
		for(int i=0;i<numThears;i++) {
			try {
				ths[i].join();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		int total =0;
		for(SumCalculator c: cals) {
			total += c.getTong1Phan();
		}
		System.err.println("TOng la :  "+total);
	}
}
class SumCalculator implements Runnable{

	private int[] array;
	private int strarIndex;
	private int chia;
	private int tong1Phan;
	
	public SumCalculator(int[] array, int strarIndex, int chia) {
		super();
		this.array = array;
		this.strarIndex = strarIndex;
		this.chia = chia;
		this.tong1Phan = 0;
	}

	@Override
	public void run() {
		for(int i = strarIndex;i<array.length;i+=chia) {
			tong1Phan+=array[i];
		}
		
	}
	public int getTong1Phan() {
		return tong1Phan;
	}
}