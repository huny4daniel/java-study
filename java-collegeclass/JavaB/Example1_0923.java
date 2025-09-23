import java.util.Scanner;
public class Example1_0923 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("정수 하나를 입력하시오: ");
        int num = scan.nextInt();
        String result;

        if(num%2==0){
            result = "3의 배수가 아닌 짝수";

            if (num%3==0) {
                result = "3의 배수이면서 짝수";
            }

        }
        else{
            result = "홀수";
        }
        System.out.println("당신이 입력한 숫자 " + num + "은(는) " + result + "입니다.");

    }
}