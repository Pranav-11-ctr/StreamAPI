package streamConcept;

import java.util.List;

public class DistinctinStreamAPI {
    public static void main(String[] args) {
        List<Movie> movieList= List.of(new Movie("a",10),new Movie("a",50),new Movie("r",90),new Movie("n",30),new Movie("f",80));

        movieList.stream()
//                .map(movie-> movie.getTitle())
                .map(Movie::getTitle)
                .distinct()
                .forEach(mov-> System.out.println(mov));
    }
}
