# Lab: Date

## OBJECTIVES
- Implement conditional statements to validate dates.
- Use methods to modularize the program.

## **Program Description**
[ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) is an international standard covering the worldwide exchange and communication of date and time-related data. The standard uses the [Gregorian calendar](https://en.wikipedia.org/wiki/Gregorian_calendar). Calendar date representations are in the form YYYY-MM-DD (or YYYYMMDD). For example, the US Declaration of Independence was adopted on 1776-07-04, according to the standard. _Note the dates are zero-padded_.

In this project you will write a utility class that validates and processes calendar dates in accordance to the ISO 8601 standard. In addition, a tester class will be created to verify your methods funcion correctly. A date is considered valid if:
- The month is between 1 and 12
- The day is valid for the given month and year, taking into account leap years

The valid day ranges for each month are:
- 31 days January, March, May, July, August, October, December.
- 30 days April, June, September, November.
- 28 or 29 days February (29 if it is a leap year, otherwise 28).

## Program Specifications
Create a class called `Date` with the following parts:

### Part I: Implement Date Validation
Write a method with the header:
   ```java
   public static boolean isValid(int year, int month, int day)
   ```
- The method should return `true` if the given date is valid according to the rules stated above and `false` otherwise.

### Part II: Format Valid Dates
Write a method with the header:
   ```java
   public static String toString(int year, int month, int day)
   ```
- If the date is valid, return a formatted string in the **YYYY-MM-DD** format, ensuring **zero-padding** where necessary (e.g., `1776-07-04`).
- If the date is invalid, return the string `"invalid"`.

### Part III: Convert Month to String
Write a method with the header:
   ```java
   public static String monthString(int month)
   ```
- Return the three-letter abbreviation of the month (e.g., `JAN`, `FEB`).
- If the input is invalid, return `"invalid month"`.  

## Part IV: Testing the Date Class

To ensure your `Date` class functions correctly, you must write a comprehensive tester class. Declare a class named `DateTest` with the following features:
- Test multiple test cases, including boundary values (e.g., leap years, February 29, invalid months, and negative years).
- Call each method in the `Date` class and verify that the output matches expected results.
- Print clear messages indicating whether each test case passes or fails.

## **SAMPLE TEST**  
```java
System.out.println(isLeapYear(2000) == true);
System.out.println(isLeapYear(1900) == false);
```

## **CODING STANDARDS**
- Adhere to the program specifications.
- Adhere to naming conventions for identifiers.
- Remove any auto-generated comments.
- Use [JavaDoc](https://en.wikipedia.org/wiki/Javadoc) to document your code.
- Attribute yourself as the **author** using the `@author` tag.
- Output should be user-friendly, easy to read, and understandable.

