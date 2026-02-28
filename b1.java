import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương N: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Số nhập vào không hợp lệ");
            return;
        }

        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Số nhập vào không hợp lệ");
            return;
        }

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Tổng các số từ 1 đến " + n + " là: " + sum);

        scanner.close();
    }
}