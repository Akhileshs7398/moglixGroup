
public class Leapyear {
	public static void main(String args[])
	{
	int n=2000;
	boolean y = false;
	if(n%4==0)
	{
		if(n%100==0)
		{
			if(n%400==0)
				y = true;
			else
				y = false;
		}
		y = true;
	}
	else
		y = false;
	

	if(y)
		System.out.println("yes");
	else
		System.out.println("no");
	}
}
