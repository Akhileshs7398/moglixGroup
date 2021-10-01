
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 371, num, rmd, result = 0,count =0;
        num = number;
		
        while (num != 0) {
            num /= 10;
            ++count;
          }
        
        while (num != 0)
        {
            rmd = num % 10;
            result += Math.pow(rmd, count);
            num /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
		
	}

}
