import java.util.Scanner;

public class bai29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 1;
        for (int i = n/ 2; i >= 1; i--) {
            if (n % i == 0 && i % 2 != 0) {
                result = i;
               break;
            }
        }if(n <= 0 ){
            System.out.println("khong phai so nguyen duong ");
        }else {
            System.out.println(result);
        }
    }
    }
