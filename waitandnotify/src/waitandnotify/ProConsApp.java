package waitandnotify;

public class ProConsApp {
	public static void main(String[] args) {
		Factory f =  new Factory();
		Producer p = new Producer(f);
		Consumer c = new Consumer(f);
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();
	}
}
