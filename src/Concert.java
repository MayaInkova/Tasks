public class Concert extends Event {

    protected String starName;

    public Concert(String starName, String place, String date,
                   String startHour, int numberOFTickets, double priceOfTicket) {
        super(place, date, startHour, numberOFTickets, priceOfTicket);
        this.starName = starName;
    }

    @Override
    public boolean sellTicket(int num) throws Exception {
        if (num > this.numberOfTickets || this.numberOfTickets == 0) {
            throw new Exception(this.starName + "'s concert.");
        } else {
            this.numberOfTickets = this.numberOfTickets - num;
            System.out.println(num + " tickets saled!");
            System.out.println("All free tickets are: " + this.numberOfTickets);
            return true;
        }
    }
}

