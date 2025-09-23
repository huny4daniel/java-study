import java.util.Scanner;
public class Example4_0923 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("계절을 확인하고 싶은 월을 입력하세요");
        int month = scan.nextInt();
        String season;

        if(month > 12){
            season = "정상적이지 않은 월";
        }
        else if (month >= 3 && month <= 5) {
            season = "봄";
        }
        else if (month >= 6 && month <= 8) {
            season = "여름";
        }
        else if (month >= 9 && month <= 11) {
            season = "가을";
        }
        else {
            season = "겨울";
        }
        System.out.println(month + "월은(는) " + season + "입니다.");

    }
}