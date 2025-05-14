package wethinkcode.assessments.patterns;

import java.util.Scanner;

/**
 * Mini Assessment - Patterns
 */
public class Patterns {

    /**
     * Get a shape from user input (it can't be blank and must be a valid shape!)
     *
     * @return The shape entered by the user
     */
    public static String getShape() {
        // TODO: Implement this method
        return null;
    }

    /**
     * Get height from user input (it must be an integer!)
     * The maximum possible height must be 80
     *
     * @return The height entered by the user
     * @throws IllegalArgumentException if the height is not a valid integer or is greater than 80
     */
    public static int getHeight() {
        // TODO: Implement this method
        return 0;
    }

    /**
     * Draws a square pattern of asterisks (*) with the given height and width.
     *
     * @param height The height and width of the square. Must be a positive integer.
     */
    public static void drawSquare(int height) {
        // TODO: Implement this method
    }

    /**
     * Draws a centered pyramid pattern of asterisks (*) with the given height.
     *
     * @param height The height of the pyramid. Must be a positive integer.
     */
    public static void drawPyramid(int height) {
        // TODO: Implement this method
    }

    /**
     * Draws a number triangle where each row contains sequential numbers from 1 to the row number.
     *
     * @param height The height of the triangle. Must be a positive integer.
     */
    public static void drawTriangle(int height) {
        // TODO: Implement this method
    }

    /**
     * Draw an inverted number triangle where each row begins with its position number,
     * with the top row having the most repeated numbers and each row below having one fewer repetition.
     *
     * @param height The height of the triangle. Must be a positive integer.
     */
    public static void drawTriangleReversed(int height) {
        // TODO: Implement this method
    }

    /**
     * Draws a multiplication triangle where each row shows products of the row number.
     *
     * @param height The height of the triangle. Must be a positive integer.
     */
    public static void drawTriangleMultiplication(int height) {
        // TODO: Implement this method
    }

    /**
     * Draws a triangle of prime numbers where each row contains the first n primes
     * that fit the row width.
     *
     * @param height The height of the triangle. Must be a positive integer.
     */
    public static void drawTrianglePrime(int height) {
        // TODO: Implement this method
    }

    /**
     * Main drawing function that calls the appropriate shape-specific drawing function
     * based on the requested shape type.
     *
     * @param shape  The type of shape to draw. Must be one of:
     *               - "square": A square of asterisks
     *               - "triangle_reversed": Inverted triangle of repeated row numbers
     *               - "triangle": Triangle of sequential numbers
     *               - "triangle_multiplication": Triangle of multiplication products
     *               - "pyramid": Centered pyramid of asterisks
     *               - "triangle_prime": Triangle of prime numbers
     * @param height The height of the shape. Must be a positive integer.
     */
    public static void draw(String shape, int height) {
        // TODO: Implement this method
    }

    /**
     * Returns the factorial of a number
     *
     * @param n The number to calculate factorial for
     * @return The factorial of n
     */
    public static int factorial(int n) {
        // TODO: Implement this method
        return 0;
    }

    /**
     * Generates Pascal's triangle and returns the final row as an array.
     *
     * @param n The row number of Pascal's triangle to generate (0-based index).
     * @return The final row of Pascal's triangle as an array.
     * @throws IllegalArgumentException if n is negative
     */
    public static int[] pascalTriangle(int n) {
        // TODO: Implement this method
        return null;
    }

    /**
     * Main method to run the patterns program.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        String shape = getShape();
        int height = getHeight();
        draw(shape, height);
    }
}