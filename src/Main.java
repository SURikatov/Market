import main.java.Customer;
import main.java.Market;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        
        Customer customer1 = new Customer("Степан");
        Customer customer2 = new Customer("Фёдор");
        
        market.addToQueue(customer1);
        market.addToQueue(customer2);
        
        market.update();
        market.update();
        market.update();
    }
}