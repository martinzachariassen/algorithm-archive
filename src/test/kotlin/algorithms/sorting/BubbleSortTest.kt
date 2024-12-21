package algorithms.sorting

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class BubbleSortTest {

    @Test
    fun `should sort an already sorted array`() {
        val input = intArrayOf(1, 2, 3, 4, 5, 6)
        val expected = intArrayOf(1, 2, 3, 4, 5, 6)

        BubbleSort.sort(input)

        assertArrayEquals(expected, input)
    }

    @Test
    fun `should sort a reversed array`() {
        val input = intArrayOf(6, 5, 4, 3, 2, 1)
        val expected = intArrayOf(1, 2, 3, 4, 5, 6)

        BubbleSort.sort(input)

        assertArrayEquals(expected, input)
    }

    @Test
    fun `should sort an array with random order`() {
        val input = intArrayOf(5, 2, 4, 6, 1, 3)
        val expected = intArrayOf(1, 2, 3, 4, 5, 6)

        BubbleSort.sort(input)

        assertArrayEquals(expected, input)
    }

    @Test
    fun `should handle an array with duplicate elements`() {
        val input = intArrayOf(4, 2, 4, 6, 1, 3)
        val expected = intArrayOf(1, 2, 3, 4, 4, 6)

        BubbleSort.sort(input)

        assertArrayEquals(expected, input)
    }

    @Test
    fun `should handle an empty array`() {
        val input = intArrayOf()
        val expected = intArrayOf()

        BubbleSort.sort(input)

        assertArrayEquals(expected, input)
    }

    @Test
    fun `should handle an array with one element`() {
        val input = intArrayOf(42)
        val expected = intArrayOf(42)

        BubbleSort.sort(input)

        assertArrayEquals(expected, input)
    }

    @Test
    fun `should handle an array with negative numbers`() {
        val input = intArrayOf(5, -2, 4, -6, 1, 3)
        val expected = intArrayOf(-6, -2, 1, 3, 4, 5)

        BubbleSort.sort(input)

        assertArrayEquals(expected, input)
    }
}
