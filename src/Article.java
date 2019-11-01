

public class Article extends Materials {

    private String author;
    private int volume;
    private String journalName;
    private String pages;

    // Book full-arg constructor
    Article(String title, String author, int volume, String pages, String journalName) {
        this.title = title;
        this.author = author;
        this.volume = volume;
        this.pages = pages;
        this.journalName = journalName;
    }

    // Getters
    public String getAuthor() {
        return author;
    }

    public int getVolume() {
        return volume;
    }

    public String getJournalName() {
        return journalName;
    }

    public String getPages() {
        return pages;
    }

    public boolean isAvailable(){
        return available;
    }
    
    public void borrow() { 
        available = false;
    }

    public String toString() {
        return "Title: " + getTitle() + "\r\nAuthor: " + getAuthor() + " Journal Name: " + getJournalName() + "\r\nPages: " + getPages() + " Volume " + getVolume();
    }

}
