import java.io.*;

public class FileSplitMain {
    public static void main(String[] args) {
        try {
            FileReader in = new FileReader("Num.txt");

            String s = "";
			int c;

			while ((c = in.read()) != -1) {
				s += (char) c;
			}

			in.close();
            
            String[] stringArray = s.replaceAll(" ", "").split(",");
            int[] intArray = new int[stringArray.length];

            int max = 0; 
            int min = 1000;
            int sum = 0;
            for (int i = 0; i < stringArray.length; i++) {
                intArray[i] = Integer.parseInt(stringArray[i].trim());
                if (i == 0) {
                    min = max = intArray[i];
                }
                sum += intArray[i];
                max = max > intArray[i] ? max:intArray[i];
                min = min > intArray[i] ? intArray[i]:min;
            }

            System.out.println("숫자의 합: " + sum);
            System.out.println("가장 큰 수: " + max);
            System.out.println("가장 작은 수: " + min);
        }
        catch (Exception e) {
            System.out.println("error");
        }
    }

}
