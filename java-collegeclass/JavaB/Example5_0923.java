import java.util.Scanner;
public class Example5_0923 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("계산하고 싶은 두 정수를 입력하세요:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("계산 기호를 입력하세요 (+, -, *, /, %)");
        String sign = scan.next();
        int result = 0;

        switch (sign) {
            case "+": result = num1 + num2; break;
            case "-": result = num1 - num2; break;
            case "*": result = num1 * num2; break;
            case "/": result = num1 / num2; break;
            case "%": result = num1 % num2; break;
        }

        System.out.println("계산 결과는 " + result + "입니다.");
        
    }
}