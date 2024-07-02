package day14.Inheritance.Task.task3;

public class Video extends Content {

  String genre;

  public Video(String title, String genre) {
    this.setTitle(title);
    this.genre = genre;
  }

  @Override
  public void totalPrice() {
    switch (genre) {
      case "new" -> setPrice(2000);
      case "comic" -> setPrice(1500);
      case "child" -> setPrice(1000);
      default -> setPrice(500);
    }
  }

  @Override
  public void show() {
    System.out.println(getTitle() + "비디오의 가격은 " + getPrice() + "원입니다.");
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }
}
