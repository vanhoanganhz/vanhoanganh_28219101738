import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap ki tu de kiem tra so nguyen: ");
        if (scanner.hasNextInt()) {
            int so = scanner.nextInt();
            System.out.println("ky tu vua nhap la so nguyen: " + so);
        } else {
            System.out.println("ky tu vua nhap khong phai la so nguyen");
        }

        scanner.close();
    }
}
