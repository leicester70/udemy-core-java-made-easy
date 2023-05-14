package section6;

public class ExplicitCasting {
	public static void main(String[] args) {
		int i = 100;
		
		// Casting Example, from int to byte.
		byte b = (byte) i;
		
		int x =97;
		char ch = (char) x;
				
		System.out.println(ch);
		
		int y = 130;
		// byte range, -128 to 127
		byte z = (byte)y;
		System.out.println(z);
		
		
		//example 2
		int m = 612;
		byte n = (byte)m;
		System.out.println(n);
	}
}
