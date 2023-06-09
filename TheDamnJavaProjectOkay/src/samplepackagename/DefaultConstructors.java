package samplepackagename;

public class DefaultConstructors {
	
	static DefaultConstructors directStaticReferenceObject = new DefaultConstructors();
	static DefaultConstructors directStaticReferenceObject1 = new DefaultConstructors();

	int num = 123;

	{
		System.out.println("[START BLOCK - NON-STATIC BLOCK]");
		// This is the NON-STATIC BLOCK, which is part of this class.
		System.out.println(String.format("[PRINTING FROM STATIC BLOCK] GETTING CONSTRUCOTRS OF [%s] : [%s]",
				this.getClass().getName(), this.getClass().getConstructors()));
		System.out.println("[END BLOCK - NON-STATIC BLOCK]\r");

	}

	public static void main(String[] args) {
		System.out.println("[START - main()]");
		System.out.println("DIRECTLY REFERENCED STATIC OBJECT - OBJECT:" + directStaticReferenceObject + ", this.num:"
				+ directStaticReferenceObject.num);
		System.out.println("DIRECTLY REFERENCED STATIC OBJECT - OBJECT:" + directStaticReferenceObject1 + ",this.num:"
				+ directStaticReferenceObject.num);
		new DefaultConstructors();
		new DefaultConstructors();

		// Object Reference
		DefaultConstructors dc = new DefaultConstructors();
		dc.num = 987;
		System.out.println(String.format("OBJECT:%s, num:%s", dc, dc.num));
		ObjectReferenceFromStaticMethod();
		System.out.println("[END BLOCK]\r");

	}

	static {
		// This will execute first, all static execute first
		System.out.println("[START BLOCK - STATIC BLOCK]");
		DefaultConstructors staticBlockConstructor = new DefaultConstructors();
		System.out.println("Object References in Static Blocks, OBJECT:" + staticBlockConstructor);
		System.out.println("[END BLOCK]\r");

	}

	static void ObjectReferenceFromStaticMethod() {
		System.out.println("[START BLOCK - STATIC METHOD BLOCK]");
		DefaultConstructors referenceFromStaticMethod = new DefaultConstructors();
		System.out.println("Object References in Static METHOD Blocks, OBJECT:" + referenceFromStaticMethod);
		System.out.println("[END BLOCK]\r");
	}
}
