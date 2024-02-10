package New_folder;

public class java {

  public static String reverseWords(String str) {
    StringBuilder sb = new StringBuilder();
    int start = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == '.') {
        sb.append(str.substring(start, i)).append('.');
        start = i + 1;
      }
    }
    sb.append(str.substring(start));
    return sb.reverse().toString();
  }

  public static void main(String[] args) {
    String str = "world is.my.country";
    String reversedStr = reverseWords(str);
    System.out.println(reversedStr); // Output: country.my.is.world
  }
}
