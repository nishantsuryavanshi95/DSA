package Recursion_45_pdfques;

public class first_occurence_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,4,5,4};
		int item=7;
		System.out.print(first_occ(arr,item,0));
		
	}
	public static int first_occ(int[] arr,int item,int idx)
	{
		if(idx==arr.length)
		{
			return -1;
		}
		if(arr[idx]==item)
		{
			return idx;
		}
		return first_occ(arr,item,idx+1);
	}

}
