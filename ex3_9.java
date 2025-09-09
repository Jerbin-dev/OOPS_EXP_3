import java.util.Scanner;

public class ex3_9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the paragraph: ");
        String paragraph = scanner.nextLine();
        scanner.close();

        int capitalCount = 0;
        int smallCount = 0;
        StringBuilder capitalLetters = new StringBuilder();
        StringBuilder smallLetters = new StringBuilder();

        for (char ch : paragraph.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                capitalCount++;
                capitalLetters.append(ch).append(", ");
            } else if (Character.isLowerCase(ch)) {
                smallCount++;
                smallLetters.append(ch).append(", ");
            }
        }

        // Remove trailing ", " if letters were found
        if (capitalLetters.length() > 0) {
            capitalLetters.setLength(capitalLetters.length() - 2);
        }
        if (smallLetters.length() > 0) {
            smallLetters.setLength(smallLetters.length() - 2);
        }

        System.out.println("Total Capital Letters: " + capitalCount + " and they are " + capitalLetters.toString());
        System.out.println("Total Small Letters: " + smallCount + " and they are " + smallLetters.toString());
    }
}
