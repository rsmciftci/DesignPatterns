package rsmciftci.creationalpatterns.factory.third;

public class MergeSorting implements SortingAlgorithms{

    @Override
    public void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);

    }

    private static void merge(int[] arr, int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int left[] = new int[n1];
        int right[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            left[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            right[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            }
            else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of left[] if any */
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        /* Copy remaining elements of right[] if any */
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    private static void sort(int[] arr, int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

}
