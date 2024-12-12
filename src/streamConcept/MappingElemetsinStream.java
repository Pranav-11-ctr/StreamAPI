package streamConcept;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MappingElemetsinStream {
    public static void main(String[] args) {

//        Movie m1=new Movie("a",10);
//        Movie m2=new Movie("b",20);
//        Movie m3=new Movie("c",30);
//        Movie m4=new Movie("d",40);
//        Movie m5=new Movie("ae",50);
//
//        List<Movie> listOfMovie=new ArrayList<>();
//        listOfMovie.add(m1);
//        listOfMovie.add(m2);
//        listOfMovie.add(m3);
//        listOfMovie.add(m4);
//        listOfMovie.add(m5);
//
//        //Here map method will convert each Movie object stream to movie title stream of string here
//        listOfMovie.stream().map(mov->mov.getTitle())
//                .forEach(str-> System.out.println(str));
//


        //Flat Map:- Flatten the stream object

        List<Integer> listA=new ArrayList<>();
        listA.add(1);
        listA.add(2);
        listA.add(3);

        List<Integer> listB=new ArrayList<>();
        listB.add(4);
        listB.add(5);
        listB.add(6);


        Stream<List<Integer>> listStream = Stream.of(listA, listB);
        listStream.forEach(st-> System.out.println(st));

      //  listStream.flatMap(lst->lst.stream()).forEach(n-> System.out.println(n));
        //The above one will not work because this stream is already used so make a new stream


        Stream<List<Integer>> listStream1 = Stream.of(listA, listB);
        listStream1.flatMap(lst->lst.stream()).forEach(n-> System.out.println(n));



    }
}
