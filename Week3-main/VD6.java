package test;

public class VD6 {
    private Object monitor = new Object(); // Not strictly necessary for this logic
    private boolean isDataReady = false;

    public void productData() throws InterruptedException {

        synchronized (monitor) { 
        	while(isDataReady) {
				monitor.wait();
		}
        	System.out.println("san suot du lieu");
            Thread.sleep(1000);
            isDataReady = true;// Synchronize if data synchronization is needed
            monitor.notify();
            
        }
    }

    public void useData() throws InterruptedException {

        synchronized (monitor) {
        	while(!isDataReady) {
                monitor.wait();
            }
        	System.out.println("su dung du lieu......");
            Thread.sleep(1000);
            isDataReady = false;// Synchronize if data synchronization is needed
            monitor.notify();
        }
    }

    public static void main(String[] args) {
        VD6 ex = new VD6();
        Thread thSanXuat = new Thread(() -> {
            try {
                while (true) {
                    ex.productData();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        Thread thSuDung = new Thread(() -> {
            try {
                while (true) {
                    ex.useData();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        thSanXuat.start();
        thSuDung.start();
    }
}