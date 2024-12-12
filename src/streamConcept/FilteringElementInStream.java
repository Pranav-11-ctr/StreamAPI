package streamConcept;

import java.util.ArrayList;
import java.util.List;

public class FilteringElementInStream {

    public static void main(String[] args) {

        Movie m1=new Movie("a",10);
        Movie m2=new Movie("b",20);
        Movie m3=new Movie("c",30);
        Movie m4=new Movie("d",40);
        Movie m5=new Movie("ae",50);

        List<Movie> listOfMovie=new ArrayList<>();
        listOfMovie.add(m1);
        listOfMovie.add(m2);
        listOfMovie.add(m3);
        listOfMovie.add(m4);
        listOfMovie.add(m5);

        listOfMovie.stream().filter(mov->mov.getLikes()>30).filter(mov->mov.getTitle().equals("ae")).forEach(mov-> System.out.println(mov.getTitle()));

    }
}
