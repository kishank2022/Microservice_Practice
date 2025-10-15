package com.javaInterview.question.coreJava;


public class StringMethod {

	public static void main(String[] args) {
		String s1 = "HeOllo World";
		String s2 = "";
		
		// Basic Methods 
		System.out.println(s1.length()); // 11
		System.out.println(s1.isEmpty()); // false
		System.out.println(s1.isBlank());  // false
		System.out.println(s2.isEmpty()); // true
		System.out.println(s2.isBlank());	// true
		System.out.println(s1.charAt(1));  // e
		
		//  // Substring & slicing
		// Thesubstring begins with the character at the specified index andextends to the end of this string. 
		System.out.println(s1.substring(2)); // llo World
		// Thesubstring begins at the specified beginIndex andextends to the character at index endIndex - 1.
		System.out.println(s1.substring(1, 4)); // ell
		
		// searching 
		// Returns the index within this string of the first occurrence ofthe specified character.
		// if no such character occurs in thisstring, then -1 is returned. 
		System.out.println(s1.indexOf('z'));
		System.out.println(s1.lastIndexOf('o'));  // 8 - last index of the specified character
		System.out.println(s1.contains("World"));  //true
		System.out.println(s1.startsWith("He")); // true
		System.out.println(s1.endsWith("ld")); // true
		
		// Comparison
		System.out.println("hello".equals("Hello")); // false
		System.out.println("hello".equalsIgnoreCase("Hello"));  // true
		System.out.println("hello".compareTo("hellokishan"));  // -6
		
        // Case & trim
		System.out.println(s1.toUpperCase()); // HEOLLO WORLD
		System.out.println(s1.toLowerCase());	// heollo world
		System.out.println("   kishna     ".trim()); 	// kishna
		
		// Replace & regex
		System.out.println(s1.replace('l', 'K')); // HeOKKo WorKd
		System.out.println(s1.replaceAll("World", "Kishan"));  // HeOllo Kishan
		
		// / Split & join
		String s3 = "a,b,c,d,e,"+null+",f,g,h,i,j,k"+null;
		System.out.println(s3);
		String [] parts = s3.split(",");
		System.out.println(parts.length); // 11
		for(String s4: parts) {
			System.out.print(s4+" ");  //	 a b c d e f g h i j k
		}
		System.out.println();
		System.out.println(String.join("|", parts)); // a|b|c|d|e|null|f|g|h|i|j|knull
		// when we use join if the element's in parts is null then will append the null as it is  
		
		// when we use join, and in join if we use null, then it will throw NullPointerException
		//System.out.println(String.join(null, parts));  //	a|b|c|d|e|f|g|h|i|j|k
		
		
		
		// 	// Conversions 
		char [] charArray = s1.toCharArray(); // Converts this string to a new character array.
		System.out.println(charArray);  // HeOllo World
		int n1 = 123;
		boolean b1 = false;
		// Returns the string representation of the argument passed to valueOf() method.
		System.out.println(String.valueOf(b1)); // 123
        System.out.println(String.format("Name: %s, Age: %d", "Kishan", 28)); // Name: Kishan, Age: 28

        // // intern() and == vs equals
        String s4 = "abc";
        String s6 = "abc";
        String s5 = new String("abc");
        System.out.println(s4 == s5); // false // == is used to compare the address of the String 
        System.out.println(s4 == s6); // true
        // It follows that for any two strings s and t, s.intern() == t.intern() is true if and only if s.equals(t) is true. 
        System.out.println(s5.intern() == s4); // true
        
        
        
		
		
		
		
	}
	
}
