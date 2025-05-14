package wethinkcode.assessments.algorithms;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for the Algorithms class
 */
public class AlgorithmsTest {

    @Test
    public void testBubbleSort() {
        int[] arr = {5, 1, 4, 2, 8};
        int[] expected = {1, 2, 4, 5, 8};
        assertArrayEquals(expected, Algorithms.bubbleSort(arr));
        
        int[] arr2 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] expected2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(expected2, Algorithms.bubbleSort(arr2));
        
        int[] arr3 = {1};
        int[] expected3 = {1};
        assertArrayEquals(expected3, Algorithms.bubbleSort(arr3));
        
        int[] arr4 = {};
        int[] expected4 = {};
        assertArrayEquals(expected4, Algorithms.bubbleSort(arr4));
    }
    
    @Test
    public void testBinarySearch() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        assertEquals(0, Algorithms.binarySearch(arr, 1));
        assertEquals(4, Algorithms.binarySearch(arr, 5));
        assertEquals(9, Algorithms.binarySearch(arr, 10));
        assertEquals(-1, Algorithms.binarySearch(arr, 11));
        assertEquals(-1, Algorithms.binarySearch(arr, 0));
        
        int[] arr2 = {1};
        assertEquals(0, Algorithms.binarySearch(arr2, 1));
        assertEquals(-1, Algorithms.binarySearch(arr2, 2));
        
        int[] arr3 = {};
        assertEquals(-1, Algorithms.binarySearch(arr3, 1));
    }
    
    @Test
    public void testFibonacci() {
        assertEquals(0, Algorithms.fibonacci(0));
        assertEquals(1, Algorithms.fibonacci(1));
        assertEquals(1, Algorithms.fibonacci(2));
        assertEquals(2, Algorithms.fibonacci(3));
        assertEquals(3, Algorithms.fibonacci(4));
        assertEquals(5, Algorithms.fibonacci(5));
        assertEquals(8, Algorithms.fibonacci(6));
        assertEquals(13, Algorithms.fibonacci(7));
        assertEquals(21, Algorithms.fibonacci(8));
        assertEquals(34, Algorithms.fibonacci(9));
        assertEquals(55, Algorithms.fibonacci(10));
        
        assertThrows(IllegalArgumentException.class, () -> Algorithms.fibonacci(-1));
    }
    
    @Test
    public void testIsPrime() {
        assertFalse(Algorithms.isPrime(1));
        assertTrue(Algorithms.isPrime(2));
        assertTrue(Algorithms.isPrime(3));
        assertFalse(Algorithms.isPrime(4));
        assertTrue(Algorithms.isPrime(5));
        assertFalse(Algorithms.isPrime(6));
        assertTrue(Algorithms.isPrime(7));
        assertFalse(Algorithms.isPrime(8));
        assertFalse(Algorithms.isPrime(9));
        assertFalse(Algorithms.isPrime(10));
        assertTrue(Algorithms.isPrime(11));
        assertFalse(Algorithms.isPrime(12));
        assertTrue(Algorithms.isPrime(13));
        assertFalse(Algorithms.isPrime(14));
        assertFalse(Algorithms.isPrime(15));
        assertFalse(Algorithms.isPrime(16));
        assertTrue(Algorithms.isPrime(17));
        assertFalse(Algorithms.isPrime(18));
        assertTrue(Algorithms.isPrime(19));
        assertFalse(Algorithms.isPrime(20));
        
        assertFalse(Algorithms.isPrime(0));
        assertFalse(Algorithms.isPrime(-1));
        assertFalse(Algorithms.isPrime(-2));
    }
    
    @Test
    public void testSieveOfEratosthenes() {
        List<Integer> expected = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19);
        assertEquals(expected, Algorithms.sieveOfEratosthenes(20));
        
        List<Integer> expected2 = Arrays.asList(2, 3, 5, 7);
        assertEquals(expected2, Algorithms.sieveOfEratosthenes(10));
        
        List<Integer> expected3 = Arrays.asList(2);
        assertEquals(expected3, Algorithms.sieveOfEratosthenes(2));
        
        assertThrows(IllegalArgumentException.class, () -> Algorithms.sieveOfEratosthenes(1));
        assertThrows(IllegalArgumentException.class, () -> Algorithms.sieveOfEratosthenes(0));
        assertThrows(IllegalArgumentException.class, () -> Algorithms.sieveOfEratosthenes(-1));
    }
    
    @Test
    public void testMergeSort() {
        int[] arr = {5, 1, 4, 2, 8};
        int[] expected = {1, 2, 4, 5, 8};
        assertArrayEquals(expected, Algorithms.mergeSort(arr));
        
        int[] arr2 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] expected2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(expected2, Algorithms.mergeSort(arr2));
        
        int[] arr3 = {1};
        int[] expected3 = {1};
        assertArrayEquals(expected3, Algorithms.mergeSort(arr3));
        
        int[] arr4 = {};
        int[] expected4 = {};
        assertArrayEquals(expected4, Algorithms.mergeSort(arr4));
    }
    
    @Test
    public void testGcd() {
        assertEquals(1, Algorithms.gcd(1, 1));
        assertEquals(2, Algorithms.gcd(2, 4));
        assertEquals(1, Algorithms.gcd(3, 5));
        assertEquals(6, Algorithms.gcd(6, 12));
        assertEquals(6, Algorithms.gcd(12, 6));
        assertEquals(6, Algorithms.gcd(18, 12));
        assertEquals(1, Algorithms.gcd(17, 13));
        assertEquals(4, Algorithms.gcd(8, 12));
        
        assertEquals(3, Algorithms.gcd(3, 0));
        assertEquals(5, Algorithms.gcd(0, 5));
        assertThrows(IllegalArgumentException.class, () -> Algorithms.gcd(0, 0));
    }
    
    @Test
    public void testLcm() {
        assertEquals(1, Algorithms.lcm(1, 1));
        assertEquals(4, Algorithms.lcm(2, 4));
        assertEquals(15, Algorithms.lcm(3, 5));
        assertEquals(12, Algorithms.lcm(6, 12));
        assertEquals(12, Algorithms.lcm(12, 6));
        assertEquals(36, Algorithms.lcm(18, 12));
        assertEquals(221, Algorithms.lcm(17, 13));
        assertEquals(24, Algorithms.lcm(8, 12));
        
        assertThrows(IllegalArgumentException.class, () -> Algorithms.lcm(0, 5));
        assertThrows(IllegalArgumentException.class, () -> Algorithms.lcm(5, 0));
        assertThrows(IllegalArgumentException.class, () -> Algorithms.lcm(0, 0));
    }
}