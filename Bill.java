import java.util.UUID;
public class Bill { private final String billId; private final Booking booking; private final double discountPercent,discount,subtotal,tax,total;
    public Bill(Booking booking,double discountPercent){this.billId="INV"+UUID.randomUUID().toString().substring(0,6).toUpperCase();this.booking=booking;this.discountPercent=discountPercent;this.subtotal=booking.getAmount();this.discount=subtotal*discountPercent/100.0;this.tax=(subtotal-discount)*0.0;this.total=subtotal-discount+tax;}
    public double getTotal(){return total;} public String toFileLine(){return billId+"|"+booking.getId()+"|"+subtotal+"|"+discountPercent+"|"+discount+"|"+tax+"|"+total;}
    public String toString(){return "--------------- EVENT BILL ---------------\nBill No.       : "+billId+"\nEvent          : "+booking.getEventName()+"\nPackage        : "+booking.getPackageName()+"\nSubtotal       : Rs. "+String.format("%.2f",subtotal)+"\nDiscount ("+discountPercent+"%) : Rs. "+String.format("%.2f",discount)+"\nTax            : Rs. "+String.format("%.2f",tax)+"\nTOTAL          : Rs. "+String.format("%.2f",total)+"\n-------------------------------------------";}
}
