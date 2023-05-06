package samplepackagename;

public class ReferenceInStatic {
	
	static ReferenceInStatic obj = new ReferenceInStatic();
	
	static {
		System.out.println(ReferenceInStatic.obj);
		ReferenceInStatic.obj = ReferenceInStatic.init();
	}
	
	public static void main(String[] args) {
		System.out.println(ReferenceInStatic.obj);
	}
	
	static ReferenceInStatic init() {
		return new ReferenceInStatic();
		
	}
}
