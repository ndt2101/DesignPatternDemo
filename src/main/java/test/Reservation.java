package test;

public class Reservation {
    private IPromoteStrategy strategy;
    private Passenger passenger;
    private Ticket ticket;
    private int quantity;

    public void setStrategy(IPromoteStrategy strategy) {
        this.strategy = strategy;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getTotalPrice() {
        return strategy.calculatePromotedPrice(ticket.getPrice()) * quantity;
    }
}
