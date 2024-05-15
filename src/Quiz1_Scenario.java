class Product {
    double wCost;
    double bCost;
    double pCost = 0;
    int totalWatchQuantity, totalBookQuantity;

    public void buyProduct(String productName, int productQuantity) {
        if (productName.equals("Watch")) {
            if (productQuantity <= totalWatchQuantity) {
                double totalCost = wCost * productQuantity;
                int available = totalWatchQuantity - productQuantity;
                System.out.println("You have purchased " + productQuantity + " Watches");
                System.out.println("Total cost: " + totalCost + " Tk");
                System.out.println("Available Product: " + available);
                System.out.println();
                totalWatchQuantity -= productQuantity;
            } else {
                System.out.println("Insufficient quantity of watches available.");
            }
        } else if (productName.equals("Book")) {
            if (productQuantity <= totalBookQuantity) {
                double totalCost = bCost * productQuantity;
                int available = totalBookQuantity - productQuantity;
                System.out.println("You have purchased " + productQuantity + " Books");
                System.out.println("Total cost: " + totalCost + " Tk");
                System.out.println("Available Product: " + available);
                System.out.println();
                totalBookQuantity -= productQuantity;
            } else {
                System.out.println("Insufficient quantity of books available.");
            }
        } else {
            System.out.println("Invalid product name.");
        }
    }
}

public class Quiz1_Scenario {
    public static void main(String[] args) {
        Product pr = new Product();
        pr.wCost = 500;
        pr.bCost = 350;
        pr.totalWatchQuantity = 20;
        pr.totalBookQuantity = 30;
        pr.buyProduct("Watch", 4);
        pr.buyProduct("Book", 6);
    }
}
