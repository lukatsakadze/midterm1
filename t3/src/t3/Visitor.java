// File: src/t3/Visitor.java
package t3;

import java.util.ArrayList;
import java.util.List;

public class Visitor {
    private int id;
    private String name;
    private String email;
    private List<Ticket> tickets;

    public Visitor(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.tickets = new ArrayList<>();
    }

    public void register() {
        System.out.println("Visitor " + name + " (ID: " + id + ") registered.");
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public List<Ticket> viewTickets() {
        return new ArrayList<>(tickets);
    }
}
