package streamConcept;

import java.util.Comparator;
import java.util.List;

public class SortingInStreamAPI {
    public static void main(String[] args) {
       List<Movie> movieList= List.of(new Movie("a",10),new Movie("c",50),new Movie("r",90),new Movie("n",30),new Movie("f",80));

//       movieList.stream().sorted().forEach(ele-> System.out.println(ele.getTitle()+" "+ele.getLikes()));

//       movieList.stream().sorted((a,b)->a.getTitle().compareTo(b.getTitle())).forEach(ele-> System.out.println(ele.getTitle()+" "+ele.getLikes()));
//
//        movieList.stream().sorted((a,b)->a.getTitle().compareTo(b.getTitle())).forEach(ele-> System.out.println(ele.getTitle()+" "+ele.getLikes()));

//        movieList.stream().sorted(Comparator.comparing(a->a.getLikes())).forEach(ob-> System.out.println(ob.getTitle()+" "+ob.getLikes()));

        movieList.stream().sorted(Comparator.comparing(a->a.getLikes(),Comparator.reverseOrder())).forEach(ob-> System.out.println(ob.getTitle()+" "+ob.getLikes()));



    }
}
