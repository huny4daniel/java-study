import java.io.*;

class FileMain {
    public static void main(String[] args) {
        try{
			int c, f = 0, k = 0;
			String s = "";

            FileReader in = new FileReader("FileMain.java");
            
			while((c = in.read()) != -1) {
				s += (char) c;
				f = f + 1;

				if((char) c == ' ') {
					k++;
                }
			}

			in.close();

			System.out.println(s);
			System.out.println("문자열 길이: " + f);
			System.out.println("문자열 길이: " + s.length());
			System.out.println("공백의 수: " + k);
			System.out.println("공백 제외 문자열 길이: " + (s.length() - k));
			System.out.println("공백 제외 문자열 길이: " + s.replaceAll(" ","").length());
            System.out.println(s.replaceAll("", "").replaceAll("", ""));
        }
        catch (Exception e) {
            System.out.println("error");
        }
    }

}