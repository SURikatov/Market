package main.java;
import java.util.LinkedList;
import java.util.Queue;

public class Market implements QueueBehaviour, MarketBehaviour {
    private Queue<Customer> queue;

    public Market() {
        this.queue = new LinkedList<>();
    }

    @Override
    public void addToQueue(Customer customer) {
        queue.add(customer);
        System.out.println(customer.getName() + " добавлен в очередь.");
    }

    @Override
    public void removeFromQueue() {
        Customer customer = queue.poll();
        if (customer != null) {
            System.out.println(customer.getName() + " удален из очереди.");
        } else {
            System.out.println("Очередь пуста.");
        }
    }

    @Override
    public void acceptOrder(Customer customer) {
        System.out.println("Заказ принят от " + customer.getName() + ".");
    }

    @Override
    public void releaseOrder(Customer customer) {
        System.out.println("Заказ выдан " + customer.getName() + ".");
    }

    public void update() {
        if (!queue.isEmpty()) {
            Customer customer = queue.peek();
            if (customer != null) {
                acceptOrder(customer);
                releaseOrder(customer);
                removeFromQueue();
            }
        } else {
            System.out.println("Нет клиентов для обновления.");
        }
    }
}