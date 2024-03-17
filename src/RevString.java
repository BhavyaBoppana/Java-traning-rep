import java.util.Scanner;
public class RevString {
    public static String reverseString(String str) {
        String reverse="";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse=reverse+str.charAt(i);
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        String reversedString=reverseString(input);
        System.out.println(reversedString);
    }
}
