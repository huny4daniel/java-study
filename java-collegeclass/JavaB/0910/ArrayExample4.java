public class ArrayExample4 {
    public static void main(String[] args) {
        int[] x = {1, 3, 5, 7, 19};
        String y ="Quiz";
        System.out.println(x[2]);
        System.out.println(x[3]);
        System.out.println(x[1] + x[2]);
        System.out.println(y + x[1] + x[2]);
        System.out.println(x[1] + x[3] + y + x[1] + x[2]);
        //System.out.println(x[1] + x[3] + y + (x[1] + x[5])); -> x[5] 존재하지 않으므로 오류 발생
    }
}
