import java.util.Map;

public class TraditionalTimeConverterFinal {

    public static String convertToTraditionalTime(int hour, int minute) {
        // 1. 자시부터 순서대로 전체 배열 생성
        final String[] siNames = {
            "자시", "축시", "인시", "묘시", "진시", "사시",
            "오시", "미시", "신시", "유시", "술시", "해시"
        };
        
        final Map<String, String> gyeongNames = Map.of(
            "자시", "삼경", "축시", "사경", "인시", "오경",
            "술시", "초경", "해시", "이경"
        );

        // 2. 통합 공식으로 '시'의 인덱스와 이름 찾기 (if문 없음)
        int siIndex = (int) Math.floor((hour + 1) / 2.0) % 12;
        String currentSiName = siNames[siIndex];

        // 3. 인덱스로 시작 시간 계산
        int startHour = (siIndex == 0) ? 23 : (siIndex * 2) - 1;

        // 4. 경과 시간 및 '각' 계산 (이전과 동일)
        int effectiveHour = (hour == 0) ? 24 : hour;
        int minutesPassed = (effectiveHour - startHour) * 60 + minute;
        int gakIndex = (int) Math.floor(minutesPassed / 15.0);
        String gakName = (gakIndex == 0) ? "초각" : gakIndex + "각";

        // 5. 결과 조합
        String timeStr = currentSiName + " " + gakName;
        String gyeong = gyeongNames.get(currentSiName);
        
        return (gyeong != null) ? gyeong + " (" + timeStr + ")" : timeStr;
    }

    // --- 테스트를 위한 main 함수 ---
    public static void main(String[] args) {
        System.out.println("13시 21분 -> " + convertToTraditionalTime(13, 21));
        System.out.println("23시 35분 -> " + convertToTraditionalTime(23, 35));
        System.out.println("00시 10분 -> " + convertToTraditionalTime(0, 10));
        System.out.println("15시 00분 -> " + convertToTraditionalTime(15, 0));
    }
}