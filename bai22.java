import java.util.Scanner;

public class bai22 {
    public static int tichsnd(int n){
        int result = 1;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                result *= i;
            }
        }return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n <= 0 ){
            System.out.println("khong phai so nguyen duong");
        }else {
            int result = tichsnd(n);
            System.out.println(result);
        }
    }
}
