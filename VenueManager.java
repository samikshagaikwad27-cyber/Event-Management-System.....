import java.util.*;
public class VenueManager {
    private static final List<Venue> VENUES=Arrays.asList(new Venue("V01","Celebration Hall","Pune",150,5000),new Venue("V02","Royal Garden","Pune",500,25000),new Venue("V03","College Ground","Pimpri",1000,10000),new Venue("V04","Business Centre","Pune",250,15000));
    public static List<Venue> getVenues(){return VENUES;} public static void displayVenues(){for(Venue v:VENUES)System.out.println(v);}
}
