package algorithms.searching

/**
 * Implementation of the Linear Search algorithm.
 *
 * Linear search is a straightforward algorithm that sequentially checks each element in a list
 * until the target element is found or the end of the list is reached.
 *
 * ### Characteristics:
 * - **Input**: A list of integers and the target integer to search for.
 * - **Output**: A boolean value indicating whether the target element is present in the list.
 *
 * ### Algorithm Steps:
 * 1. Start from the first element in the list.
 * 2. Compare each element with the target.
 * 3. If a match is found, return `true`.
 * 4. If the end of the list is reached without finding the target, return `false`.
 *
 * ### Time Complexity:
 * - **Best Case**: O(1) - Target is the first element.
 * - **Worst Case**: O(n) - Target is not present or is the last element.
 * - **Average Case**: O(n) - Target is somewhere in the middle or not present.
 *
 * ### Space Complexity:
 * - O(1) - The algorithm uses constant extra space.
 *
 * ### Example Usage:
 * ```
 * val numbers = intArrayOf(10, 20, 30, 40, 50)
 * val isFound = LinearSearch.search(numbers, 30)
 * println(isFound) // Output: true
 * ```
 * ### Advantages:
 * 1. Simple and easy to implement.
 * 2. Works on both sorted and unsorted lists.
 * 3. Requires no additional data structures or preprocessing.
 *
 * ### Disadvantages:
 * 1. Inefficient for large datasets due to O(n) complexity.
 * 2. Performs poorly compared to more advanced search algorithms (e.g., binary search) for sorted data.
 * 3. Not suitable for time-critical applications.
 *
 * ### Limitations:
 * 1. Can only be applied to finite datasets.
 * 2. Performance degrades linearly as input size increases.
 * 3. Not optimized for repeated searches; each search starts from scratch.
 */
class LinearSearch {
    companion object {
        /**
         * Performs a linear search to check if the target integer exists in the list.
         *
         * @param arr The list of integers to search in.
         * @param target The integer to search for.
         * @return `true` if the target is found, `false` otherwise.
         */
        fun search(arr: IntArray, target: Int): Boolean {
            for (i in arr.indices) {
                if (arr[i] == target) { // Check if the current element matches the target
                    return true // Return true if the element is found
                }
            }
            return false // Return false if the element is not found
        }
    }
}
