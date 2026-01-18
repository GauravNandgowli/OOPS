public class Main {
  public static void play(Movie m) {
    m.getMovie();
  }

  public static void main(String[] args) {
    // Movie movie = new Movie("Apocalypto");

    // movie.getMovie();

    // Movie newMovie = new adventure("Jungle");
    // newMovie.getMovie();

    Movie movie = FactoryMovie.createMovie("scifi", "avatar");
    play(movie);
  }
}
