package Arrays;
public class Sort_colour_leetcode_75 {
    static void main(String[] args) {
        int nums[] = {2, 0, 2, 1, 1, 0};
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        for (int x : nums)
            System.out.print(x + " ");
    }
}
