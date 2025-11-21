import java.util.Scanner;
import java.io.*;
import java.net.URL;

class CopyMain2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("복사할 원본 파일의 위치를 입력해주세요 (현재 위치:0)");
        System.out.print("원본 파일 위치: ");
        String pa = scan.nextLine();
        System.out.print("\n");

        System.out.println("복사할 원본 파일명을 입력해주세요");
        System.out.print("원본 파일명: ");
        String na = scan.nextLine();
        System.out.print("\n");
        
        System.out.println("복사본을 저장할 위치를 입력해주세요 (기본 위치(resource 폴더): 0)");
        System.out.print("복사본 저장 위치: ");
        String pb = scan.nextLine();
        System.out.print("\n");

        System.out.println("복사본의 파일명을 지정해주세요");
        System.out.print("복사본 파일명: ");
        String nb = scan.nextLine();
        System.out.print("\n");
        System.out.println("------------------------------");
        
        File a, b;

            a = getFromSource(pa, na);
    
            b = saveToDestination(pb, nb);

			String s = "";
            int c;

        try (FileReader in = new FileReader(a)) {
            
			while((c = in.read()) != -1) {
				s += (char) c;
			}
            
            try(FileWriter out = new FileWriter(b)) {
                out.write("***** 복사본 *****\n");
                out.write(s);
            }
            catch(IOException ie) {
                System.out.println("\n파일 처리 오류 발생: 복사본 파일 '" + nb + "'을(를) 확인해 주세요.");
                System.out.println("자세한 오류: " + ie.getMessage());
            }

            System.out.println("\n" + na + "의 복사본 " + nb + "가 생성되었습니다.");
            System.out.println("복사본 위치: " + b);
            System.out.print("\n");
        }
        catch(IOException ie) {
            System.out.println("\n파일 처리 오류 발생: 원본 파일 '" + na + "'을(를) 확인해 주세요.");
            System.out.println("자세한 오류: " + ie.getMessage());
        }
        catch(Exception e) {
            System.out.println("\n알 수 없는 오류 발생");
        }
        finally {
            scan.close();
        }
        
    }

    /**
     * 원본 파일 검색 위치
     * 
     * @param d 디렉토리 명
     * @param f 파일명
     * @return 현재 패키지 폴더에 있는 파일을 자바 실행 bin 폴더에 가지고 가서 거기서 원본 파일을 찾고 반환
     */
    static File getFromSource(String d, String f) {
        File targetFile;
        if(d.equals("0")) {
            URL classUrl = CopyMain2.class.getResource("CopyMain2.class");
            String classPath = classUrl.getPath();

            String directoryPath = new File(classPath).getParent();

            targetFile = new File(directoryPath, f);
        }
        //else if(d.equals("1")) {
        //    targetFile = saveToDestination("0");
        //}
        else {
            targetFile = new File(d + "/" + f);
        }

        return (targetFile);
    }

    /**
     * 복사본 파일 저장할 위치
     * 
     * @param d 디렉토리 명
     * @param f 파일명
     * @return (File) targetFile: 현재 java파일이 속해 있는 프로젝트 최상위 폴더의 위치 반환
     */
    static File saveToDestination(String d, String f) {
        File targetFile;
        if(d.equals("0")) {
            String directoryPath = System.getProperty("user.dir");
            targetFile = new File(directoryPath + "/resource/", f);
            
            if (!targetFile.exists()) {
                targetFile.mkdir();
            }
        }
        else {
            targetFile = new File(d + "/" + f);
        }

        return (targetFile);
    }

}
