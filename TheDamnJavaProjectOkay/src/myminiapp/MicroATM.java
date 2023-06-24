package myminiapp;

import java.util.ArrayList;

public class MicroATM {
    static {
        ArrayList<Pair<String, String>> accountsArrList = new ArrayList<>();
        accountsArrList.add(new Pair<String, String>("lester123", "123456"));
    }

    public static void main(String[] args) {
        Pair<Boolean, String> isArgsFound = (args.length > 0) ? new Pair<>(true, "args populated")
                : new Pair<>(false, "args NULL");
        System.out.println(isArgsFound.getValue());
        CustomController controller = new CustomController();
        System.out.println(controller.ValidateCredentials("lestercheong70", "123456"));
    }

}
