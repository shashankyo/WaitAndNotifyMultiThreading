package waitandnotify;

public class Consumer implements Runnable{
	Factory f;
	public Consumer(Factory b)
	{
		f = b;
	}

	public void run()
	{
		while(true)
		{
			f.getValue();
		}
	}
}
