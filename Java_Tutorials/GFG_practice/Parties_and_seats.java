import java.util.*;
public class PartiesSeats {
    public static void main(String[] args) {
        int totalSeats = 100;
        int parties = 6;
        System.out.println("Seats per party: " + (totalSeats / parties));
        System.out.println("Remaining seats: " + (totalSeats % parties));
    }
}
