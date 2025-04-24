// File: src/t3/Museum.java
package t3;

import java.util.ArrayList;
import java.util.List;

public class Museum {
    private String name;
    private String location;
    private List<Exhibit> exhibits;

    public Museum(String name, String location) {
        this.name = name;
        this.location = location;
        this.exhibits = new ArrayList<>();
    }

    public void addExhibit(Exhibit exhibit) {
        exhibits.add(exhibit);
    }

    public void removeExhibit(int id) {
        exhibits.removeIf(e -> e.getId() == id);
    }

    public List<Exhibit> listExhibits() {
        return new ArrayList<>(exhibits);
    }
}
