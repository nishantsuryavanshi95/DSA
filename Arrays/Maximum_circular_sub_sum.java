package Arrays;
public class Maximum_circular_sub_sum {
    static int main(String[] args) {
        int[] arr={1,-2,3,-2};
        int cur_max=0,cur_min=0,total_sum=0;
        int max_sum=Integer.MIN_VALUE;
        int min_sum=Integer.MAX_VALUE;
        int total = 0;
		for(int nums:arr)
        {
            int num = 0;
			cur_max = Math.max(num, cur_max + num);
            max_sum = Math.max(max_sum, cur_max);

            cur_min = Math.min(num, cur_min + num);
            min_sum = Math.min(min_sum, cur_min);

            total+=nums;
        }
        if(max_sum<0)
        {
            return max_sum;
        }
        else {
            return Math.max(max_sum,total-min_sum);
        }
    }
}
