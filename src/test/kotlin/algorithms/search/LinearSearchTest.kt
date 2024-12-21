package algorithms.search

import algorithms.searching.LinearSearch
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test

class LinearSearchTest {

    @Test
    fun `should return true if the array contains the target (middle element)`() {
        val input = intArrayOf(1, 2, 3, 4, 5)
        val target = 3

        assertTrue(LinearSearch.search(input, target))
    }

    @Test
    fun `should return true if the array contains the target (first element)`() {
        val input = intArrayOf(1, 2, 3, 4, 5)
        val target = 1

        assertTrue(LinearSearch.search(input, target))
    }

    @Test
    fun `should return true if the array contains the target (last element)`() {
        val input = intArrayOf(1, 2, 3, 4, 5)
        val target = 5

        assertTrue(LinearSearch.search(input, target))
    }

    @Test
    fun `should return true if the array contains the target (duplicate element)`() {
        val input = intArrayOf(1, 2, 3, 4, 3)
        val target = 3

        assertTrue(LinearSearch.search(input, target))
    }

    @Test
    fun `should return false if the array does not contain the target`() {
        val input = intArrayOf(1, 2, 3, 4, 5)
        val target = 6

        assertFalse(LinearSearch.search(input, target))
    }

    @Test
    fun `should return false for an empty array`() {
        val input = intArrayOf()
        val target = 3

        assertFalse(LinearSearch.search(input, target))
    }

    @Test
    fun `should return true for an array with one element matching the target`() {
        val input = intArrayOf(3)
        val target = 3

        assertTrue(LinearSearch.search(input, target))
    }

    @Test
    fun `should return false for an array with one element not matching the target`() {
        val input = intArrayOf(1)
        val target = 3

        assertFalse(LinearSearch.search(input, target))
    }

    @Test
    fun `should return true for an array containing negative numbers`() {
        val input = intArrayOf(-3, -2, -1, 0, 1)
        val target = -2

        assertTrue(LinearSearch.search(input, target))
    }

    @Test
    fun `should return false for a target not in the array with negative numbers`() {
        val input = intArrayOf(-3, -2, -1, 0, 1)
        val target = 4

        assertFalse(LinearSearch.search(input, target))
    }
}
