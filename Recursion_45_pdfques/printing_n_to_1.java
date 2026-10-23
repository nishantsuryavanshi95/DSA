package Recursion_45_pdfques;

public class printing_n_to_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		Print(n);
	}
	public static void Print(int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.println(n);  // for n to 1
		Print(n-1);
		//System.out.println(n);  for 1 to n
	}

}
