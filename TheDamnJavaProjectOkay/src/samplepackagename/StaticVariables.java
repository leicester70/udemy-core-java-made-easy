package samplepackagename;

public class StaticVariables {
	
	static int num = 1;
	static int numWithNoAssignment;
	
	public static void main(String[] args) {
		System.out.println("[num]\r"+StaticVariables.num);
		System.out.println("\r[numWithNoAssignment - it will give a default value of...]\r"+StaticVariables.numWithNoAssignment);

	}
}
