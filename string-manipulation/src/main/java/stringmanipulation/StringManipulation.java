package stringmanipulation;

public class StringManipulation {

    public static String toUpperCase(String in) {
        return in.toUpperCase();
    }

    public static String toLowerCase(String in) {
        return in.toLowerCase();
    }

    public static String reverseString(String in) {
        return new StringBuilder(in).reverse().toString();
    }
}