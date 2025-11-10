public class OperatorsExample6 {
    public static void main(String[] args) {
        int[][] x= {
            {1, 3, 5, 7, 9},
            {9, 5, 2},
            {9, 5, 2},
            {9, 5, 2},
            {1, 3, 5, 7, 9},
            {20, 12, 44, 54, 33}
        };
        
        /* x의 1차원 배열의 개수? */
        System.out.println(x.length);
        
        /* x의 마지막 1차원 배열의 값의 개수? */
        int a = x.length;
        System.out.println(x[a-1].length);

        /* x의 마지막 1차원 배열의 마지막 값은? */
        int b = x[a-1].length;
        System.out.println(x[a-1][b-1]);
        
    }
}
