package day13.emp.exec;

import day13.emp.VO.RempVO;
import javax.sound.midi.Soundbank;

public class EmployeeInitTest {

  public static void main(String[] args) {
    RempVO vo = new RempVO("홍길동", 30, "010-1111-1111", "서울시", "20240628", "홍보부", true
    );

    RempVO vo2 = new RempVO("김종민", 35, "010-1111-0111", "성동구", "2024-05-18", "기획부", false);

    System.out.println(vo.toString());
    System.out.println(vo2.toString());
  }


}
