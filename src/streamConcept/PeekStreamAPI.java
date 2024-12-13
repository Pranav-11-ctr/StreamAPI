package streamConcept;

import java.util.List;

//peek is here intermediate operation
//where forEach method is terminal operation
public class PeekStreamAPI {
    public static void main(String[] args) {

        List<Movie> movieList= List.of(new Movie("a",10),new Movie("c",50),new Movie("r",90),new Movie("n",30),new Movie("f",80));

        movieList.stream()
                .filter(m->m.getLikes()>10)
                .peek(mov-> System.out.println("filtered "+mov.getTitle()))
                .map(Movie::getTitle)
                .peek(str-> System.out.println("After map "+str))
                .forEach(str-> System.out.println(str));
    }
}
