package section6;

public class DataTypesInAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte a = -50;
		short b = 150;
		int c = 10000;
		long d = 100000;

		char e = 'A';

		float f = 1.23f;
		double g = 12345.6789;

		byte h = 20;

		// byte result = g + h; // Type mismatch: cannot convert from double to byte

		int result = a + h;

		int result2 = (byte) a + h;
	}

}
