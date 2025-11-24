public class SplitMain {
    public static void main(String[] args) {
        String s = " 9,15 ,6 , 7,91,95,10 ";
    
        String[] StringArray = s.replaceAll(" ", "").split(",");
        
        int sum = 0;

        for (int i = 0; i < StringArray.length; i++) {
            sum += Integer.parseInt(StringArray[i].trim());
        }
        
        System.out.println(sum);
    }

}