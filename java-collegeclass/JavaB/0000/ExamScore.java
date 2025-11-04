import java.util.Scanner;
class ExamScore {
    public static void main(String[] args) {
        String[] section = {"출석", "과제", "퀴즈", "중간고사", "기말고사"};
        double[] percent = {0.20, 0.20, 0.10, 0.20, 0.20};
        int[] score = new int [section.length];
        double totalScore =  0.0;
        String Grade;

        Scanner scoreScan = new Scanner(System.in);
        
        for (int i=0; i<section.length; i++){
            System.out.println(section[i] + " 점수를 입력해주세요:");
            score[i] = scoreScan.nextInt();
            
            totalScore += score[i] * percent[i];
        }

        for (int i=0; i<section.length; i++){
            System.out.println(section[i] + "점수:" + score[i]);
        }

        System.out.println("총점:" + totalScore);

        if (totalScore >= 90) {
            Grade = "A";
        } else if (totalScore >= 80) {
            Grade = "B";
        } else if (totalScore >= 70) {
            Grade = "C";
        } else if (totalScore >= 60) {
            Grade = "D";
        } else {
            Grade = "F";
        }
        
        System.out.println("학점:" + Grade);
        scoreScan.close();

    }
}
