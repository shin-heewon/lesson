package day18.objectEx;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Address implements Cloneable {


  private int code;
  private String addr;


  @Override
  protected Object clone() throws CloneNotSupportedException {
    return (Address) super.clone();
  }
}
