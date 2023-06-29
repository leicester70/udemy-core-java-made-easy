package section10_continued;

import java.util.spi.CalendarDataProvider;

import section10.section10ClassB;
import section10_continued.section10ClassD;

public class section10ClassC extends section10ClassB {
    private static String reminder = "this class extends section10ClassB";

    public static void main(String[] args) {
        System.out.println(reminder);
        System.out.println(new section10ClassC().getSimpleClassName());
        System.out.println(new section10ClassC().abstractString());
        if (new section10ClassC().abstractString().equals("yes this is abstract")) {
            System.out.println("i've extended! sec10classB IN sec10classC");
        }
        System.out.println("trying to get private classD");
        section10ClassD classD = new section10ClassD();
        System.out.println(classD.AddToPrivateData);
    }
}
