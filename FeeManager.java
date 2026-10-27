import java.util.*;
public class FeeManager {
    private static final List<FeeStructure> FEES=Arrays.asList(
        new FeeStructure("Birthday Party",5000,10000,20000),new FeeStructure("Wedding",50000,100000,250000),new FeeStructure("College Fest",15000,30000,60000),new FeeStructure("Corporate Event",25000,50000,100000),new FeeStructure("Music Concert",20000,50000,150000));
    public static List<FeeStructure> getFees(){return FEES;}
    public static void displayFees(){System.out.println("\nEVENT FEE STRUCTURE (sample prices)");System.out.printf("%-20s %12s %12s %12s%n","Event","Basic","Standard","Premium");for(FeeStructure f:FEES)System.out.printf("%-20s Rs.%9.0f Rs.%9.0f Rs.%9.0f%n",f.getEventName(),f.getPrice("Basic"),f.getPrice("Standard"),f.getPrice("Premium"));}
    public static void displayPackages(String event){for(FeeStructure f:FEES)if(f.getEventName().equalsIgnoreCase(event)){System.out.println("Packages for "+f.getEventName()+": Basic Rs."+f.getPrice("Basic")+", Standard Rs."+f.getPrice("Standard")+", Premium Rs."+f.getPrice("Premium"));return;}System.out.println("No fee structure found for that event.");}
    public static double getPrice(String event,String pkg){for(FeeStructure f:FEES)if(f.getEventName().equalsIgnoreCase(event))return f.getPrice(pkg);return -1;}
}
