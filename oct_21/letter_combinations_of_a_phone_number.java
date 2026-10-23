package oct_21;
public class letter_combinations_of_a_phone_number {
	// Leetcode 17
	
	static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques="23";
		key_paid(ques,"");
	}
	public static void key_paid(String ques,String ans)
	{
		if(ques.length()==0)
		{
			System.out.println(ans);
			return;
		}
		char ch=ques.charAt(0); // charctor from me aayega isko int me change krenge
		String s=key[ch-'0'];
		for(int i=0;i<s.length();i++)
		{
			key_paid(ques.substring(1),ans+s.charAt(i));
		}
		
	}

}
