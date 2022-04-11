package com.epam.tasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Strings {

	// четные и нечетные символы разделить по разным строкам
	public static String[] oddEven(String s) {
		
		String evenChars = "";
		String oddChars = "";
		int index = 0;
		String[] arrayString = new String[2];
		
		for (int i = 0; i < s.length(); i++) {
			index = s.charAt(i);
			if (index % 2 == 0) {
				evenChars += (char) index;
			} else {
				oddChars += (char) index;
			}
		}
		arrayString[0] = evenChars;
		arrayString[1] = oddChars;

		return arrayString;
	}

	// количестов цифр в строке
	public static int numberOfNumbers(String s) {
		
		char c;
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if (isDigit(c)) {
				count++;
			}
		}
		
		return count;
	}

	// additional function
	public static boolean isDigit(char c) {

		return Character.isDigit(c);
	}

	// Вводится строка из букв и цифр, построить новую только из цифр
	public static String newStringOfDigits(String s) {
		
		String result = "";
		char c;
		
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if (isDigit(c)) {
				result += c;
			}
		}
		return result;
	}
	// удаление одинаковых символов
	public static String deleteTheSameChars(String str)
    {
		String newString = "";
        	HashMap<Character, Integer> count = new HashMap<>();
     
        	for (int i = 0; i < str.length(); i++) {
            		if (!count.containsKey(str.charAt(i)))
                		count.put(str.charAt(i), 1);
            		else
                		count.put(str.charAt(i),
                          	count.get(str.charAt(i)) + 1);
        	}
 
        	for (Map.Entry mapElement : count.entrySet()) {
            		char key = (char)mapElement.getKey();
            		int value = ((int)mapElement.getValue());
            
			if (value <2)
              			newString+=key;
        	}
        	return newString;
    }
	//Частота встречаемости символа в строке
	public static void countChars(String str)
    {

        HashMap<Character, Integer> count = new HashMap<>();
        /*Store duplicates present
        in the passed string */
        for (int i = 0; i < str.length(); i++) {
            if (!count.containsKey(str.charAt(i)))
                count.put(str.charAt(i), 1);
            else
                count.put(str.charAt(i),
                          count.get(str.charAt(i)) + 1);
        }
 
        /*Print duplicates in sorted order*/
        for (Map.Entry mapElement : count.entrySet()) {
            char key = (char)mapElement.getKey();
            int value = ((int)mapElement.getValue());
 
         System.out.println("The key "+key +": "+value);
      
        }
    }
       //Переворот строки 
    public static void reverseString(String s) {
    	String  nstr="";
        char ch;
       
       
      for (int i=0; i<s.length(); i++)
      {
        ch= s.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
      System.out.println("Reversed word: "+ nstr);
    }
    // Количестов вхождений подстроки в строку
    public static int substring(String s, String target) {
    	
    	String[] newS = s.split(target);
    	
    	return newS.length-1;
    }
    //Вывести слова строки в обратном порядке
    
    public static String reverseWords(String s) {
    	String[] newS = s.split(" ");
    	String result = "";
    	for(int i =newS.length-1;i>=0;i--) {
    		result+=" "+newS[i];
    	}
    	return result;
    }
    //сортировка массива строк по алфавиту
	public static void sortAsc(String[] s ) {
		Arrays.sort(s);
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
	}
	
	//Определить длину самого короткого слова в строке
	
	public static int theShortestWord(String s) {
		int length = 100000;
		String[] str = s.split(" ");
		for(int i=0;i<str.length;i++) {
			if(length>str[i].length()) {
				length = str[i].length();
			}
		}
		return length;
	}
	//подсчет количество слов  в строке
	public static int countNumberOfWords(String s) {
		String[] str = s.split(" ");
		return str.length;
	}
       // добавление пробелов в строку
	public static StringBuffer addSpace(StringBuffer s,int index) {
		
		s.insert(index," ");
		return s;
	}
	//является ли строка палиндромом
	public static boolean isPalindrome(String text) {
	    return text.replaceAll("\\W","")
	               .equalsIgnoreCase(new StringBuilder(text.replaceAll("\\W",""))
	               .reverse().toString());
	}
	// замена подстроки в строке
	public static String replaceSubstring(String s,String oldSub, String newSub) {
		
		return s.replace(oldSub, newSub);
	}
	//Расстояние между подстроками
	public static int distance betweenSubstrings(String s , String firstSub,String secondSub){
		
		if (firstSub .equals( secondSub)){
        		return 0 ;
		}
  
    		String words[] = s.split(" ");
    
    		int min_dist = (words.length) + 1;
  
    		for (int index = 0;index < words.length ; index ++){
  
        		if (words[index] .equals( firstSub)){
            			for (int search = 0;search < words.length; search ++){
                			if (words[search] .equals(secondSub)){
                    				int curr = Math.abs(index - search) - 1;
						if (curr < min_dist){
                        				min_dist = curr ;
						}	
					}
				}
			}
		}
      
    		return min_dist
	}
  
}
