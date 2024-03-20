import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = scanner.nextInt();
        int count = 0;
        if(num < 0){
            int temp = num;
            while(temp < 0){
                temp = temp / 10;
                count ++;
            }
        }
        else{
            num = Math.abs(num);
            int temp = num;
            while(temp > 0){
                temp = temp / 10;
                count ++;
            }
        }
        System.out.printf("%d",+count);
    }
}
