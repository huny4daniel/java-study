public class Quiz4 {
    public static void main(String[] args) {
        int a=13, b=4, z;
        z=a++;

        System.out.println("z=" + z);
        System.out.println("++z=" + ++z);
        System.out.println(++b * b--);
        System.out.println("a=" + a + ", b=" + b);
        System.out.println(a/b);
        System.out.println(a%b);
        
        int max = (a > b) ? a : b+a;
        System.out.println("max=" + max);
    }
}
