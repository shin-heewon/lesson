package day11.utill;

import day11.dto.CarVo;

public class CarUtility {/*car의 기능을 모아놓음*/

  public void carPrint(CarVo car) {
    System.out.println(car.carName + "\t" + car.carOwner + "\t" + car.carPrice);
  }

}
