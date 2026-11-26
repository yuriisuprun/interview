package com.interview.problems;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArrayProblemsTest {

    @Test
    void testTwoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = ArrayProblems.twoSum(nums, target);
        
        assertNotNull(result);
        assertEquals(2, result.length);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }

    @Test
    void testMaxSubarray() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = ArrayProblems.maxSubarray(nums);
        assertEquals(6, result);
    }

    @Test
    void testRotateArray() {
        int[] nums = {1, 2, 3, 4, 5};
        ArrayProblems.rotateArray(nums, 2);
        
        int[] expected = {4, 5, 1, 2, 3};
        assertArrayEquals(expected, nums);
    }
}
