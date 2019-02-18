package com.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class StringTest {

	public static void stringRotation(String str1, String str2) {
		if (str1.length() == str2.length() && (str1 + str1).indexOf(str2) != -1) {
			System.out.println("Strings are rotation of each other");
		} else {
			System.out.println("Strings are NOT rotation of each other");
		}

	}

	public static void firstLetter(String str) {

		String[] strArr = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for (String word : strArr) {
			System.out.println(word.charAt(0));
			sb.append(word.charAt(0));

		}
		String result = sb.toString();
		System.out.println(result);

	}

	public static void reverse(String str) {

		char[] charArr = str.toCharArray();
		char[] result = new char[charArr.length];
		for (int i = 0; i < charArr.length; i++) {
			result[i] = charArr[charArr.length - i - 1];

		}
		String resultString = new String(result);
		System.out.println(resultString);
	}

	public static void reverseIntArray(int[] intArr) {

		for (int i = 0; i < intArr.length / 2; i++) {
			int temp = intArr[i];
			intArr[i] = intArr[intArr.length - i - 1];
			intArr[intArr.length - i - 1] = temp;
		}
		System.out.println(Arrays.toString(intArr));

	}

	public static void reverseWithoutSpecial(String str) {
		char[] charArray = str.toCharArray();
		int left = 0, right = charArray.length-1;
		while(left<right){
			if(!Character.isAlphabetic(charArray[left])){
				left++;
			}
			else if(!Character.isAlphabetic(charArray[right])){
				right--;
			}
			else{
				char temp = charArray[left];
				charArray[left] = charArray[right];
				charArray[right] = temp;
				left++;
				right--;
			}
		}
		String rev = new String(charArray);
		System.out.println(rev);


	}

	public static int fibo(int num) {
		if (num == 1 || num == 2) {
			return 1;
		}

		return fibo(num - 1) + fibo(num - 2);
	}

	public static String reverseString(String str) {
		if (null == str || str.length() <= 1) {
			return str;
		}

		return reverseString(str.substring(1)) + str.charAt(0);

	}

	public static void duplicate(String str) {
		char[] charArr = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		boolean dup = false;
		int count = 0;
		for (int i = 0; i < charArr.length; i++) {
			if (map.containsKey(charArr[i])) {
				count = map.get(charArr[i]);
				map.put(charArr[i], count + 1);

			} else {
				map.put(charArr[i], 1);
			}
		}
		System.out.println(map);
		for (Map.Entry<Character, Integer> c : map.entrySet()) {
			if (c.getValue() > 1) {
				System.out.println(c.getKey());
			}

		}

	}

	public static void anagram(String word1, String word2) {

		char[] charArr1 = word1.replaceAll("[\\s]", "").toCharArray();
		char[] charArr2 = word2.replaceAll("[\\s]", "").toCharArray();
		Arrays.sort(charArr1);
		Arrays.sort(charArr2);
		Arrays.equals(charArr1, charArr2);

	}

	public static void amstrong(int num) {
		int r = 0,s = 0;
		int temp = num;
		while(num!=0) {
			r = num % 10;
			s = s + (r * r * r);
			num = num/10;
			
		}
		if(temp==s) {
			System.out.println(temp+" is Amstrong Number");
		}
		else {
			System.out.println(temp+" is NOT Amstrong Number");
		}

	}
	public static void sumOfDigits(int num) {
		int r = 0, sum = 0;
		while(num!=0) {
			r = num % 10;
			sum += r;
			num = num/10;
			
		}
		System.out.println(sum);
	}
	
	public static void secondLargest(int[] intArr) {
		 int first,second;
		 first =  second = Integer.MIN_VALUE;
		for (int i = 0; i < intArr.length; i++) {
			if(intArr[i]>first) {
				
				second = first;
				first = intArr[i];
			}
			else if(intArr[i]>second && intArr[i]!=first) {
				second = intArr[i];
				
			}
			
		}
		System.out.println(second+" is the second largest number");
		
		
	}
	
	public static void getLastN(int number, int n) {
		char c = Integer.toString(n).charAt(0);
		for (int i = number; i > 0; i--) {
			if(Integer.toString(i).indexOf(c)==-1) {
				System.out.println(i);
				break;
			}
		}
		
		
	}
	
	public static void reverseWord(String str) {
		
		String[] strArr = str.split(" ");
		String reverseString = "";
		for (String word : strArr) {
			String reverseWord = "";
			for (int i = word.length()-1; i>=0; i--) {
				reverseWord = reverseWord + word.charAt(i);
				
			}
			reverseString = reverseString + reverseWord + " ";
			
		}
		System.out.println(reverseString);
		
	}
	
	public static void repeatedAndNonrepeatedChar(String str) {
		
		char[] charArr = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		int count = 0;
		for (char c : charArr) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
				
			}
		}
		System.out.println(map);
		// Non repeating
		for (char c : charArr) {
			if(map.get(c)==1) {
				System.out.println(c);
				break;
			}
			
		}
		
	}
	
	public static void deleteRecurringChar(String word) {
		
		Set<Character> set = new HashSet<>();
		String result = "";
		char[] charArr = word.toCharArray();
		for (int i = 0; i < charArr.length; i++) {
			if(!set.contains(charArr[i])) {
				set.add(charArr[i]);
				result += charArr[i]; 
				
			}
		}
		
		System.out.println(result);
	}

	public static void string(String string){

		String s = "";

		for(int i=0;i<string.length();i++){
			s = string.substring(i,i+1);
			System.out.println(s);
		}

	}
	
	public static void main(String[] args) {
		string("vijay");
		String str = "Ab,c,de!$";
		String str2 = "vijayy";
		// System.out.println(reverseString(str2));
		//reverseWithoutSpecial(str);
		int f = fibo(10);
		int[] intArr = { 1, 3, 2, 4, 15, 6 };
		// reverseIntArray(intArr);
		String sentence = "we are the";
		// reverse(str);
		 firstLetter(sentence);
		// stringRotation("ABCD","CDAB");
		//duplicate(str2);
		//amstrong(120);
		//sumOfDigits(555);
		//secondLargest(intArr);
		//getLastN(123,2);
		//repeatedAndNonrepeatedChar("vijayv");
		String s1="vijay",s2="nagaraj";
		 s1 = s1 + s2;
         
	        s2 = s1.substring(0, s1.length()-s2.length());
	         
	        s1 = s1.substring(s2.length());
	         
	        //Swapping ends
	         
	        System.out.println("After Swapping :");
	         
	        System.out.println("s1 : "+s1);
	         
	        System.out.println("s2 : "+s2);
	        deleteRecurringChar("aabbcc");
		
	}

}
