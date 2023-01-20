package waitandnotify;

public class Producer implements Runnable{
	Factory f;
	public Producer(Factory a)
	{
		f = a;
	}
	public void run()
	{
		int i = 1;
		while(true)
		{
			f.setValue(i++);
		}
	}
}
