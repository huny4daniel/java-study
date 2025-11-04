import java.util.Scanner;
public class Example1_1014 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("뒤집을 글자를 입력하세요");
        String word = scan.next();

        scan.close();
        
        for (int i=word.length()-1; i>=0; i--){
            System.out.print(word.charAt(i));

        }

    }
}