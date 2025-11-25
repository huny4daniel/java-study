import java.io.*;

class Score2 {
    public static void main(String[] args) {
        try {
            FileReader in = new FileReader("Score2.txt");

            int c;
            String s = "";
			while( ( c = in.read() ) != -1 ) {
				s += (char) c;
			}

			in.close();
            
            System.out.println(s);

            String[] x = s.split(":");
            String[] course = x[0].split(",");
            String[] scoreS = x[1].split(",");
            int[] score = new int[course.length];

            int sum = 0, max = 0, maxI = 0;
            for ( int i = 0; i < scoreS.length; i++ ) {
                System.out.println( scoreS[i] );

                score[i] = Integer.parseInt( scoreS[i].trim() );
                sum += score[i];
                max = max > score[i] ? max : score[i];
                maxI = max > score[i] ? maxI : i;
            }

            System.out.println( "합계: " + sum );
            System.out.println( "평균: " + (double) sum / score.length );
            System.out.println("최대점수: " + max);
            System.out.println("최대점수 과목: " + course[maxI]);
        } 
        catch (Exception e) {
            System.out.println( "error" );
        }
    }

}