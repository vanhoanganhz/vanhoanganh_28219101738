import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ten: ");
        String ten = scanner.nextLine();

        System.out.print("Nhap tuoi: ");
        int tuoi = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhap gioi tinh: ");
        String gioiTinh = scanner.nextLine();

        System.out.print("Nhap chuyen nganh: ");
        String chuyenNganh = scanner.nextLine();

        System.out.print("Nhap gpa: ");
        double gpa = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhap que quan: ");
        String queQuan = scanner.nextLine();

        System.out.println("\nThong tin sinh vien:");
        System.out.println("Ten: " + ten);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.println("Chuyen nganh: " + chuyenNganh);
        System.out.println("GPA: " + gpa);
        System.out.println("Que quan: " + queQuan);

        scanner.close();
    }
}
