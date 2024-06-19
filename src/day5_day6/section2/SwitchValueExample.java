package day5_day6.section2;

public class SwitchValueExample {
    public static void main(String[] args) {
        String grade = "B";

        //Java 11 이전 문법




        //Java 12부터 가능 타입변수 score2에 grade값에 따라 처리된 결과값을 할당
        int score2 = switch (grade) {

            case "A" -> 100;
            case "B" -> {
                int result = 100 - 20;//java 13부터 지원
                yield result;
                //yield 키워드를 사용해 블럭이 끝나도 score2에 result가 저장될 수 있도록 함!
                    //yield키워드를 사용하면 반드시 default값 적어줘야함.
            }
            default -> 60;

        };//변수 score2 초기화 끝


        System.out.println("score2의 값 : "+score2);
    }
}