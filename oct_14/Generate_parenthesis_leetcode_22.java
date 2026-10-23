package oct_14;

import java.util.*;
import java.util.List;

public class Generate_parenthesis_leetcode_22 {

	public static void main(String[] args)
	{
		int n=3;
		List<String> ll=new ArrayList<>();
		generate_parenthesis(n,0,0,"",ll);
		System.out.print(ll);
	}
	public static void generate_parenthesis(int n,int open,int closed,String ans,List<String> ll)
	{
		if(open==n&&closed==n)
		{
			//Syetem.out.println(ans);
			ll.add(ans);
			return;
		}
		if(open>n||closed>open)
		{
			return;
		}
		generate_parenthesis(n,open+1,closed,ans+"(",ll);
		generate_parenthesis(n,open,closed+1,ans+")",ll);
	}

}
