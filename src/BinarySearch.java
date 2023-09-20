public class BinarySearch {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 5, 6, 9};
//        int target = 4;
//        int ans = bs(arr, target);
//        System.out.println(ans);

        char[] letters = {'c', 'f', 'j'};
        char target2 = 'd';
        char letter = letter(letters, target2);
        System.out.println(letter);
    }

    static char letter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (target > letters[letters.length - 1]) {
                return letters[0];
            }

            if (letters[mid] > target) {
                end = mid - 1;
            } else if (letters[mid] < target) {
                start = mid + 1;
            }

            if (letters[end] == target) {
                return letters[end + 1];
            }
        }

        return letters[end];
    }

    static int bs(int[] arr, int target) {

        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
