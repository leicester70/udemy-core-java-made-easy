package samplepackagename;

public class NonStaticMembers {

	int numericIdentifier;
	String stringIdentifier;

	public NonStaticMembers(int x, String y) {
		// This is a Constructor of _this class 😀 - Needs to be instantiated in main()
		System.out.println("[Constructor] Objected Instance of this Class: Constructing");
		this.numericIdentifier = x;
		this.stringIdentifier = y;
		System.out.println("[Constructor] Object Instance of _this Class Constructed\r");
	}

	public static void main(String[] args) {
		System.out.println("[Main Method - main(String[] args)]\r");
		// In order to call a method of a Non Static Method, we need to create an
		// Instance, we create an instance with a constructor inside Main
		NonStaticMembers obj1 = new NonStaticMembers(123, "abc");
		NonStaticMembers obj2 = new NonStaticMembers(987, "zyx");
		System.out.println(
				String.format("%s:\r\t%s\r\t%s", obj1.toString(), obj1.numericIdentifier, obj1.stringIdentifier));
		System.out.println(
				String.format("%s:\r\t%s\r\t%s", obj2.toString(), obj2.numericIdentifier, obj2.stringIdentifier));
	}

	{
		// This is a Non-Static Block (no static was declared at the front)
		System.out.println(String.format(
				"[Non-Static Block] - Called because oject of this class has been instantiated\r" + "\t%s\r" + "\t%s\r",
				this.numericIdentifier, this.stringIdentifier));
	}

	static {
		// This is a Static Block - see the difference between the blocks at :11 AND :16
		System.out.println("[Static Block]\r");

	}

	static void method() {
		// Static methods should take priority next I think? Has to be called
		System.out.println("[Static Method]\r");
	}
}
