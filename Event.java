public class Event {
    private final String id, name, date, venue, category;
    private final double startingPrice;
    public Event(String id, String name, String date, String venue, String category, double startingPrice) {
        this.id=id; this.name=name; this.date=date; this.venue=venue; this.category=category; this.startingPrice=startingPrice;
    }
    public String getId(){return id;} public String getName(){return name;} public String getDate(){return date;}
    public String getVenue(){return venue;} public String getCategory(){return category;} public double getStartingPrice(){return startingPrice;}
    public String toString(){return String.format("%-6s %-20s %-12s %-18s %-15s Rs. %.2f",id,name,date,venue,category,startingPrice);}
}
