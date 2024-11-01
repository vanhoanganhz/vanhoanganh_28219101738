import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap ki tu de kiem tra chuoi: ");
        if (scanner.hasNext()) {
            String input = scanner.next();
            System.out.println("ki tu vua nhap la chuoi: " + input);
        } else {
            System.out.println("ki tu nhap khong phai la chuoi");
        }

        scanner.close();
    }
}
