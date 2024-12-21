package algorithms.sorting

import no.zachen.algorithms.sorting.InsertionSort
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class InsertionSortTest {

    @Test
    fun `should sort an already sorted array`() {
        val input = intArrayOf(1, 2, 3, 4, 5)
        val expected = intArrayOf(1, 2, 3, 4, 5)

        InsertionSort.sort(input)

        assertArrayEquals(expected, input)
    }

    @Test
    fun `should sort a reversed array`() {
        val input = intArrayOf(5, 4, 3, 2, 1)
        val expected = intArrayOf(1, 2, 3, 4, 5)

        InsertionSort.sort(input)

        assertArrayEquals(expected, input)
    }

    @Test
    fun `should sort an array with random order`() {
        val input = intArrayOf(8, 4, 6, 2, 9)
        val expected = intArrayOf(2, 4, 6, 8, 9)

        InsertionSort.sort(input)

        assertArrayEquals(expected, input)
    }

    @Test
    fun `should handle an array with duplicates`() {
        val input = intArrayOf(4, 2, 2, 8, 4, 6)
        val expected = intArrayOf(2, 2, 4, 4, 6, 8)

        InsertionSort.sort(input)

        assertArrayEquals(expected, input)
    }

    @Test
    fun `should handle an empty array`() {
        val input = intArrayOf()
        val expected = intArrayOf()

        InsertionSort.sort(input)

        assertArrayEquals(expected, input)
    }

    @Test
    fun `should handle an array with one element`() {
        val input = intArrayOf(42)
        val expected = intArrayOf(42)

        InsertionSort.sort(input)

        assertArrayEquals(expected, input)
    }

    @Test
    fun `should handle an array with all identical elements`() {
        val input = intArrayOf(7, 7, 7, 7, 7)
        val expected = intArrayOf(7, 7, 7, 7, 7)

        InsertionSort.sort(input)

        assertArrayEquals(expected, input)
    }
}
