// File: src/t3/MuseumManagementSystem.java
package t3;

public class MuseumManagementSystem {
    public static void main(String[] args) {
        Museum museum = new Museum(\"National History\", \"City Center\");
        museum.addExhibit(new Exhibit(1, \"Dinosaurs\", \"Fossils of prehistoric creatures\"));
        museum.addExhibit(new Exhibit(2, \"Ancient Art\", \"Artifacts from ancient civilizations\"));

        Visitor visitor = new Visitor(1001, \"Alice Smith\", \"alice@example.com\");
        visitor.register();

        Ticket t1 = new Ticket(501, 1, 15.0);
        t1.issue();
        visitor.addTicket(t1);

        System.out.println(\"Available Exhibits:\");
        for (Exhibit e : museum.listExhibits()) {
            System.out.println(\"  \" + e.getDetails());
        }

        // Demonstrate new Gift Shop feature
        GiftShop shop = new GiftShop();
        shop.addProduct(new Product(301, \"Dinosaur Poster\", 10.0));
        shop.addProduct(new Product(302, \"Ancient Coin Replica\", 25.0));

        System.out.println(\"\\nGift Shop Products:\");
        for (Product p : shop.listProducts()) {
            System.out.println(\"  \" + p.getId() + \": \" + p.getName() + \" ($\" + p.getPrice() + \")\");
        }

        shop.sellProduct(301);  // Selling one item
    }
}
