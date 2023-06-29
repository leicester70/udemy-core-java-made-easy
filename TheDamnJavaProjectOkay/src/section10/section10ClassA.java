package section10;

import java.util.Date;

public class section10ClassA {

    protected String getStringDate() {
        Date date = new Date();
        return String.format("%s", date.getTime());
    }

    public static void main(String[] args) {
        String IdentifiyingString = section10ClassA.class.getSimpleName();
        System.out.println(IdentifiyingString);

        // protected can be used within.
        System.out.println(new section10ClassA().getStringDate());
    }

}
