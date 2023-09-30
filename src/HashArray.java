public class HashArray {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,4,5,2};
        int x = 6;

        int n = nums.length -1 ;
        int [] ans = new int[x];

        for(int i = 0; i<n-1; i++){
            ans[nums[i]] ++;
        }

        for(int i = 0; i < x; i++){
            System.out.println(ans[i]);
        }
    }
}
