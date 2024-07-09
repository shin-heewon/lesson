package quiz.objectQuiz;

import java.util.Objects;
import lombok.Data;

@Data
public class Owner {

  String name;
  String cellPhone;

  public Owner(String name, String cellPhone) {
    this.name = name;
    this.cellPhone = cellPhone;
  }

  @Override
  public boolean equals(Object o) {

    if (!(o instanceof Owner owner)) {
      return false;
    }
    return Objects.equals(name, owner.name);
  }

  @Override
  public String toString() {
    return "이름은 " + this.name + "이고, 핸드폰 번호는 " + this.cellPhone + "입니다.";
  }
}
