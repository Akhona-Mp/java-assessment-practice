package wethinkcode.assessments.quotes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for the QuoteSystem class
 */
public class QuoteSystemTest {

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
    public void testChooseQuoteFile() {
        assertEquals("quotes.txt", QuoteSystem.askFileName("quotes.txt"));
    }

    @Test
    public void testChooseQuoteFileBlankInput() {
        assertEquals("quotes.txt", QuoteSystem.askFileName(""));
    }

    @Test
    public void testFileNotFound() {
        QuoteSystem.readFile("mock.txt");
        assertTrue(outContent.toString().contains("FileNotFoundError successfully handled"));
    }

    @Test
    public void testFileSuccessfullyOpened() {
        // Create a test file
        try {
            FileWriter writer = new FileWriter("test_quotes.txt");
            writer.write("Test quote");
            writer.close();
        } catch (IOException e) {
            fail("Could not create test file");
        }

        outContent.reset();
        String result = QuoteSystem.readFile("test_quotes.txt");
        
        assertTrue(outContent.toString().contains("File successfully opened"));
        assertNotNull(result);
        
        // Clean up
        new File("test_quotes.txt").delete();
    }

    @Test
    public void testChooseRandomQuotee() {
        assertEquals("Eleanor Roosevelt", QuoteSystem.selectRandomQuotee(Arrays.asList("Eleanor Roosevelt")));
    }

    @Test
    public void testFindQuoteAgainstQuotee() {
        List<String> quotes = Arrays.asList("Thomas Edison ~ \"I failed my way to success.\"");
        assertEquals("Thomas Edison ~ \"I failed my way to success.\"", 
                    QuoteSystem.findQuote("Thomas Edison", quotes));
    }

    @Test
    public void testQuoteDoesNotExist() {
        List<String> quotes = Arrays.asList(
            "Estee Lauder ~ \"I never dreamed about success, I worked for it.\"",
            "Thomas Edison ~ \"I failed my way to success.\"",
            "Alexander Graham Bell ~ \"Before anything else, preparation is the key to success.\""
        );
        assertEquals("Quote/quotee does not exist.", QuoteSystem.findQuote("Walt Disney", quotes));
    }

    @Test
    public void testFindQuoteAgainstQuotee2() {
        List<String> quotes = Arrays.asList("Anne Frank ~ \"I failed my way to success.\"");
        assertEquals("Anne Frank ~ \"I failed my way to success.\"", 
                    QuoteSystem.findQuote("Anne Frank", quotes));
    }

    @Test
    public void testFinalOutput() {
        QuoteSystem.finalOutput("Albert Einstein ~ \"We cannot solve our problems with the same thinking we used when we created them.\"", "Albert Einstein");
        assertTrue(outContent.toString().contains("Quote found in file:"));
        assertTrue(outContent.toString().contains("'Albert Einstein': \"We cannot solve our problems with the same thinking we used when we created them.\""));
    }

    @Test
    public void testUniqueTextFile() {
        // Create a test file
        try {
            FileWriter writer = new FileWriter("myfile.txt");
            writer.write("Walt Disney ~ \"All our dreams can come true,if we have the courage to pursue them.\"");
            writer.close();
        } catch (IOException e) {
            fail("Could not create test file");
        }

        assertEquals("myfile.txt", QuoteSystem.askFileName("myfile.txt"));
        
        outContent.reset();
        QuoteSystem.readFile("myfile.txt");
        
        List<String> quotes = Arrays.asList("Walt Disney ~ \"All our dreams can come true,if we have the courage to pursue them.\"");
        assertEquals("Walt Disney ~ \"All our dreams can come true,if we have the courage to pursue them.\"", 
                    QuoteSystem.findQuote("Walt Disney", quotes));
        
        outContent.reset();
        QuoteSystem.finalOutput("Walt Disney ~ \"All our dreams can come true,if we have the courage to pursue them.\"", "Walt Disney");
        
        assertTrue(outContent.toString().contains("Quote found in file:"));
        assertTrue(outContent.toString().contains("'Walt Disney': \"All our dreams can come true,if we have the courage to pursue them.\""));
        
        // Clean up
        new File("myfile.txt").delete();
    }
}