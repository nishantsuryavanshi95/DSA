package oct_21;

public class Lexographical_order_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=133;
		Lexographical(n,0);
	}
	public static void Lexographical(int n,int curr)
	{
		if(curr>n)
		{
			return;
		}
		System.out.println(curr);
		int i=0;
		if(curr==0)
		{
			i=1;
		}
		for(;i<=9;i++)
		{
			Lexographical(n,curr*10+i);
		}
	}

}
