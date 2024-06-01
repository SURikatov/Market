package main.java;
public interface MarketBehaviour {
    void acceptOrder(Customer customer);
    void releaseOrder(Customer customer);
}