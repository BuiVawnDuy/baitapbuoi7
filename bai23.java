import java.util.Scanner;
public class bai23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một số nguyên dương n: ");
        int n = scanner.nextInt();

        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (n <= 0) {
            System.out.printf("khong phai so nguyen duong");
        } else {
            System.out.println("Số lượng ước số của " + n + " là: " + count);
        }
    }
}