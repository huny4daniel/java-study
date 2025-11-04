import java.util.Scanner;

interface NewDays {
    String[] DAYS={"N/A", "월요일", "화요일",   "수요일", "목요일", "금요일", "토요일", "일요일"};

}

class DaysMain implements NewDays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1~7 중 하나를 입력하세요: ");
        int num = scan.nextInt();
        scan.close();

        System.out.println(DAYS[num]);
    }

}