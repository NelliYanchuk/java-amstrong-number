package dev.nyanchuk.amstrong_number;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CommunicatorTest {

    // redirecting System.out to outputStreamCaptor
    // any output will be in outputStreamCaptor.
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private Communicator communicator;

    @BeforeEach
    public void setUp() {
        communicator = new Communicator();
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    private void simulateInput(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    @Test
    public void testValidArmstrongNumber() {
        simulateInput("153\n");
        communicator.run();
        assertTrue(outputStreamCaptor.toString().contains("Congrats! Yor number is the Amstrong number."));
    }

    @Test
    public void testInvalidArmstrongNumber() {
        simulateInput("100\n");
        communicator.run();
        assertTrue(outputStreamCaptor.toString().contains("Sorry, your number is not an Amstrong number."));
    }

    @Test
    public void testNegativeNumberInput() {
        simulateInput("-10\n");
        communicator.run();
        assertTrue(outputStreamCaptor.toString().contains("Incorrect input. \nEnter a positive number."));
    }

    @Test
    public void testNonIntegerInput() {
        simulateInput("abc\n");
        communicator.run();
        assertTrue(outputStreamCaptor.toString().contains("Incorrect input. \nEnter a positive number."));
    }
}
