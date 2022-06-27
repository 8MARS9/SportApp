package planeTickets;

import javax.swing.*;

public class SeatBooking {

    public void automaticSeat(Passenger passenger){
        String seatClass = String.valueOf(passenger.getClass());

        Seat seat = new Seat();

        for (Seat x: seat.planeSeats){
            if (x.isFree && x.seatClass.equals(passenger.getTicketType())){
                passenger.setSeat(x);
                System.out.println("Your seat is " + passenger.getSeat());
            }else {
                System.out.println("The is no free seats in " + passenger.getTicketType() + " class!");
            }
        }
    }

    public void bookTicket(Passenger passenger){
        String seatClass = String.valueOf(passenger.getClass());
        String selectedSeat = JOptionPane.showInputDialog(null, "Enter a number od seat you want to book");

        Seat seat = new Seat();
        for (Seat x: seat.planeSeats){
            if(x.getSeatNr().equals(selectedSeat)){
                if (!seat.isFree){
                    System.out.println("Select another seat! " + seat.getSeatNr() + " is already taken!");
                }
                if (!seat.seatClass.equals(passenger.getTicketType())){
                    System.out.println("Choose a seat from" +  passenger.getTicketType() + "class");
                }
                else {
                    passenger.setSeat(seat);
                    System.out.println("Your successfully booked a seat number" + passenger.getSeat());
                }
            } else {
                System.out.println("You've entered wrong seat number!");
            }
        }


    }


}
