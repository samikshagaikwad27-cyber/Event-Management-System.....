import java.util.*;
public class BookingManager { private final List<Booking> bookings=new ArrayList<>(); public void add(Booking b){bookings.add(b);} public List<Booking> getAll(){return Collections.unmodifiableList(bookings);} public Booking findById(String id){for(Booking b:bookings)if(b.getId().equalsIgnoreCase(id))return b;return null;} }
