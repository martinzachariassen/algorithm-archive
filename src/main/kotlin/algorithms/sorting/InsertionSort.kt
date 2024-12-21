package no.zachen.algorithms.sorting

/**
 * Implementation of the Insertion Sort algorithm.
 *
 * Insertion Sort is a straightforward and intuitive sorting algorithm that builds
 * the final sorted array (or list) one element at a time. It is akin to the process
 * of sorting playing cards in your hand: taking one card at a time and placing it
 * in the correct position relative to the sorted cards.
 *
 * ## Algorithm Description:
 * - Traverse the array from the second element (index 1) to the last.
 * - At each step, take the current element (referred to as the "key") and compare it
 *   to the elements in the sorted portion of the array (to its left).
 * - Shift all elements in the sorted portion that are greater than the key one position
 *   to the right to create space for the key.
 * - Insert the key into its correct position.
 *
 * ## Performance Characteristics:
 * 1. **Time Complexity:**
 *    - Best Case (Already sorted): O(n)
 *    - Average Case: O(n^2)
 *    - Worst Case (Reversed order): O(n^2)
 * 2. **Space Complexity:** O(1) (In-place sorting; no additional space is required)
 *
 * ## Example Usage:
 * ```
 * val numbers = intArrayOf(8, 4, 6, 2, 9)
 * InsertionSort.sort(numbers)
 * println(numbers.joinToString(", ")) // Output: 2, 4, 6, 8, 9
 * ```
 *
 * ## Limitations:
 * - Not suitable for large datasets due to its O(n^2) time complexity in the average and worst cases.
 * - Ideal for small or nearly sorted arrays.
 *
 * ## Advantages:
 * - Simple to implement and understand.
 * - Performs well on small or nearly sorted datasets.
 *
 * ## Disadvantages:
 * - Poor performance on large datasets compared to more advanced algorithms like
 *   Quick Sort or Merge Sort.
 */
class InsertionSort {
    companion object {
        /**
         * Sorts the given array in ascending order using the Insertion Sort algorithm.
         *
         * @param arr the array to be sorted.
         */
        fun sort(arr: IntArray) {
            for (i in 1 until arr.size) {
                val key = arr[i]
                var j = i - 1

                // Shift elements of arr[0..i-1] that are greater than the key
                // to one position ahead of their current position
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j]
                    j--
                }

                // Place the key in its correct position
                arr[j + 1] = key
            }
        }
    }
}
