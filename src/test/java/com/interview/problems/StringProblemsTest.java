package com.interview.problems;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StringProblemsTest {

    @Test
    void testReverseString() {
        String input = "hello";
        String result = StringProblems.reverseString(input);
        assertEquals("olleh", result);
    }

    @Test
    void testIsPalindrome() {
        assertTrue(StringProblems.isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(StringProblems.isPalindrome("race a car"));
    }

    @Test
    void testLengthOfLongestSubstring() {
        assertEquals(3, StringProblems.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, StringProblems.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, StringProblems.lengthOfLongestSubstring("pwwkew"));
    }
}
