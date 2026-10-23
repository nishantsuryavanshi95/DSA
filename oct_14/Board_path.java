package oct_14;

public class Board_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		Path(n,0,"");
	}
	
	public static void Path(int n,int curr,String ans)
	{
		if(curr==n)
		{
			System.out.println(ans);
			return;
		}
		if(curr>n)
		{
			return;
		}
//		Path(n,curr+1,ans+1);
//		Path(n,curr+2,ans+2);
//		Path(n,curr+3,ans+3);
		
		
		//int c=0;
//		for(int dice=1;dice<=n;dice++)
//		{
//			c=c+Path(n,curr+dice,ans+dice);  count in case of loop
//		}
		
		//loop me call daal rhe hain 
		for(int dice=1;dice<=n;dice++)
		{
			Path(n,curr+dice,ans+dice);
		}
	}
}
