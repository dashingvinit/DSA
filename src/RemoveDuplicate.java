public class RemoveDuplicate {
    //https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 5, 5, 6};
        int ans = removeDuplicates(arr);
        System.out.println(ans);
    }

    static public int removeDuplicates(int[] arr) {
        int[] fr = new int[arr.length];
        int visited = -1;

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    //To avoid counting same element again
                    fr[j] = visited;
                }
            }
            if (fr[i] != visited)

                fr[i] = count;
        }

        return -1;
    }
}
