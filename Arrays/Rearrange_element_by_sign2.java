package Arrays;
import java.util.Arrays;

public class Rearrange_element_by_sign2 {
    static void main(String[] args) {
        int[] arr={3,1,-2,-5,2,-4};
        int n= arr.length;
        int p=0,neg=1;
        int ans[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=0)
            {
                ans[p]=arr[i];
                p+=2;
            }
            else {
                ans[neg]=arr[i];
                neg+=2;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
