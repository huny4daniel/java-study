import java.util.Scanner;
public class Example3_0923 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("성적을 입력하시오: ");
        int score = scan.nextInt();
        String grade;

        if (score > 100) {
            grade = "정상적이 않은 성적";
        }
        else if (score >= 90) {
            grade = "A";
        }
        else if (score >= 80) {
            grade = "B";
        }
        else if (score >= 70) {
            grade = "C";
        }
        else if (score >= 60) {
            grade = "D";
        }
        else {
            grade = "F";
        }

        System.out.println("당신의 학점은 " + grade + "입니다.");

    }
}