package project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class DateTest {

    // isValid() Tests
    @Test
    void Valid_Date_February_Leap_Year() {
        assertEquals(true, Date.isValid(2024,2,28));
    }

    @Test
    void Invalid_Date_Invalid_Month() {
        assertEquals(false, Date.isValid(2020,0,10));
    }
    @Test
    void Invalid_Date_Invalid_Day() {
        assertEquals(false, Date.isValid(2020,12,32));
    }
    @Test
    void Invalid_Date_Invalid_Month_Day() {
        assertEquals(false, Date.isValid(2020,13,0));
    }


    // toString() Tests
    @Test
    void Valid_Date_To_String() {
        assertEquals("2024-06-24", Date.toString(2024,6,24));
    }

    @Test
    void Invalid_Date_To_String() {
        assertEquals("invalid", Date.toString(2023,2,29));
    }


    // monthString() Tests
    @Test
    void Valid_Month_December() {
        assertEquals(Date.monthString(12), "DEC");
    }

    @Test
    void Invalid_Month() {
        assertEquals(Date.monthString(13), "invalid");
    }


    // isLeapYear Tests
    @Test
    void Leap_Year_2024() {
        assertEquals(true, Date.isLeapYear(2024));
    }

    @Test
    void Leap_Year_2000() {
        assertEquals(true, Date.isLeapYear(2000));
    }

    @Test
    void Invalid_Leap_Year_1800() {
        assertEquals(false, Date.isLeapYear(1800));
    }

    @Test
    void Invalid_Leap_Year_2001() {
        assertEquals(false, Date.isLeapYear(2001));
    }
}