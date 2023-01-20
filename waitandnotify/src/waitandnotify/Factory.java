package waitandnotify;

public class Factory {
int x;
boolean valueInx = false;
synchronized void setValue(int j)
{
	try
	{
		if(valueInx == true)
		{
			wait();
		}
		else
		{
			x = j;
			System.out.println("I have put value" + x + "in x");
			valueInx = true;
			notify();
		}	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	synchronized void getValue()
	{
		try
		{
			if(valueInx == false)
			{
				wait();
			}
			else
			{
				System.out.println("I have took the value" + x + "from x");
				valueInx = false;
				notify();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

