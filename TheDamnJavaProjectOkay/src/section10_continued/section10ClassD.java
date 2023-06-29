package section10_continued;

import section10.section10ClassB;

public class section10ClassD extends section10ClassB {
    private String someprivatedata = "21398ewufjkvsdf";

    public String AddToPrivateData = someprivatedata + "<<< THTA IS THE PRIVATE DATA";

    public static void main(String[] args) {
        section10ClassD classD = new section10ClassD();
        System.out.println("Hello World!" + classD.getSimpleClassName());
        System.out.println(classD.someprivatedata);
    }
}
