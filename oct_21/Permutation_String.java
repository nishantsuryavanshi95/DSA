package oct_21;

public class Permutation_String {
	public static void main(String[] args)
	{
		String ques="abc";
		print(ques,"");
		
		// for remove to lduplicate isme ham set bhi use kr skte hain 
	}
	public static void print(String ques,String ans)
	{
	if(ques.length()==0)
	{
		System.out.println(ans);
		return;
	}
	{
		for(int i=0;i<ques.length();i++)
		{
			char ch=ques.charAt(i);
			String s1=ques.substring(0,i);
			String s2=ques.substring(i+1);
			print(s1+s2,ans+ch);
		}
	}
	}
}
