import java.util.Scanner;
public class Example2_0923 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자 2개를 입력하시오: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int result;

        if(num1>num2){
            result = num1-num2;
        }
        else{
            result = num2-num1;
        }
        System.out.println("큰 수에서 작은 수를 뺀 값은 " + result + "입니다.");

    }
}