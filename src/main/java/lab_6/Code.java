package lab_6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Code {
  static String vowel = "(\\b[AEYUIO[aeyuio]]\\w*)";

  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    String givenText = sc.nextLine();
    Pattern pattern = Pattern.compile(vowel);
    Matcher matcher = pattern.matcher(givenText);

    String[] arr = givenText.split("\\W+");
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
