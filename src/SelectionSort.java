import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {5,2,3,1};
        System.out.println(Arrays.toString(array));
        int[] numbers = sortArrayByParity(array);
        System.out.println(Arrays.toString(numbers));
    }
    static public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;

        for(int i = 0; i<n; i++){
            int min = i;

            for(int j = i+1; j<n; j++){
                if(nums[min]>nums[j]){
                    min = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }
        return nums;
    }
}
