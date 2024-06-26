package day11.dao;

import day11.dto.CarVo;

public class CarDAO {


  public void carInsert(CarVo car) {
    //DB연결, insert, SQL 등이 적힘
    System.out.println("car 정보가 DB에 저장되었습니다.");
  }

  public void carSelect(CarVo car) {
    //DB연결, select SQL
    System.out.println("car 정보가 조회되었습니다. 모든 Car객체 조회");
  }

}
