package io.codelex.classesandobjects.practice.videostore;

public class Video {
    private String title;
    private boolean checkedOut;
    private int rating;
    private int howManyRated=1;

    public Video(String title, boolean checkedOut, int rating) {
        this.title = title;
        this.checkedOut = checkedOut;
        this.rating = rating;
    }

    public Video(String title,int rating) {
        this.title = title;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setCheckedOut(){
        this.checkedOut = true;
    }
    public void setCheckedIn(){
        this.checkedOut = false;
    }

    public void setRating(int rating) {
        howManyRated++;
        this.rating = (this.rating+rating)/howManyRated;
    }

    @Override
    public String toString() {
        return
                " { Movie title = " + title  +
                ", Is rented out = " + checkedOut +
                ", Movie rating = " + rating + " (rated by "+howManyRated+" users) }\n";
    }
}
