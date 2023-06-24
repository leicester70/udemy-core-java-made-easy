package myminiapp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomController {
    // Methods
    public boolean ValidateCredentials(String accessCode, String sixDigitPin) {
        String regex = "\\b\\d{6}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sixDigitPin);
        if (matcher.find()) {
            System.out.println("Found 6 Digit PIN \nEND");
        }
        return false;
    }

    public boolean isFoundCrendentials(String accessCode, String sizDigitString) {
        System.out.println();
        return false;
    }
}