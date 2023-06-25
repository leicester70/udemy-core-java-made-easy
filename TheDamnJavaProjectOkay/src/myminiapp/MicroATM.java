package myminiapp;

import java.util.Scanner;

public class MicroATM {

    public static void main(String[] args) {
        CustomController controller = new CustomController();
        String accessCode = "", pin = "";
        boolean validUser = false;
        try {
            Pair<Boolean, String> isArgsFound = (args.length > 0) ? new Pair<>(true, "args populated")
                    : new Pair<>(false, "args NULL");
            System.out.println(isArgsFound.getValue());
            accessCode = args[0];
            pin = args[1];

        } catch (Exception e) {
            Scanner scanner = new Scanner(System.in);
            System.out.print(
                    "enter access code and pin, delimited by comma ','\nexample: accesscode123,123456\nenter:\t");
            String[] input = scanner.nextLine().split(",");
            try {
                accessCode = input[0];
                pin = input[1];
            } catch (Exception e1) {
                System.out.println("did you deliminate properly?\n[ERROR]\t\n" + e + "\t\n" + e1);
            }
        }
        validUser = ValidateCredentials(accessCode, pin);
    }

}
