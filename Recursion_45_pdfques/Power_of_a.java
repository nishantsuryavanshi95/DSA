package Recursion_45_pdfques;

public class Power_of_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3;
		int n=4;
		System.out.println(pow(a,n));
	}
	public static int pow(int a,int n)
	{
		if(n==0)
		{
			return 1;
		}
		int p=pow(n-1,a);
		return p*a;
	}

}
