package algorithms.sorting

/**
 * Merge Sort is a divide-and-conquer sorting algorithm that splits an array into smaller parts,
 * sorts each part, and merges them back together in sorted order. It is efficient and commonly used
 * for large datasets and linked lists.
 *
 * ### Algorithm Steps
 * 1. **Divide**: Recursively split the array into two halves until each sub-array contains one element.
 * 2. **Conquer**:
 *    - Recursively sort each half of the array.
 * 3. **Combine**:
 *    - Merge the two sorted halves into a single sorted array by comparing elements.
 *
 * ### Time Complexity
 * - **Best Case:** O(n log n)
 *   Merge Sort consistently splits and merges arrays regardless of their initial order.
 *
 * - **Worst Case:** O(n log n)
 *   The algorithm always splits and merges arrays in the same way, even for reverse-ordered data.
 *
 * - **Average Case:** O(n log n)
 *   Regardless of input data, the time complexity remains the same due to the divide-and-conquer approach.
 *
 * ### Space Complexity
 * - **O(n)**
 *   Merge Sort requires additional space for temporary arrays during the merging process.
 *
 * ### Example Usage
 * ```kotlin
 * val array = intArrayOf(38, 27, 43, 3, 9, 82, 10)
 * val sortedArray = MergeSort.mergeSort(array)
 * println(sortedArray.joinToString(", ")) // Output: 3, 9, 10, 27, 38, 43, 82
 * ```
 *
 * ### Limitations
 * - Requires extra memory for temporary arrays, making it less space-efficient than in-place sorting algorithms.
 * - Slightly slower in practice compared to **Quick Sort** due to higher constant factors in its complexity.
 *
 * ### Advantages
 * - **Stable Sort**: Maintains the relative order of equal elements.
 * - Performs well with linked lists since random access is not required.
 * - Consistent time complexity of O(n log n) regardless of input data.
 *
 * ### Disadvantages
 * - Requires additional memory, which can be a constraint for large datasets.
 * - May be slower than Quick Sort for smaller datasets due to overhead in merging.
 */
class MergeSort {
    companion object {
        /**
         * Sorts the given array using the Merge Sort algorithm.
         *
         * @param array The array to be sorted.
         * @return A new sorted array.
         */
        fun mergeSort(array: IntArray): IntArray {
            // Base case: an array of size 1 or 0 is already sorted
            if (array.size <= 1) return array

            // Divide the array into two halves
            val mid = array.size / 2
            val left = array.sliceArray(0 until mid)
            val right = array.sliceArray(mid until array.size)

            // Recursively sort each half
            val sortedLeft = mergeSort(left)
            val sortedRight = mergeSort(right)

            // Merge the sorted halves
            return merge(sortedLeft, sortedRight)
        }

        /**
         * Merges two sorted arrays into a single sorted array.
         *
         * @param left The first sorted array.
         * @param right The second sorted array.
         * @return A new sorted array containing all elements from `left` and `right`.
         */
        private fun merge(left: IntArray, right: IntArray): IntArray {
            val result = mutableListOf<Int>()
            var i = 0
            var j = 0

            // Compare elements from both arrays and add the smaller element to the result
            while (i < left.size && j < right.size) {
                if (left[i] <= right[j]) {
                    result.add(left[i])
                    i++
                } else {
                    result.add(right[j])
                    j++
                }
            }

            // Add any remaining elements from the left array
            while (i < left.size) {
                result.add(left[i])
                i++
            }

            // Add any remaining elements from the right array
            while (j < right.size) {
                result.add(right[j])
                j++
            }

            return result.toIntArray()
        }
    }
}
