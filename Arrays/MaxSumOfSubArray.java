package Arrays;
public class MaxSumOfSubArray {
    static void main(String[] args) {
        int[] arr={2,3,-7,4,-1,9};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            int sum1=0;
            for(int j=i;j<arr.length;j++)
            {
                sum1+=arr[j];
            }
            sum=Math.max(sum,sum1);
            // T.c= O(N^2)
        }
        System.out.println(sum);
    }

}
