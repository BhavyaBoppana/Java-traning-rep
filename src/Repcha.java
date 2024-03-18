import java.util.Scanner;
public class Repcha {
    public static void main(String argu[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        char[] carray = str.toCharArray();//method available in the String class in Java, It converts the string into a character array.
        System.out.print("Repetitive Characters in above string are: ");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (carray[i] == carray[j]) {
                    System.out.print(carray[j] + " ");
                    break;
                }
            }
        }
    }
}