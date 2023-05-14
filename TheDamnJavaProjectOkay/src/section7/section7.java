package section7;

public class section7 {

	public static void main(String[] args) {
		section7.PrimitivesAndObjects();
		section7.PrimitiveAndString();
	}

	public static void PrimitiveAndString() {
		//	Byte to String, String to Byte
		byte x = 127;
		String s = Byte.toString(x);
		byte y = Byte.parseByte(s);
		System.out.println(x);
	}
	
	public static void PrimitivesAndObjects() {
		//	Primitive to Object, Object to Primitive
		int x = 100;
		Integer y = Integer.valueOf(x);
		int z = y.intValue();
		System.out.println(z);
	}
	
	public static void AllInOne() {
		int x = 100;
		String y = Integer.toString(x);
		
		Integer b = new Integer(y);
		
		int z = b.intValue();
		
		Integer c = new Integer(z);
		
		String d = c.toString();
		
		int e = Integer.parseInt(d);
	}
}
