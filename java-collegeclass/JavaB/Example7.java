import java.util.Scanner;

class Example7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int time = scan.nextInt();
        int hour = 0, min = 0, sec = 0;
        scan.close();

        hour = time / 3600;
        min = (time % 3600) / 60;
        sec = time % 60;

        System.out.println(hour + "시간" + min + "분" + sec + "초");


    }
}