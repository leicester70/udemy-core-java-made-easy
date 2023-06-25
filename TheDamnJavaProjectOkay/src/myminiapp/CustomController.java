package myminiapp;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomController {

    public boolean ValidateCredentials(String accessCode, String sixDigitPin) {
        String regex = "\\b\\d{6}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sixDigitPin);
        if (matcher.find()) {
            System.out.println("Found 6 Digit PIN");
        } else {
            System.out.println("Invalid PIN. PIN is not 6 digits");
        }
        if (isFoundCrendentials(accessCode, sixDigitPin)) {
            return true;
        }
        return false;
    }

    public boolean isFoundCrendentials(String accessCode, String sixDigitPin) {
        ArrayList<Pair<String, String>> accountsArrList = new ArrayList<>();
        accountsArrList.add(new Pair<String, String>("lester123", "123456"));
        accountsArrList.add(new Pair<String, String>("321gwin", "654321"));

        Pair passed = new Pair<String, String>(accessCode, sixDigitPin);
        for (Pair<String, String> pair : accountsArrList) {
            if (pair.getKey().equals(passed.getKey()) && pair.getValue().equals(passed.getValue())) {
                System.out.println("Valid User");
                return true;
            }
        }
        System.out.println("Invalid User");
        return false;
    }
}