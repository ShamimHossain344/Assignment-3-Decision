import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = scanner.nextInt();
        if( n < 0){
            System.out.print("Negative");
        }
        else if(n == 0){
            System.out.print("Zero");
        }
        else{
            System.out.print("Positive");
        }
    }
}
