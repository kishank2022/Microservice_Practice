package com.javaInterview.question.wissen;

import java.util.Arrays;
import java.util.HashMap;

public class Driver {

	public static void main(String[] args) {
//		String outString = sortCharacterOfString("hello");
//		System.out.println("outString:"+outString);
		longestSubstring("eceba", 2);
		
	}
	
	// sort the character of String in java 
	public static String sortCharacterOfString(String s1) {
		String output = "";
		char[] array1 = s1.toCharArray();
		Arrays.sort(array1);
		String ascendingSort = new String(array1);
		System.out.println("ascendingSort:"+ascendingSort);
		StringBuilder sb1 = new StringBuilder(ascendingSort);
		String descendingSort = sb1.reverse().toString();
		System.out.println("descendingSort:"+descendingSort);
		output = ascendingSort+"|"+descendingSort;
		return output;
	}
	
	// Find the length of the longest substring that contains at most k different characters.
	public static void longestSubstring(String input, int length) {
		System.out.println("Input String: "+input);
		System.out.println("Different character length: "+ length);
		HashMap<Character, Integer> map1 = new HashMap<>();
		int left = 0;
		int maxLength = 0;
		for(int right = 0; right<input.length(); right++) {
			char currentChar = input.charAt(right);
			map1.put(currentChar, map1.getOrDefault(currentChar, 0) + 1);
			while(map1.size()> length) {
				char leftChar = input.charAt(left);
                map1.put(leftChar, map1.get(leftChar) - 1);
                if (map1.get(leftChar) == 0) {
                    map1.remove(leftChar);
                }
                left++;
			}
			maxLength = Math.max(maxLength, right - left + 1);
		}
		System.out.println(maxLength);
	}
}
