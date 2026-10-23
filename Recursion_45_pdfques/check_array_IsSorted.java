package Recursion_45_pdfques;

public class check_array_IsSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,4,5,7};
		System.out.println(isSorted(arr,1));
	}
	public static boolean isSorted(int[] arr,int i)
	{
		if(i==arr.length)
		{
			return true;
		}
		
		if(arr[i-1]>arr[i])
		{
			return false;
		}
		return isSorted(arr,i+1);
	}

}
