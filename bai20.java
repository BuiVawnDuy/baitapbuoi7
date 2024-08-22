import java.util.Scanner;

public class bai20 {
    public static void lietkesnd(int n){
        for(int i = 1 ; i <= n ; i++ ){
            if(n % i == 0) {
                System.out.printf(i + " ");
            }
        }System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n <= 0){
            System.out.println("khong phai so nguyen duong");
        }else {
            lietkesnd(n);
        }
    }

}