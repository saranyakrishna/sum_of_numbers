package src;
import java.util.Scanner;

public class Solution{
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number");
		int A = scanner.nextInt();
		int count=0;
		for(int i=1;i*i<A;i++)
		{
			if(A%i==0) {
				if(i!=A/i) {
					count=count+2;
				}
				else {
				count++;
				}
			}
		}
		System.out.println("number of factors = "+count);
		
	}
}