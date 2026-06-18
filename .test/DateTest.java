import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    // -------------------- isValid() Tests --------------------

    @Test
    @DisplayName("isValid() should return true for a valid leap year date (Feb 28, 2024)")
    void isValid_validLeapYearDate_returnsTrue() {
        assertTrue(Date.isValid(2024, 2, 28));
    }

    @Test
    @DisplayName("isValid() should return false for invalid month (month = 0)")
    void isValid_invalidMonth_returnsFalse() {
        assertFalse(Date.isValid(2020, 0, 10));
    }

    @Test
    @DisplayName("isValid() should return false for invalid day (day = 32 in December)")
    void isValid_invalidDay_returnsFalse() {
        assertFalse(Date.isValid(2020, 12, 32));
    }

    @Test
    @DisplayName("isValid() should return false for invalid month and day (month = 13, day = 0)")
    void isValid_invalidMonthAndDay_returnsFalse() {
        assertFalse(Date.isValid(2020, 13, 0));
    }


    // -------------------- toString() Tests --------------------

    @Test
    @DisplayName("toString() should return formatted string for valid date (2024-06-24)")
    void toString_validDate_returnsFormattedString() {
        assertEquals("2024-06-24", Date.toString(2024, 6, 24));
    }

    @Test
    @DisplayName("toString() should return 'invalid' for invalid date (Feb 29, 2023)")
    void toString_invalidDate_returnsInvalid() {
        assertEquals("invalid", Date.toString(2023, 2, 29));
    }


    // -------------------- monthString() Tests --------------------

    @ParameterizedTest(name = "monthString({0}) should return {1}")
    @CsvSource({
            "1, JAN",
            "6, JUN",
            "12, DEC"
    })
    @DisplayName("monthString() should return correct abbreviation for valid months")
    void monthString_validMonths_returnAbbreviation(int month, String expected) {
        assertEquals(expected, Date.monthString(month));
    }

    @ParameterizedTest(name = "monthString({0}) should return 'invalid month'")
    @ValueSource(ints = {-1, 0, 13, 20})
    @DisplayName("monthString() should return 'invalid month' for invalid months")
    void monthString_invalidMonths_returnInvalid(int month) {
        assertEquals("invalid month", Date.monthString(month));
    }


    // -------------------- isLeapYear() Tests --------------------

    @ParameterizedTest(name = "isLeapYear({0}) should return true")
    @ValueSource(ints = {2024, 2000, 1600})
    @DisplayName("isLeapYear() should return true for leap years")
    void isLeapYear_validLeapYears_returnTrue(int year) {
        assertTrue(Date.isLeapYear(year));
    }

    @ParameterizedTest(name = "isLeapYear({0}) should return false")
    @ValueSource(ints = {1800, 1900, 2001, 2023})
    @DisplayName("isLeapYear() should return false for non-leap years")
    void isLeapYear_invalidLeapYears_returnFalse(int year) {
        assertFalse(Date.isLeapYear(year));
    }
}
