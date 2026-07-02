public class Date {

    public static boolean isValid(int year, int month, int day) {
        // Complete this code
    }

    public static String toString(int year, int month, int day) {
        // Complete this code
    }

    public static String monthString(int month) {
        // Complete this code
    }

    /**
     * Determines if the given year is a leap year
     *
     * @param year the given year
     * @return {@code true} if {@code year} is a leap year
     */
    public static boolean isLeapYear(int year) {
        boolean leap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leap = true;
                }
            } else {
                leap = true;
            }
        }
        return leap;
    }
}
