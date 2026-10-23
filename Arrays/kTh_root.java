package Arrays;
public class kTh_root {
    static void main(String[] args) {
        int n=149,k=3;
        System.out.println(Root(n,k));
    }
    public static int Root(int n,int k)
    {
        int l=1,h=n;
        int ans=0;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(Math.pow(mid,k)<=n)
            {
                ans=mid;
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return ans;
    }
}
