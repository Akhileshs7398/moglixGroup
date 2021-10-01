
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp = 145;
		int n = temp;
		int sum = 0;
		while(n!=0)
		{
			int fact =1;
			int a = n%10;
			
			for(int i = 1;i<=a;i++)
				fact = fact*i;
			
			sum = sum+fact;
			n = n/10;
		}
		if(temp==sum)
		System.out.println("yes");
		else 
			System.out.println("no");
	}

}
