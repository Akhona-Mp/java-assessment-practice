package wethinkcode.assessments.quotes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Mini Assessment - Quote System
 */
public class QuoteSystem {

    private static final List<String> QUOTEES = Arrays.asList(
            "Abdullah Ibrahim", "Miriam Makeba", "Nelson Mandela", "Eleanor Roosevelt",
            "Anne Frank", "Alexander Graham Bell", "Thomas Edison", "Estee Lauder", 
            "Maya Angelou", "Walt Disney");

    /**
     * Step 1: Update the below method to correctly choose text file chosen from command line arguments.
     * Use `quotes.txt` for blank user input.
     *
     * @param userInput The user input for the file name
     * @return The file name to use
     */
    public static String askFileName(String userInput) {
        // TODO: Implement this method
        return null;
    }

    /**
     * Step 2: Correct the functionality in the method below to successfully open file
     * and to successfully handle the FileNotFoundException.
     *
     * @param fileName The name of the file to read
     * @return The content of the file or an error message
     */
    public static String readFile(String fileName) {
        // TODO: Implement this method
        return null;
    }

    /**
     * Step 3: Randomly select quotee from `QUOTEES` list and return a random quotee.
     *
     * @param quotees The list of quotees
     * @return A randomly selected quotee
     */
    public static String selectRandomQuotee(List<String> quotees) {
        // TODO: Implement this method
        return null;
    }

    /**
     * Step 4: Correct the functionality in the method below to match quote from text file to chosen quotee.
     * "Quote/quotee does not exist." must be returned for quote that doesn't exist.
     *
     * @param randomQuotee The randomly selected quotee
     * @param quotes The list of quotes
     * @return The quote for the quotee or an error message
     */
    public static String findQuote(String randomQuotee, List<String> quotes) {
        // TODO: Implement this method
        return null;
    }

    /**
     * Step 5: Correctly print out the final results to pass the unit tests.
     *
     * @param quote The quote
     * @param quotee The quotee
     */
    public static void finalOutput(String quote, String quotee) {
        // TODO: Implement this method
    }

    /**
     * Main method to run the quote system.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Desired file? [leave empty to use quotes.txt] :");
        String userInput = scanner.nextLine();
        String quotesFile = askFileName(userInput);
        System.out.println("'" + quotesFile + "': is your chosen file.\n");
        
        String fileContent = readFile(quotesFile);
        List<String> quotes = Arrays.asList(fileContent.split("\n\n"));
        
        String randomQuotee = selectRandomQuotee(QUOTEES);
        if (randomQuotee.isEmpty()) {
            System.out.println("Empty list.\n");
        } else {
            System.out.println(randomQuotee + " has randomly been chosen.\n");
        }
        
        String trueQuote = findQuote(randomQuotee, quotes);
        if (trueQuote.isEmpty()) {
            System.out.println(randomQuotee + " is not present in the file\n");
            return;
        } else {
            System.out.println(randomQuotee + " is present in the file\n");
            finalOutput(trueQuote, randomQuotee);
        }
        
        scanner.close();
    }
}