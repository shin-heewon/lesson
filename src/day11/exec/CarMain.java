package day11.exec;

import day11.dao.CarDAO;
import day11.dto.CarVo;

public class CarMain {

  public static void main(String[] args) {
    //1. 자동차(carVo 타입)의 정보를 입력받아 자동차volvo 객체를 생성
    CarVo volvo = new CarVo();
    volvo.carName = "hehe";
    volvo.carOwner = "신희원";
    volvo.carPrice = 10000;
    volvo.carSn = 5555;
    volvo.carType = "SUV";
    volvo.carYear = 1;

    //2. 생성된 volvo인스턴스를 데이터베이스에 입력해주세요.(carInsert()실행)
    CarDAO dao = new CarDAO();
    dao.carInsert(volvo);

    //3. 데이터베이스에 저장된 volvo를 조회해주세요(carSelect())
    dao.carSelect(volvo);

  }


}
