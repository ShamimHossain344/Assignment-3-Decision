import java.util.Scanner;

    public class CompareLetter {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String s = scanner.nextLine();
            if (!s.isEmpty() && s.charAt(0) == s.charAt(s.length() - 1)) {
                System.out.print("First and last letter are the same.");
            } else {
                System.out.print("First and last letter are different.");
            }
        }
    }

