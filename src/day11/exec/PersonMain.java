package day11.exec;

import day11.model.Person;
import java.util.Scanner;

public class PersonMain {

  public static void main(String[] args) {
    //1. 홍길동 회원이 가입했습니다. 회원 정보를 입력받아 정보를 저장하고 저장된 정보를 출력하세요.

    /*Person hong = new Person();//day11.model.Person hong = new day11.model.Person() <- 이렇게 안 적어도 인텔리제이가 자동으로 import 해줌.
    hong.name = "홍길동";
    hong.age = 20;
    hong.phone = "010-1111-1111";*/
    Scanner sc = new Scanner(System.in);
    System.out.print("이름 = ");
    String name = sc.nextLine();//엔터 있음, next()는 없음?

    System.out.print("나이 = ");
    int age = sc.nextInt();//버퍼에 \n 남아있음
    sc.nextLine();//버퍼 비움
    /*
     * next와 nextLine 크게 두 종류로 나뉜다.
     * nextInt()는 next에 속하는데 next는 버퍼에 \n 혹은 \t 와 같은 것들이 남아있음.
     * 그래서 next종류 사용 후에는 nextLine()을 통해서 버퍼를 한 번 비워주는 것이다.
     * */

    System.out.print("연락처 = ");
    String phone = sc.nextLine();




    /*System.out.println(hong.toString());
    hong.eat();
    hong.walk();
    hong.play();*/
    personInfoPrint(name, age, phone);

    //2.나주인 회원이 가입했습니다. 회원 정보를 입력받아 정보를 저장하고 저장된 정보를 출력하세요.
    //이름과 전화번호는 필수이므로 초기화하여 객체를 생성하세요. => 생성자 오버로딩해라
    Person na = new Person("나주인", "010-2222-2222");

    na.age = 20;
    na.eat();
    na.walk();
    na.play();

    personInfoPrintObject(na);


  }//end main

  public static void personInfoPrint(String name, int age, String phone) {//매개변수가 100개면 100개 적어줘야함.
    System.out.println("회원의 이름은 : " + name + ", 나이는 : " + age + ", 연락처 : " + phone);
  }

  public static void personInfoPrintObject(Person person) {//간단하게 객체만 넘겨주면 됨!!
    System.out.println(
        "회원의 이름은 : " + person.name + ", 나이는 : " + person.age + ", 연락처 : " + person.phone);
  }

}
