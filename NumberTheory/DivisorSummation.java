import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0){
			int n = sc.nextInt();
			if(n == 1){
				System.out.println(0);
				continue;
			}
			int sum = 0;
			for(int i = 1; i <= Math.sqrt(n); i++){
				if(n % i == 0){
				    if(i == 1){
					    sum += 1;
					    continue;
			    	}
				    if(i == (n/i))
				        sum += i;
				    else
				        sum += (i + (n/i));
			    }
			}
			System.out.println(sum);
		}
	}
}