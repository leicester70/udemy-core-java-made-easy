package samplepackagename;

public class DefaultConstructors {

	int num = 123;

	{
		//	This is the NON-STATIC BLOCK, which is part of this class.	
		System.out.println(String.format("[PRINTING FROM STATIC BLOCK] GETTING CONSTRUCOTRS OF [%s] : [%s]",this.getClass().getName(),this.getClass().getConstructors()));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[END] - main()");
		new DefaultConstructors();
		new DefaultConstructors();
		new DefaultConstructors();
		System.out.println("[START - main()]");

	}

	static {
		//	This will execute first, all static execute first
		System.out.println("[PRINTING FROM STATIC BLOCK]");
	}
}
