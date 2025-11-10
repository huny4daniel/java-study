import java.util.Scanner;

class Example1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("문장을 입력하세요");
        String sen1 = scan.nextLine();

        System.out.println("변경할 부분을 입력하세요");
        String sen2 = scan.next();

        System.out.println("변경할 내용을 입력하세요");
        String sen3 = scan.next();

        String finalSen = sen1.replace(sen2, sen3);

        System.out.print("변경된 문장: ");
        System.out.println(finalSen);
    }
}
