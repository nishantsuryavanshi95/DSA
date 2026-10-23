package Arrays;
public class Moore_voting_Algo {
    static void main(String[] args) {
        int[] arr={2,2,1,1,1,2,2};
        System.out.print(Moore_voting(arr));

    }
    public static int Moore_voting(int[] arr)
    {
        int e=arr[0];
        int vote=1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==e)
            {
                vote++;
            }
            else {
                vote--;
            }
            if(vote==0)
            {
                e=arr[0];
                vote=1;
            }
        }
        return e;
    }
}
