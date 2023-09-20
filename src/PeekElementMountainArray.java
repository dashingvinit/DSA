public class PeekElementMountainArray {
    //https://leetcode.com/problems/peak-index-in-a-mountain-array/
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
    }

    static public int peakIndexInMountainArray(int[] arr) {
            int start = 0;
            int end = arr.length - 1;
            int mid = start + (end - start) / 2;

            while (start < end) {
                mid = start + (end - start) / 2;

                if (arr[mid] > arr[mid + 1]) {
                    end = mid;
                } else {
                    start = mid + 1;
                }
            }
            return start;
    }
}
