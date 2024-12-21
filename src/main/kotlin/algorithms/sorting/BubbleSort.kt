package algorithms.sorting

/**
 * Bubble Sort is a simple, comparison-based sorting algorithm.
 * It repeatedly steps through the list, compares adjacent elements, and swaps them
 * if they are in the wrong order. This process continues until the list is fully sorted.
 *
 * ### Algorithm Steps
 * 1. Start from the beginning of the list.
 * 2. Compare each pair of adjacent elements.
 *    - If the first element is greater than the second, swap them.
 * 3. Continue this process to the end of the list.
 * 4. After each pass, the largest unsorted element moves to its correct position.
 * 5. Repeat the process for the remaining unsorted portion of the list until no swaps are needed.
 *
 * ### Time Complexity
 * - **Best Case:** O(n)
 *   The array is already sorted, so the algorithm completes in a single pass with no swaps.
 *
 * - **Worst Case:** O(n^2)
 *   The array is sorted in reverse order, requiring n-1 passes and the maximum number of swaps.
 *
 * - **Average Case:** O(n^2)
 *   The array is in random order, resulting in a quadratic number of comparisons and swaps on average.
 *
 * ### Space Complexity
 * - **O(1)**
 *   Bubble Sort is an in-place sorting algorithm, meaning it uses constant extra space
 *   and requires no additional data structures.
 *
 * ### Example Usage
 * ```
 * val arr = intArrayOf(5, 3, 8, 4, 2)
 * val sortedArr = BubbleSort.sort(arr)
 * println(sortedArr.joinToString(", ")) // Output: 2, 3, 4, 5, 8
 * ```
 *
 * ### Limitations
 * - Inefficient for large datasets compared to more advanced search algorithms like Binary Search.
 * - Does not leverage any ordering or structure in the data.
 * - Requires linear traversal, even if the array is sorted.
 *
 * ### Advantages
 * - Simple to implement and understand.
 * - Works for both sorted and unsorted arrays.
 * - No preprocessing or extra memory required.
 *
 * ### Disadvantages
 * - Performance is poor for large datasets due to its linear time complexity.
 * - Not suitable for use cases where search performance is critical.
 */
class BubbleSort {
    companion object {
        /**
         * Sorts the given array using the Bubble Sort algorithm.
         *
         * @param arr the array to be sorted
         * @return the sorted array (modifies the input array in place)
         */
        fun sort(arr: IntArray): IntArray {
            val n = arr.size
            var swapped: Boolean

            for (i in 0 until n - 1) { // Outer loop for passes
                swapped = false

                for (j in 0 until n - i - 1) { // Inner loop for comparing adjacent elements
                    if (arr[j] > arr[j + 1]) { // Swap if the element is greater
                        val temp = arr[j]
                        arr[j] = arr[j + 1]
                        arr[j + 1] = temp
                        swapped = true
                    }
                }

                if (!swapped) break // Break if no swaps occurred, array is sorted
            }

            return arr
        }
    }
}
