package org.example;

import org.junit.Test;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class PalindromeCheckerTest {
    @Test
    public void testPalindrome() {
        assertTrue(PalindromeChecker.isPalindrome("radar"));
        assertTrue(PalindromeChecker.isPalindrome("level"));
    }

    @Test
    public void testNotPalindrome() {
        assertFalse(PalindromeChecker.isPalindrome("hello"));
        assertFalse(PalindromeChecker.isPalindrome("world"));
    }

    @Test
    public void testEmptyString() {
        assertFalse(PalindromeChecker.isPalindrome(""));
    }

    @Test
    public void testSingleCharacter() {
        assertTrue(PalindromeChecker.isPalindrome("a"));
    }
}
