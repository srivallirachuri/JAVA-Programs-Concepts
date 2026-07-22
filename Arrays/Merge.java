package Arrays;
import java.util.Arrays;

class Merge {

    static int nextGap(int gap) {
        if (gap <= 1)
            return 0;
        return gap / 2 + gap % 2;
    }

    public static void main(String[] args) {

        int arr1[] = {1, 4, 7, 8, 10};
        int arr2[] = {2, 3, 9};

        int n = arr1.length;
        int m = arr2.length;

        int total = n + m;

        int gap = nextGap(total);

        while (gap > 0) {

            int left = 0;
            int right = gap;

            while (right < total) {

                if (left < n && right < n) {

                    if (arr1[left] > arr1[right]) {
                        int temp = arr1[left];
                        arr1[left] = arr1[right];
                        arr1[right] = temp;
                    }

                } else if (left < n && right >= n) {

                    if (arr1[left] > arr2[right - n]) {
                        int temp = arr1[left];
                        arr1[left] = arr2[right - n];
                        arr2[right - n] = temp;
                    }

                } else {

                    if (arr2[left - n] > arr2[right - n]) {
                        int temp = arr2[left - n];
                        arr2[left - n] = arr2[right - n];
                        arr2[right - n] = temp;
                    }
                }

                left++;
                right++;
            }

            gap = nextGap(gap);
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}