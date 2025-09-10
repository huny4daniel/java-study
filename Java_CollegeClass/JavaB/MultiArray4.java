public class MultiArray4 {
    public static void main(String[] args) {
        int[][][] x = {
            {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
            {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}},
            {{9, 0, 1}, {2, 3, 4}},
            {{1, 2, 3}, {4, 5, 6}, {7}},
        };
        System.out.println(x[2][1][2]);
        System.out.println(x.length);
        System.out.println(x[2].length);
        System.out.println(x[3][2].length);
        
    }
}
