import java.util.Scanner;

public class bai31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        for(int i =2 ; i <= n-1; i++){
            if(n % i == 0){
                result++;
                break;
            }
        }
        if(result == 0){
            System.out.printf("%d la so nguyen to ",n);
        }else {
            System.out.println("khong la so nguyen to ");
        }
    }
}
