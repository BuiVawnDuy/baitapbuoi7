import java.util.Scanner;

public class bai21 {
    public static int tongsnd(int n){
        int sum = 0;
        for(int i = 1 ; i <= n ; i++){
            if(n % i == 0){
                sum += i;
            }
        }return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n <= 0){
            System.out.println("khong phai so nguyen duong");
        }else {
            int sum = tongsnd(n);
            System.out.println("Tổng tất cả các ước số của " + n + " là: " + sum);
        }
    }
}
