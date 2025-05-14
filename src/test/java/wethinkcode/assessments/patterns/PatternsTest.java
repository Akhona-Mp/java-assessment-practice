package wethinkcode.assessments.patterns;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.PrintStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for the Patterns class
 */
public class PatternsTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    @Test
    public void testShape1() {
        System.setIn(new ByteArrayInputStream("Square\n".getBytes()));
        assertEquals("square", Patterns.getShape());
    }

    @Test
    public void testShape2() {
        System.setIn(new ByteArrayInputStream("pYraMid\n".getBytes()));
        assertEquals("pyramid", Patterns.getShape());
    }

    @Test
    public void testHeight() {
        System.setIn(new ByteArrayInputStream("5\n".getBytes()));
        assertInstanceOf(Integer.class, Patterns.getHeight());
    }

    @Test
    public void testSquare1() {
        Patterns.drawSquare(4);
        assertEquals("****\n****\n****\n****\n", outContent.toString());
    }

    @Test
    public void testSquare2() {
        Patterns.drawSquare(10);
        assertEquals("**********\n**********\n**********\n**********\n**********\n**********\n**********\n**********\n**********\n**********\n", outContent.toString());
    }

    @Test
    public void testTriangleReversed1() {
        Patterns.drawTriangleReversed(3);
        assertEquals("1 1 1 \n2 2 \n3 \n", outContent.toString());
    }

    @Test
    public void testTriangleReversed2() {
        Patterns.drawTriangleReversed(5);
        assertEquals("1 1 1 1 1 \n2 2 2 2 \n3 3 3 \n4 4 \n5 \n", outContent.toString());
    }

    @Test
    public void testTriangle1() {
        Patterns.drawTriangle(3);
        assertEquals("1 \n1 2 \n1 2 3 \n", outContent.toString());
    }

    @Test
    public void testTriangle2() {
        Patterns.drawTriangle(5);
        assertEquals("1 \n1 2 \n1 2 3 \n1 2 3 4 \n1 2 3 4 5 \n", outContent.toString());
    }

    @Test
    public void testTriangleMultiplication1() {
        Patterns.drawTriangleMultiplication(6);
        assertEquals("1 \n2 4 \n3 6 9 \n4 8 12 16 \n5 10 15 20 25 \n6 12 18 24 30 36 \n", outContent.toString());
    }

    @Test
    public void testTriangleMultiplication2() {
        Patterns.drawTriangleMultiplication(10);
        assertEquals("1 \n2 4 \n3 6 9 \n4 8 12 16 \n5 10 15 20 25 \n6 12 18 24 30 36 \n7 14 21 28 35 42 49 \n8 16 24 32 40 48 56 64 \n9 18 27 36 45 54 63 72 81 \n10 20 30 40 50 60 70 80 90 100 \n", outContent.toString());
    }

    @Test
    public void testPyramid1() {
        Patterns.drawPyramid(3);
        assertEquals("  *\n ***\n*****\n", outContent.toString());
    }

    @Test
    public void testPyramid2() {
        Patterns.drawPyramid(5);
        assertEquals("    *\n   ***\n  *****\n *******\n*********\n", outContent.toString());
    }

    @Test
    public void testTrianglePrime1() {
        Patterns.drawTrianglePrime(5);
        assertEquals("2 \n3 5 \n7 11 13 \n17 19 23 29 \n31 37 41 43 47 \n", outContent.toString());
    }

    @Test
    public void testTrianglePrime2() {
        Patterns.drawTrianglePrime(10);
        assertEquals("2 \n3 5 \n7 11 13 \n17 19 23 29 \n31 37 41 43 47 \n53 59 61 67 71 73 \n79 83 89 97 101 103 107 \n109 113 127 131 137 139 149 151 \n157 163 167 173 179 181 191 193 197 \n199 211 223 227 229 233 239 241 251 257 \n", outContent.toString());
    }

    @Test
    public void testPascalTriangleN0() {
        // Test for n = 0 (base case)
        assertArrayEquals(new int[]{1}, Patterns.pascalTriangle(0));
    }

    @Test
    public void testPascalTriangleN3() {
        // Test for n = 3
        assertArrayEquals(new int[]{1, 3, 3, 1}, Patterns.pascalTriangle(3));
    }

    @Test
    public void testPascalTriangleN5() {
        // Test for n = 5
        assertArrayEquals(new int[]{1, 5, 10, 10, 5, 1}, Patterns.pascalTriangle(5));
    }

    @Test
    public void testPascalTriangleNegative() {
        // Test for a negative value of n
        assertThrows(IllegalArgumentException.class, () -> Patterns.pascalTriangle(-1));
    }

    @Test
    public void testPascalTriangleLarge() {
        // Test for a large value of n
        assertArrayEquals(new int[]{1, 20, 190, 1140, 4845, 15504, 38760, 77520, 125970, 167960, 184756, 167960, 125970, 77520, 38760, 15504, 4845, 1140, 190, 20, 1}, Patterns.pascalTriangle(20));
    }
}