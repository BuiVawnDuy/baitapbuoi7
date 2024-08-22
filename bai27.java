import java.util.Scanner;

public class bai27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if(n % i == 0 && i % 2 == 0) {
                result ++;
            }
        }
        if(n <= 0 ){
            System.out.println("khong phai so nguyen duong ");
        }else {
            System.out.println(result);
        }
    }
}
