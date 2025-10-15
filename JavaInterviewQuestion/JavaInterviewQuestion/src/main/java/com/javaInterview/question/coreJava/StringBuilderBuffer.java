package com.javaInterview.question.coreJava;

public class StringBuilderBuffer {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();
		sb1.append("Hello");
		sb1.append(" World");
		System.out.println(sb1.toString());
		sb1.insert(5, " kishan");  	// Hello kishan World
		sb1.delete(2, 7);  // Heorld
		sb1.reverse();  // dlroW olleH		
		System.out.println(sb1.toString()); 
		
		
		StringBuffer sb3 = new StringBuffer();
		sb3.append("Hello");
		sb3.append(" World");
		System.out.println(sb3.toString()); // Hello World
		/* replace( start, end, newString) // 
		 StringIndexOutOfBoundsException - if start is negative, greater than length(), or greater than end.
		 The substringbegins at the specified start and extends to the characterat index end - 1 or 
		 to the end of thesequence if no such character exists. First thecharacters in the substring
		 are removed and then the specified String is inserted at start.
		
		*/
		sb3.replace(6, 8, "BUSSY"); // Hello BUSSYrld
		System.out.println(sb3.toString()); 
		
		
		// print n Natural No. 
		System.out.println("Print Natural No. from 1 to 100");
		StringBuilder sb2 = new StringBuilder();
		int n = 100; int current = 1;
		buildNumber(sb2, current, n);
		System.out.print(sb2.toString());
	}
	
	// print N natural No. using String Builder in Java 
	public static void buildNumber(StringBuilder sb, int current, int n) {
		if(current > n) {
			return;
		}
		sb.append(current);
		if(current<n) {
			sb.append(" ");
		}
		buildNumber(sb, current + 1, n);
	}
	
	
	
	
}
