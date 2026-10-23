package Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class twosun2nd {
    static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int k=s.nextInt();
        int i=0;
        int j=n-1;
        int cur=0;
        while(i<j)
        {
            cur=arr[i]+arr[j];
            if(cur==k)
            {
                System.out.print(i+1);
                System.out.print(j+1);
                return;
            }
            else if(cur<k)
            {
                i++;
            }
            else
                j--;
        }

    }
}
