import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factorial(n));
    }

    private static int factorial(int number) {
        if (number == 1) return 1;
        return number * factorial(number-1);
    }
}