package streamConcept;

public class Movie implements Comparable<Movie>{
    public String title;

    public int likes;

    public Movie(String title, int likes) {
        this.title = title;
        this.likes = likes;
    }

    public String getTitle() {
        return title;
    }

    public int getLikes() {
        return likes;
    }


    @Override
    public int compareTo(Movie o) {
        return this.getLikes()-o.getLikes();
    }
}
