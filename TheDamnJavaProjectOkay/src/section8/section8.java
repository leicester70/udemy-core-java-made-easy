package section8;

import samplepackagename.StringFormatExamples;

public class section8 {
    public static void main(String[] args) {
        // Pre-Increment & Post-Incremenet
        int x = 5;
        System.out.println(String.format("initial number: 5\npre-Increment: %s\nPost-Increment: %s", ++x, x++));

        // Pre-Decrement & Post-Decrement
        x = 5;
        System.out.println(String.format("initial number: 5\npre-Decrement: %s\npost-decrement: %s", --x, x--));

        // Relational Operators
        System.out.println(String.format("'a'<'A'?\t%s", (int) 'a' < (int) 'A'));
        // System.out.println(String.format("'a'<'A'?\t%s", ((int) 'a' > (int) 'A'));

        // '^' Returns true of Both are unequal
        boolean a = true;
        boolean b = false;
        System.out.println(a ^ b);
    }
}
