package planeTickets;

public class Passenger {

    private String name;
    private String ticketType;
    private Seat seat;

    public Passenger(String name, String ticketType, Seat seat) {
        this.name = name;
        this.ticketType = ticketType;
        this.seat = seat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", ticketType='" + ticketType + '\'' +
                ", seat=" + seat +
                '}';
    }
}