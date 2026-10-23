package oct_21;

public class Char_is_Present {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcbhjaijai";
		char ch='z';
		int i=2;
		System.out.println(Is_Present(str,ch,i));
	}
	//Recurssion ka nhi hai yeh ques
public static boolean Is_Present(String str,char ch,int idx)
{
	for(int i=2;i<str.length();i++)
	{
		if(str.charAt(i)==ch)
		{
			return true;
		}
	}
	return false;
}
}
