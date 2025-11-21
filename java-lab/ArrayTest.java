public class ArrayTest {
    public static void main(String[] args) {
        int arr01[] = {10, 20, 30, 40, 50, 60};
        int arr02[][] = new int[2][3];

        int length_arr02 = arr02.length;
        System.out.printf("length_arr02 = %d\n", length_arr02);
        for (int i = 0; i <= length_arr02 - 1; i++)
        {
            int length = arr02[i].length;
            System.out.printf("length = %d\n", length);
            for (int j = 0; j <= length - 1; j++) 
            {
                System.out.printf("arr[%d][%d] = %d\n", i, j, arr02[i][j]);

            }
        }
    }
}
