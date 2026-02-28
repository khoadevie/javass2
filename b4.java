import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập cạnh a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập cạnh b: ");
        double b = sc.nextDouble();
        System.out.print("Nhập cạnh c: ");
        double c = sc.nextDouble();

        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Ba cạnh không tạo thành tam giác.");
        } else {
            if (a == b && b == c) {
                System.out.println("Tam giác đều");
            } else if (a == b || a == c || b == c) {
                System.out.println("Tam giác cân");
            } else if (a * a + b * b == c * c ||
                       a * a + c * c == b * b ||
                       b * b + c * c == a * a) {
                System.out.println("Tam giác vuông");
            } else {
                System.out.println("Tam giác thường");
            }
        }

        sc.close();
    }
}