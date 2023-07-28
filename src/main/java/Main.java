import test.Reservation;
import test.data.Passenger;
import test.data.Ticket;
import test.strategy.impl.EightyDiscountStrategy;
import test.strategy.impl.NoDiscountStrategy;

public class Main {
    public static void main(String[] args) {
        Ticket ticket = new Ticket.Builder()
                .name("Ha Noi - New york")
                .price(1000)
                .build();
        Passenger passenger = new Passenger.Builder()
                .name("Tiger Tran")
                .address("Phao san pa lay")
                .email("tigertran@gmail.com")
                .phone("0123456789")
                .build();
        int quantity = 10;
        Reservation reservation = new Reservation();
        reservation.setTicket(ticket);
        reservation.setPassenger(passenger);
        reservation.setQuantity(quantity);
        reservation.setStrategy(reservation.getQuantity() < 5 ? new NoDiscountStrategy() : new EightyDiscountStrategy());

        System.out.println(reservation.getTotalPrice());
    }
}
