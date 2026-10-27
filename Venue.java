public class Venue {
    private final String id, name, address; private final int capacity; private final double rentalPrice;
    public Venue(String id,String name,String address,int capacity,double rentalPrice){this.id=id;this.name=name;this.address=address;this.capacity=capacity;this.rentalPrice=rentalPrice;}
    public String getId(){return id;} public String getName(){return name;} public String getAddress(){return address;} public int getCapacity(){return capacity;} public double getRentalPrice(){return rentalPrice;}
    public String toString(){return id+" | "+name+" | Capacity: "+capacity+" | Rental: Rs. "+String.format("%.2f",rentalPrice);}
}
