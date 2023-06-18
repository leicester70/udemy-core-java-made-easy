package section7;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class commandLineArgs {
    public static void main(String[] args) {
        try {
            System.out.println("Arguements taken in.");
            Pattern digitPattern = Pattern.compile("\\d+");
            ArrayList<Integer> capturedIntValues = new ArrayList<Integer>();
            for (String string : args) {
                boolean containsInt = string.matches(".*\\d+.*");
                if (containsInt) {
                    Matcher matcher = digitPattern.matcher(string);
                    while (matcher.find()) {
                        capturedIntValues.add(Integer.parseInt(matcher.group(0)));
                    }
                } else {
                    System.out.println(string);
                }
            }
            if (!capturedIntValues.isEmpty()) {
                System.out.println(capturedIntValues.toString());
            }
        } catch (Exception e) {
            System.out.println(String.format("[Error]\t" + e));
        } finally {
            System.out.println("END");
        }
    }
}
