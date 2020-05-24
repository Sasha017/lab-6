package ua.lviv.iot.lab_6;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class CodeTest {
	  static String vowel = "(\\b[AEYUIO[aeyuio]]\\w*)";

	@Test
	public void test() {
	    InputStream in = new ByteArrayInputStream("you need work hard".getBytes());
	    System.setIn(in);
	    Scanner sc = new Scanner(System.in);
	    String givenText = sc.nextLine();
	    Pattern pattern = Pattern.compile(vowel);
	    Matcher matcher = pattern.matcher(givenText);


	    String[] arr = givenText.split("\\W+");
	    Assert.assertNotNull(findLongestWord(arr));
	    System.out.println(matcher.replaceFirst(findLongestWord(arr)));
	  }

	  public static String findLongestWord(String[] arr) {
	    String longestWord = "";
	    for (String str : arr) {
	      if (str.length() > longestWord.length()) {
	        longestWord = str;
	      }
	    }
	    return longestWord;
	}

}
