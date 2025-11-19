import java.io.*;

class FileW {
    public static void main(String[] args) {
        try {
            FileWriter out = new FileWriter("out.txt");
            out.write("~~~~~~~~" + "\n");
            out.write("@@@@@@@@");
            out.close();
            
        }
        catch(IOException ie) {
            System.out.println("IO 예외발생");
        }
        catch(Exception e) {
            System.out.println("예외발생");
        }
    }

}