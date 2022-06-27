package planeTickets;

import java.util.ArrayList;

public class Seat {
    public String seatNr;
    public boolean isFree;
    public String seatClass;

    public Seat(String seatNr, boolean isFree, String seatClass) {
        this.seatNr = seatNr;
        this.isFree = isFree;
        this.seatClass = seatClass;
    }

    public Seat() {
    }

    public String getSeatNr() {
        return seatNr;
    }

    public void setSeatNr(String seatNr) {
        this.seatNr = seatNr;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public String getSeatClass() {
        return seatClass;
    }

    public void setSeatClass(String seatClass) {
        this.seatClass = seatClass;
    }

    public ArrayList<Seat> getPlaneSeats() {
        return planeSeats;
    }

    public void setPlaneSeats(ArrayList<Seat> planeSeats) {
        this.planeSeats = planeSeats;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "seatNr='" + seatNr + '\'' +
                ", isFree=" + isFree +
                ", seatClass='" + seatClass + '\'' +
                '}';
    }

    public ArrayList<Seat> planeSeats = new ArrayList<>();

    public void loadSeats(){

        Seat seat1 = new Seat("A1", true, "business");
        Seat seat2 = new Seat("A2", true, "business");
        Seat seat3 = new Seat("A3", true, "business");
        Seat seat4 = new Seat("A4", true, "business");
        Seat seat5 = new Seat("B1", true, "economy");
        Seat seat6 = new Seat("B2", true, "economy");
        Seat seat7 = new Seat("B3", true, "economy");
        Seat seat8 = new Seat("B4", true, "economy");

        planeSeats.add(seat1);
        planeSeats.add(seat2);
        planeSeats.add(seat3);
        planeSeats.add(seat4);
        planeSeats.add(seat5);
        planeSeats.add(seat6);
        planeSeats.add(seat7);
        planeSeats.add(seat8);

//        for (Seat x: planeSeats){
//            System.out.println(x);
//        }

    }
    public void seeAllSeats(){
        for (Seat seat.planeSeat){
            System.out.println(seat);
        }
    }



}