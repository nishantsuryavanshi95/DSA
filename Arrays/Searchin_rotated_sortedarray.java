package Arrays;
public class Searchin_rotated_sortedarray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 9, 11, 0, 1, 2, 3};
        int target = 3;
        System.out.println(search(arr,target));
    }

    public static int search(int arr[], int target)
    {
        int l = 0, h = arr.length - 1;
        int ans=0;
        while (l <= h)
        {
            int mid = (l + h) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[l] <= arr[mid]) // upper line ka code
            {
                if (arr[l] <= target && arr[mid] > target) {
                    h = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (arr[h] >= target && arr[mid] < target) {
                    l = mid + 1;
                } else {
                    h = mid + 1;
                }
            }
            ans=mid;
        }
    return ans;
    }
}

