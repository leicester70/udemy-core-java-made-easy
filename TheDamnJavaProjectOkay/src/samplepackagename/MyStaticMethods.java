package samplepackagename;

public class MyStaticMethods {

	public static void main(String[] args) {
		System.out.println("\r[main executing]");
		MyStaticMethods.myFirstMethod("tag1");
	}

	static void myFirstMethod(String tag) {
		System.out.println(tag + ":" + "myFirstMethod");
	}
	
	static {
		System.out.println("[Okay, static block executing]");
		System.out.println("Q: \rwhat is the difference declaring static bock vs static void block?\n");
		System.out.println("A: \rThe main difference between a static block and a static method is that a static block is executed only once when the class is loaded into memory, while a static method can be called multiple times throughout the lifetime of a program. Both static blocks and static methods can access and modify static variables, but static methods cannot access non-static variables or methods directly.\r\n"
				+ "\r\n"
				+ "A static block is useful for initializing static variables, especially when the initialization requires complex logic or exception handling. Static blocks are executed in the order they appear in the code, and they can be used for one-time setup tasks, such as loading configuration data or initializing resources. However, static blocks cannot be called directly, and they are executed automatically when the class is loaded. Here is an example of a static block in Java:");
		System.out.println("[executing myFirstMethod() in a static block]");
		MyStaticMethods.myFirstMethod("tag2");
	}

}
