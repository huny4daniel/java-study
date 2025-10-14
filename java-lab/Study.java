public class Study {
    public static void main(String[] args) {
        int x[][] = {
            {0,1,2,3,4},
            {5,6,7,8,9},
            {11,12} //x[1]
        };

        int a = x.length; //1차원 배열의 개수 3
        a=a-1; //2
        int b = x[a].length; //2
        b=b-1;
        System.out.println(x[a][b]);



    }
}