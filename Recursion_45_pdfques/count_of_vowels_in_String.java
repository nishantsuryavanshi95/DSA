package Recursion_45_pdfques;

import java.util.Scanner;

public class count_of_vowels_in_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(count(s));
		sc.close();
	}
	public static int count(String s)
	{
		if(s.length()==0)
		{
			return 0;
		}
		char ch=s.charAt(0);
		if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
		{
			return 1+count(s.substring(1));
		}
		else {
			return count(s.substring(1));
		}
	}
}
