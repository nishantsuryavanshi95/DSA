package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class demo {
    static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=0;
        int[][] arr=new int[3][];
        //System.out.println(arr.length);
        for(int i=0;i< arr.length;i++)
        {
            n=s.nextInt();
            arr[i]=new int[n];
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i].length);
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=s.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
