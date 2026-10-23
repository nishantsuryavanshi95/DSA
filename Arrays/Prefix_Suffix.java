package Arrays;
public class Prefix_Suffix {
    static void main(String[] args) {
        int[] arr={1,4,3,4,6,7};
    }
    public static void Prefix_suffix(int[] arr)
    {
        int n=arr.length;
        int[] left=new int[n];
        //Prefix
        left[0]=arr[0];
        for(int i=1;i<left.length;i++)
        {
            left[i]=left[i-1]+arr[i];
        }

        //suffix
        int[] right=new int[n];
        right[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            right[i]=right[i+1]+arr[i];
        }

    }
}
