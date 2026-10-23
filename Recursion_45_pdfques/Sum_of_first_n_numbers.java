package Recursion_45_pdfques;

import java.util.*;

public class Sum_of_first_n_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(sum(n));
		sc.close();
	}
	public static int sum(int n)
	{
		if(n==0)
		{
			return 0;
		}
		int s=sum(n-1);
		return s+n;
	}

}
