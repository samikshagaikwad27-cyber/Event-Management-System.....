import java.util.UUID;
public class Booking {
    private final String id, customerName, eventName, packageName; private final double amount; private BookingStatus status;
    public Booking(String customerName,String eventName,String packageName,double amount){this.id="B"+UUID.randomUUID().toString().substring(0,8).toUpperCase();this.customerName=customerName;this.eventName=eventName;this.packageName=packageName;this.amount=amount;this.status=BookingStatus.CONFIRMED;}
    public String getId(){return id;} public String getCustomerName(){return customerName;} public String getEventName(){return eventName;} public String getPackageName(){return packageName;} public double getAmount(){return amount;} public BookingStatus getStatus(){return status;} public void setStatus(BookingStatus s){status=s;}
    public String toFileLine(){return id+"|"+customerName+"|"+eventName+"|"+packageName+"|"+amount+"|"+status;}
    public String toString(){return "Booking ID: "+id+"\nCustomer: "+customerName+"\nEvent: "+eventName+"\nPackage: "+packageName+"\nAmount: Rs. "+String.format("%.2f",amount)+"\nStatus: "+status;}
}
