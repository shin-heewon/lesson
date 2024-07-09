package day18.lombokEx;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Setter
@Getter
@ToString//(exclude = "sector")
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"name"}) //of 키워드를 통해서 name값으로 equls 비교함!
//클래스에 대한 equals(), hashcode() 2개의 객체가 존재할 때, 서로 같은 객체인지 판단
//hashcode는 객체가 참조하고 있는 주소값을 비교
@Builder
public class StoreDTO {


  private String name;//가게 이름

  private String storeCode;//가게 업종 코드

  @ToString.Exclude
  private String storeTell;//가게 전화번호
  private String sector;//업종명
  private String storeAddress;


}

