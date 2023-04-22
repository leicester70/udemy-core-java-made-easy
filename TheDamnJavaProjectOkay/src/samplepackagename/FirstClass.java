package samplepackagename;

public class FirstClass {
	public static void main(String[] args) {
		System.out.println("WOW I can hit" + "ctrl+spacebar" + " for help! Eclipse is not so lame after all");
	}

	static {
		System.out.println("Static Block 1:  it will execute first");
	}

	static {
		System.out.println("Static block 2: This should come out second I think? I declared it the second block. [Edit 2] I was right -  of course what the fuck, it is top down isn't it? (JVM runs in order)");
	}
}
