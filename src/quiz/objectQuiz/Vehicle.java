package quiz.objectQuiz;

import java.util.Objects;
import lombok.Data;

@Data
public class Vehicle {

  Owner owner;
  int price;

  @Override
  public boolean equals(Object o) {

    if (!(o instanceof Vehicle vehicle)) {
      return false;
    }
    return Objects.equals(owner, vehicle.owner);
  }

  @Override
  public String toString() {
    return "소유주정보 : " + owner.toString() + "\n"
        + "차량정보 : " + price + "입니다.";
  }
}
