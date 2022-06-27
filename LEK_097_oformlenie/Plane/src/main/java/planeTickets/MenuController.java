package planeTickets;


import javax.swing.*;
import java.util.Scanner;

public class MenuController {
    Seatbooking seatbooking  = new Seatbooking (new Seat(), new Passenger());

    public void start(){
        JOptionPane.showMessageDialog(null, "Welcome to seat reservation system!");
        seatbooking.getSeat().loadSeats()
        chooseOption();

    }

    public void chooseOption(){
        System.out.println("" +
                "1. See all available seats" +
                "2. Select a seat automatically" +
                "3. Choose a seat"

        );
        Scanner scan = new Scanner (System.in);

        String (input){
            switch(input){
                case "1":
                    seatBooking.getSeat().seeAllSeats();
                    break;
                case "2":
                    InputPassengerData();
                    break;
                case "3":
                    chooseSeat();
                    break;
                case "4":
                    System.out.println(0);
                default:
                    System.out.println("Choose ");

            }
        }
        private void inputPassengerData(){
            Passenger passenger = new Passenger();
            passenger.setName(JOptionPane.showInputDialog(null, "Enter passenger name"));
            passenger.setTicketType(JOptionPane.showInputDialog(null, "Enter ticket class"));
            seatBooking.automaticSeat(passenger)

        }
        private void chooseSeat(){
            Passenger passenger = new Passenger();
            passenger.setName(JOptionPane.showInputDialog(null, "Enter passenger name"));
            passenger.setTicketType(JOptionPane.showInputDialog(null, "Enter ticket class"));
            seatbooking.bookTicket(passenger);
        }
    }
}

