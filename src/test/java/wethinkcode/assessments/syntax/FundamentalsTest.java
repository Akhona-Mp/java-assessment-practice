package wethinkcode.assessments.syntax;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for the Fundamentals class
 */
public class FundamentalsTest {

    @Test
    public void testGetDateOfBirth() {
        assertEquals("18/04/00", Fundamentals.getDateOfBirth("0004185035083"));
        assertEquals("22/11/01", Fundamentals.getDateOfBirth("0111224903088"));
        assertEquals("12/09/98", Fundamentals.getDateOfBirth("9809126723080"));
    }

    @Test
    public void testGetGender() {
        assertEquals("Male", Fundamentals.getGender("9106236034082"));
        assertEquals("Female", Fundamentals.getGender("9402030894089"));
        assertEquals("Female", Fundamentals.getGender("0312264983083"));
    }

    @Test
    public void testGetCitizenship() {
        assertEquals("South African", Fundamentals.getCitizenship("9407076583088"));
        assertEquals("Non-South African", Fundamentals.getCitizenship("9210304503182"));
        assertEquals("South African", Fundamentals.getCitizenship("0312264983083"));
    }

    @Test
    public void testFizzbuzz() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        Fundamentals.fizzbuzz(20);
        
        System.setOut(originalOut);
        
        String expectedOutput = "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n16\n17\nFizz\n19\nBuzz\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    // Note: The original Python test for check_number tests a student-created test file.
    // In Java, we'll directly test the checkNumber method instead.
    
    @Test
    public void testCheckNumberOddNumber() {
        // Tests for positive odd numbers
        for (int i = 1; i < 10; i += 2) {
            assertEquals("Weird", Fundamentals.checkNumber(i));
        }
    }
    
    @Test
    public void testCheckNumberEvenRange2To5() {
        // Tests for even numbers in the range 2 to 5
        for (int i = 2; i <= 5; i += 2) {
            assertEquals("Not Weird", Fundamentals.checkNumber(i));
        }
    }
    
    @Test
    public void testCheckNumberEvenRange6To20() {
        // Tests for even numbers in the range 6 to 20
        for (int i = 6; i <= 20; i += 2) {
            assertEquals("Weird", Fundamentals.checkNumber(i));
        }
    }
    
    @Test
    public void testCheckNumberEvenGreaterThan20() {
        // Tests for even numbers greater than 20
        for (int i = 22; i <= 60; i += 2) {
            assertEquals("Not Weird", Fundamentals.checkNumber(i));
        }
    }
    
    @Test
    public void testCheckNumberNegativeEvenNumber() {
        // Tests for negative even numbers
        for (int i = -50; i <= -2; i += 2) {
            assertEquals("Very Weird", Fundamentals.checkNumber(i));
        }
    }
    
    @Test
    public void testCheckNumberNegativeOddNumber() {
        // Tests for negative odd numbers
        for (int i = -51; i <= -1; i += 2) {
            assertEquals("Extremely Weird", Fundamentals.checkNumber(i));
        }
    }
    
    @Test
    public void testCheckNumberNeutral() {
        // Test for zero
        assertEquals("Neutral", Fundamentals.checkNumber(0));
    }
}