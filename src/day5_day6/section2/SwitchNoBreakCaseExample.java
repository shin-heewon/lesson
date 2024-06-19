package day5_day6.section2;

public class SwitchNoBreakCaseExample {
    public static void main(String[] args) {

        //Math.random()함수를 이용해서 8시부터 11시 사이의 정수값을 발생시켜
        //int time변수에 할당 후 8이면 출근, 9면 회의, 10이면 업무, 11이면 출장을 나갑니다. 출력
        int time = (int) (Math.random() * 4) + 8;

        switch (time) {

            case 8:
                System.out.println(time + "시에는 출근합니다.");
                break;
            case 9:
                System.out.println(time + "시에는 회의를 합니다.");
                break;
            case 10:
                System.out.println(time + "시에는 업무를 합니다.");
                break;
            default:
                System.out.println(time + "시에는 출장을 나갑니다.");
        }
    }
}
