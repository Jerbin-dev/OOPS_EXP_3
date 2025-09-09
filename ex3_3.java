import java.util.Scanner;

public class ex3_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word or phrase: ");
        String input = sc.nextLine();

        if (hasUniqueCharacters(input)) {
            System.out.println("PERFECT");
            System.out.println("[Reason: \"" + input + "\" does not have any character repeating]");
        } else {
            System.out.println("NOT PERFECT");
            System.out.println("[Reason: \"" + input + "\" has repeating characters]");
        }
        sc.close();
    }

    public static boolean hasUniqueCharacters(String str) {
        str = str.toLowerCase().replaceAll("\\s+", ""); // ignore case and spaces
        boolean[] charSet = new boolean[256]; // ASCII size

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (charSet[ch]) {
                return false;
            }
            charSet[ch] = true;
        }
        return true;
    }
}
