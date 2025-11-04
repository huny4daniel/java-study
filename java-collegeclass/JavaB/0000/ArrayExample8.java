public class ArrayExample8 {
    public static void main(String[] args) {
        String[][] person = {{"홍길동", "23"}, {"유관순", "34"}, {"이순신", "22"}};
        System.out.print("이름:" + person[0][0] + "\t" + "나이:" + person[0][1] + "\n");
        System.out.print("이름:" + person[1][0] + "\t" + "나이:" + person[1][1] + "\n");
        System.out.print("이름:" + person[2][0] + "\t" + "나이:" + person[2][1] + "\n");
        
        person[0][1] = "20";
        
        System.out.print("인원 수: " + person.length + "명");
    }
}
