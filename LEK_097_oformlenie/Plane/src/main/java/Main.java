import planeTickets.Passenger;
import planeTickets.Seat;
import planeTickets.SeatBooking;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    }
}

    SeatBooking seatBooking  = new SeatBooking (new Seat(), new Passenger());

    seat.loadSeats();


    ArrayList<Seat> planeSeats = new ArrayList<>();
    Seat seat1 = new Seat("A1", true, "business");
    Seat seat2 = new Seat("A2", true, "business");
    Seat seat3 = new Seat("A3", false, "business");
    Seat seat4 = new Seat("A4", true, "business");
    Seat seat5 = new Seat("B1", false, "custom");
    Seat seat6 = new Seat("B2", true, "custom");
    Seat seat7 = new Seat("B3", true, "custom");
    Seat seat8 = new Seat("B4", true, "custom");
    Seat seat9 = new Seat("C1", true, "economy");
    Seat seat10 = new Seat("C2", true, "economy");
    Seat seat11 = new Seat("C3", false, "economy");
    Seat seat12 = new Seat("C4", true, "economy");

    planeSeats.add(seat1);