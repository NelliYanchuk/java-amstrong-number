package dev.nyanchuk.amstrong_number;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AmstrongNumberTest {
    @Test
    void testIsAnAmstrongNumber() {
        assertTrue(AmstrongNumber.isAnAmstrongNumber(371));
        assertTrue(AmstrongNumber.isAnAmstrongNumber(1634));
        assertFalse(AmstrongNumber.isAnAmstrongNumber(351));
        assertFalse(AmstrongNumber.isAnAmstrongNumber(2015));

    }
}
