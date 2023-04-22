package samplepackagename;

public class MyStaticMethods {

	public static void main(String[] args) {
		MyStaticMethods.myFirstMethod("(Now i add a param called tag (i called this from main() void))");
	}

	static void myFirstMethod(String tag) {
		System.out.println(tag + ":" + "Inside method my first method. It has to be invoked. See line 5");
	}

}
