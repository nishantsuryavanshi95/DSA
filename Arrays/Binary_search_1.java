package Arrays;
public class Binary_search_1 {
    public static void main(String[] args)
    {
        int arr[] ={2,3,4,5,6,7,8,9};
        int target=4;
        System.out.print(Search(arr,target));
    }
    public static int Search(int[] arr,int target)
    {
        int l=0;
        int h= arr.length-1;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]>target)
            {
                h=mid-1;
            }
            else {
                l=mid+1;
            }
        }
        return -1;
    }
}
