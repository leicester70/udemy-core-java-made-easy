package samplepackagename;

public class StringFormatExamples {
	public static void main(String[] args) {
		// Using %d for integers
		int num = 42;
		String formattedString = String.format("The answer is %d", num);
		System.out.println(formattedString); // "The answer is 42"

		// Using %f for floating-point numbers
		double price = 9.99;
		String formattedString2 = String.format("The price is %.2f dollars", price);
		System.out.println(formattedString2); // "The price is 9.99 dollars"

		// Using %s for strings
		String name = "Alice";
		String formattedString3 = String.format("Hello, %s!", name);
		System.out.println(formattedString3); // "Hello, Alice!"

		// Using %c for characters
		char initial = 'J';
		String formattedString4 = String.format("My initial is %c", initial);
		System.out.println(formattedString4); // "My initial is J"

		// Using %b for boolean values
		boolean isTrue = true;
		String formattedString5 = String.format("Is it true? %b", isTrue);
		System.out.println(formattedString5); // "Is it true? true"

		// Using %x or %X for hexadecimal values
		int num2 = 255;
		String formattedString6 = String.format("In hexadecimal, 255 is %x", num2);
		System.out.println(formattedString6); // "In hexadecimal, 255 is ff"
		String uppercaseHex = String.format("In uppercase hexadecimal, 255 is %X", num2);
		System.out.println(uppercaseHex); // "In uppercase hexadecimal, 255 is FF"

		// Using %o for octal values
		int num3 = 8;
		String formattedString7 = String.format("In octal, 8 is %o", num3);
		System.out.println(formattedString7); // "In octal, 8 is 10"

		// Using %e or %E for scientific notation
		double value = 1234567.89;
		String formattedString8 = String.format("The value in scientific notation is %e", value);
		System.out.println(formattedString8); // "The value in scientific notation is 1.234568e+06"

	}
}