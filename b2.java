import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tháng (1-12): ");

        if (!sc.hasNextInt()) {
            System.out.println("Tháng không hợp lệ");
            return;
        }

        int month = sc.nextInt();

        String monthName;
        String days;

        switch (month) {
            case 1:
                monthName = "Tháng 1";
                days = "31 ngày";
                break;
            case 2:
                monthName = "Tháng 2";
                days = "28 hoặc 29 ngày";
                break;
            case 3:
                monthName = "Tháng 3";
                days = "31 ngày";
                break;
            case 4:
                monthName = "Tháng 4";
                days = "30 ngày";
                break;
            case 5:
                monthName = "Tháng 5";
                days = "31 ngày";
                break;
            case 6:
                monthName = "Tháng 6";
                days = "30 ngày";
                break;
            case 7:
                monthName = "Tháng 7";
                days = "31 ngày";
                break;
            case 8:
                monthName = "Tháng 8";
                days = "31 ngày";
                break;
            case 9:
                monthName = "Tháng 9";
                days = "30 ngày";
                break;
            case 10:
                monthName = "Tháng 10";
                days = "31 ngày";
                break;
            case 11:
                monthName = "Tháng 11";
                days = "30 ngày";
                break;
            case 12:
                monthName = "Tháng 12";
                days = "31 ngày";
                break;
            default:
                System.out.println("Tháng không hợp lệ");
                return;
        }

        System.out.println("Tên tháng: " + monthName);
        System.out.println("Số ngày: " + days);

        sc.close();
    }
}