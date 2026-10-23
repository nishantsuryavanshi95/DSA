package oct_14;
public class count_seqwunnce {
   public static void main(String[] args)
   {
	   String ques="abc";
//	   Count(ques,"");
	   System.out.print("\n"+Count(ques,""));
   }
//   static int c =0;
   public static int Count(String ques,String ans) {
	   if(ques.length()==0)
	   {
		   System.out.print(ans+ " ");
		   return 1;
	   }
	   char ch=ques.charAt(0);
	   int x = Count(ques.substring(1),ans);
	  int y =  Count(ques.substring(1),ans+ch);
	  return x+y;
   }
   }
