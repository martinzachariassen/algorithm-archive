package algorithms.sorting

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class MergeSortTest {

    @Test
    fun `test sorting of an already sorted array`() {
        val array = intArrayOf(1, 2, 3, 4, 5)
        val expected = intArrayOf(1, 2, 3, 4, 5)

        val result = MergeSort.mergeSort(array)

        assertArrayEquals(expected, result, "MergeSort should not modify an already sorted array")
    }

    @Test
    fun `test sorting of a reverse-ordered array`() {
        val array = intArrayOf(5, 4, 3, 2, 1)
        val expected = intArrayOf(1, 2, 3, 4, 5)

        val result = MergeSort.mergeSort(array)

        assertArrayEquals(expected, result, "MergeSort should correctly sort a reverse-ordered array")
    }

    @Test
    fun `test sorting of an unsorted array`() {
        val array = intArrayOf(38, 27, 43, 3, 9, 82, 10)
        val expected = intArrayOf(3, 9, 10, 27, 38, 43, 82)

        val result = MergeSort.mergeSort(array)

        assertArrayEquals(expected, result, "MergeSort should correctly sort an unsorted array")
    }

    @Test
    fun `test sorting of an array with duplicate elements`() {
        val array = intArrayOf(4, 2, 4, 3, 1, 2)
        val expected = intArrayOf(1, 2, 2, 3, 4, 4)

        val result = MergeSort.mergeSort(array)

        assertArrayEquals(expected, result, "MergeSort should handle arrays with duplicate elements correctly")
    }

    @Test
    fun `test sorting of an array with a single element`() {
        val array = intArrayOf(42)
        val expected = intArrayOf(42)

        val result = MergeSort.mergeSort(array)

        assertArrayEquals(expected, result, "MergeSort should return the same array when it has a single element")
    }

    @Test
    fun `test sorting of an empty array`() {
        val array = intArrayOf()
        val expected = intArrayOf()

        val result = MergeSort.mergeSort(array)

        assertArrayEquals(expected, result, "MergeSort should return an empty array when input is empty")
    }

    @Test
    fun `test sorting of an array with negative numbers`() {
        val array = intArrayOf(-3, -1, -7, -4, -2)
        val expected = intArrayOf(-7, -4, -3, -2, -1)

        val result = MergeSort.mergeSort(array)

        assertArrayEquals(expected, result, "MergeSort should correctly sort arrays with negative numbers")
    }

    @Test
    fun `test sorting of an array with mixed positive and negative numbers`() {
        val array = intArrayOf(3, -1, 0, -7, 4, 2)
        val expected = intArrayOf(-7, -1, 0, 2, 3, 4)

        val result = MergeSort.mergeSort(array)

        assertArrayEquals(expected, result, "MergeSort should correctly sort arrays with mixed positive and negative numbers")
    }
}
