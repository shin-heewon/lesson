package day18.objectEx.objectEqualsHashcode;

import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Member {

  private int memberCode;
  String name;


  @Override
  public boolean equals(Object o) {

    if (o instanceof Member m) {
      if (this.memberCode == m.getMemberCode() && this.name.equals(m.getName())) {
        return true;
      }
    }
    return false;

    /*if(this == o) return true;

    if(!(o instanceof Member)) return false;

    Member m = (Member) o;
    return Object.equals(this.name, m.name);
    */

    /*if (this == o ) {
      return true;
    }
    if (!(o instanceof Member member)) {
      return false;
    }
    if(o instanceof Member target){
      if(o == target.getName() && this.name.equals(target.getName())){
        return true;
      }
    }
    Member m = (Member) o;
    return Objects.equals(this.name, m.name);*/
  }

  @Override
  public int hashCode() {

    int result = this.name.hashCode();
    return result;

  }
}
