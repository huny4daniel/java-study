abstract class Tt {
    abstract void printx(String str) throws Exception;

}

class Tx extends Tt {
    void printx(String str) throws Exception {
        System.out.println(str);
    }
    
}

// 오류 코드
// class ThrowsMain {
//     public static void main(String[] args) {
//         Tt x = new Tx();
//         x.printx("Good");
//     }
// }

class ThrowsMain {
    public static void main(String[] args) {
        Tt x = new Tx();

        try {
            x.printx("Good");
        } 
        catch (Exception e) {
            System.out.println("예외발생");
        }
    }
}