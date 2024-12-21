package algorithms.sorting

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SelectionSortTest {

    @Test
    fun `test sorting of an unsorted array`() {
        val input = intArrayOf(64, 34, 25, 12, 22, 11, 90)
        val expected = intArrayOf(11, 12, 22, 25, 34, 64, 90)

        SelectionSort.sort(input)

        assertArrayEquals(expected, input, "The array should be sorted in ascending order.")
    }

    @Test
    fun `test sorting of an already sorted array`() {
        val input = intArrayOf(1, 2, 3, 4, 5)
        val expected = intArrayOf(1, 2, 3, 4, 5)

        SelectionSort.sort(input)

        assertArrayEquals(expected, input, "The array should remain unchanged as it is already sorted.")
    }

    @Test
    fun `test sorting of a reverse sorted array`() {
        val input = intArrayOf(5, 4, 3, 2, 1)
        val expected = intArrayOf(1, 2, 3, 4, 5)

        SelectionSort.sort(input)

        assertArrayEquals(expected, input, "The array should be sorted in ascending order.")
    }

    @Test
    fun `test sorting of an array with duplicates`() {
        val input = intArrayOf(4, 2, 2, 8, 3, 3, 1)
        val expected = intArrayOf(1, 2, 2, 3, 3, 4, 8)

        SelectionSort.sort(input)

        assertArrayEquals(expected, input, "The array should handle duplicates and sort correctly.")
    }

    @Test
    fun `test sorting of an array with a single element`() {
        val input = intArrayOf(42)
        val expected = intArrayOf(42)

        SelectionSort.sort(input)

        assertArrayEquals(expected, input, "A single-element array should remain unchanged.")
    }

    @Test
    fun `test sorting of an empty array`() {
        val input = intArrayOf()
        val expected = intArrayOf()

        SelectionSort.sort(input)

        assertArrayEquals(expected, input, "An empty array should remain unchanged.")
    }

    @Test
    fun `test sorting of an array with negative numbers`() {
        val input = intArrayOf(-3, -1, -4, -2, 0)
        val expected = intArrayOf(-4, -3, -2, -1, 0)

        SelectionSort.sort(input)

        assertArrayEquals(expected, input, "The array with negative numbers should be sorted in ascending order.")
    }
}
