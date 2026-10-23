package Recursion_45_pdfques;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.print("Fcatorial of "+n+" is = "+Fact(n));
	}
	public static int Fact(int n)
	{
		if(n==0)
		{
			return 1;
		}
		int f=Fact(n-1);
		return f*n;
	}

}
