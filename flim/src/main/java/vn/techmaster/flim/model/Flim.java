package vn.techmaster.flim.model;

public class Flim {
    private String title;
    private String description;
    private String director;
    private int year;
  
    public Flim(){

    }
    public Flim(String title, String description, String director, int year) {
        this.title = title;
        this.description = description;
        this.director = director;
        this.year = year;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    
    @java.lang.Override
    public java.lang.String toString() {
        return "Flim{" + "title='" + title + '\'' + ", description='" + description + '\'' + ", director='" + director
                + '\'' + ", year=" + year + '}';

    
    }   
}
