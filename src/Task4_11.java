import java.util.Scanner;

public class Task4_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas, input your number: ");
        int number = scanner.nextInt();
        int a = number / 10;
        int b = number % 10;
        int c = a * 10 - b;
        System.out.println(c);
    }
}
