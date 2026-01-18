public class Movie {
  private String title;

  public Movie(String title) {
    this.title = title;
  }

  public void getMovie() {
    System.out.println("the movie is " + this.title + "is is from subclass " + this.getClass().getName());
  }
}

class adventure extends Movie {

  public adventure(String title) {
    super(title);
  }

  @Override
  public void getMovie() {
    System.out.println(" this is a adventire movie ");
  }
}

class scifi extends Movie {

  public scifi(String title) {
    super(title);
  }

  @Override
  public void getMovie() {
    System.out.println(" this is a scifi  movie ");
  }
}
