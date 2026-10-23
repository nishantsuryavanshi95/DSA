package Arrays;
import java.util.Scanner;


public class cointainermostwater {
    static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int max_w=0,max=0,dist=0;
        int i=0;
        int j=n-1;
        while(i<j)
        {
            if(arr[i]<arr[j])
            {
                dist=Math.abs(j-i);
                max=arr[i]*dist;
                i++;
            }
            else {
                dist=Math.abs(j-i);
                max=arr[j]*dist;
                j--;

            }
            max_w=Math.max(max,max_w);
        }
        System.out.print(max_w);
    }
}
