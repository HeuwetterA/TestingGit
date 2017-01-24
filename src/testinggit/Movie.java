
package testinggit;

/**
 *
 * @author allis
 */
public class Movie {
 
    private String title;
    private String author;
    private int numberPages;

    public Movie(String title, String author, int numberPages) {
        this.title = title;
        this.author = author;
        this.numberPages = numberPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }
    
    
}
