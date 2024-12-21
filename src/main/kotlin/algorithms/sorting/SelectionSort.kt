package algorithms.sorting

/**
 * Selection Sort Algorithm
 *
 * Selection Sort is a straightforward, comparison-based sorting algorithm that divides the input array into two parts:
 * 1. **Sorted Part**: Initially empty, this portion grows as the algorithm progresses.
 * 2. **Unsorted Part**: Initially the entire array, this portion shrinks as elements are moved to the sorted part.
 *
 * The algorithm iteratively selects the smallest (or largest, depending on the desired sorting order) element from
 * the unsorted part and swaps it with the first element of the unsorted part, effectively growing the sorted portion
 * by one element at each iteration.
 *
 * ### How It Works:
 * 1. Start with the first element as the "current position."
 * 2. Traverse the unsorted part of the array to find the smallest element.
 * 3. Swap the smallest element with the element at the current position.
 * 4. Move the boundary of the sorted part one step forward.
 * 5. Repeat until the entire array is sorted.
 *
 * ### Complexity:
 * - **Time Complexity**:
 *   - Best Case: O(n²) (even for already sorted arrays, it still scans the unsorted part).
 *   - Worst Case: O(n²) (e.g., when the array is sorted in reverse order).
 *   - Average Case: O(n²).
 * - **Space Complexity**:
 *   - Auxiliary Space: O(1) (in-place sorting; no additional storage is used).
 *
 * ### Example Usage:
 * ```
 * val array = intArrayOf(64, 34, 25, 12, 22, 11, 90)
 * SelectionSort.sort(array)
 * println(array.joinToString(", ")) // Output: 11, 12, 22, 25, 34, 64, 90
 * ```
 *
 * ### Advantages:
 * 1. Simple to implement and understand.
 * 2. Performs well for small datasets or when memory usage is critical.
 *
 * ### Disadvantages:
 * 1. Inefficient for large datasets due to its O(n²) time complexity.
 * 2. Involves more swaps compared to some other algorithms, which may degrade performance for large arrays.
 *
 */
class SelectionSort {
    companion object {
        /**
         * Sorts the input array in ascending order using the Selection Sort algorithm.
         *
         * @param arr The array to be sorted.
         */
        fun sort(arr: IntArray) {
            val n = arr.size

            for (i in 0 until n - 1) {
                // Assume the first unsorted element is the smallest
                var minIndex = i

                for (j in i + 1 until n) {
                    // Find the index of the smallest element in the unsorted part
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j
                    }
                }

                // Swap the smallest element with the first unsorted element
                if (minIndex != i) {
                    val temp = arr[i]
                    arr[i] = arr[minIndex]
                    arr[minIndex] = temp
                }
            }
        }
    }
}
