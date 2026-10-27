import java.util.UUID;
public class TicketGenerator { public static Ticket generate(Booking b){return new Ticket("T"+UUID.randomUUID().toString().substring(0,8).toUpperCase(),b.getId(),b.getEventName(),b.getCustomerName());} }
