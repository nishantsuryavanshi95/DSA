package Arrays;
import java.util.Scanner;

public class Reversearrayby_k_timrs {
    static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        Rotate(arr,k);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void Rotate(int[] arr,int k)
    {
        int n=arr.length;
        k=k%n;
        // Reverse last k elements
        Reverse(arr,n-k,n-1);
        //Reverse starting element before k
        Reverse(arr,0,n-k-1);
        //Reverse full array
        Reverse(arr,0,n-1);
    }
    public static void Reverse(int[] arr,int i,int j)
    {
        //Method for reverse array
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
