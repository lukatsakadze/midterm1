// File: src/t3/Ticket.java
package t3;

public class Ticket {
    private int ticketId;
    private int exhibitId;
    private double price;
    private boolean issued;

    public Ticket(int ticketId, int exhibitId, double price) {
        this.ticketId = ticketId;
        this.exhibitId = exhibitId;
        this.price = price;
        this.issued = false;
    }

    public void issue() {
        issued = true;
        System.out.println("Ticket " + ticketId + " issued for exhibit " + exhibitId);
    }

    public boolean isIssued() {
        return issued;
    }
}
