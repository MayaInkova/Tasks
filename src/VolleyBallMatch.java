public class VolleyBallMatch extends Event {
    protected String firstTeam;
    protected String secondTeam;

    public VolleyBallMatch(String firstTeam, String secondTeam, String place, String date, String startHour,
                           int numberOFTickets, double priceOfTicket) {
        super(place, date, startHour, numberOFTickets, priceOfTicket);
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
    }

    @Override
    public boolean sellTicket(int num) throws Exception {
        if (num > this.numberOfTickets || this.numberOfTickets == 0) {
            throw new Exception(this.firstTeam + " - " + this.secondTeam);
        } else {
            this.numberOfTickets = this.numberOfTickets - num;
            return true;
        }
    }
}
