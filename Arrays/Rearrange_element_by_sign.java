package Arrays;
import java.util.Arrays;

public class Rearrange_element_by_sign {
    static void main(String[] args) {
        int[] arr={3,1,-2,-5,2,-4};
        int n= arr.length;
        int[] pos=new int[n/2];
        int[] neg=new int[n/2];
        int a=0,b=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=0)
            {
                pos[a]=arr[i];
                a++;
            }
            else {
                neg[b]=arr[i];
                b++;
            }
        }
      int c=0,d=0;
        for(int k=0;k< arr.length;k++)
        {
            if(k%2==0)
            {
                arr[k]=pos[c];
                c++;
            }
            else{
                arr[k]=neg[d];
                d++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
