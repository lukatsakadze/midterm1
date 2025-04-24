// File: src/t3/Exhibit.java
package t3;

public class Exhibit {
    private int id;
    private String title;
    private String description;

    public Exhibit(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getDetails() {
        return String.format("Exhibit %d: %s – %s", id, title, description);
    }
}
