import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Company {
    public static void main(String[] args) {

    }

    private String name;
    private String date;
    private String bulstat;

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getDate() {

        return date;
    }

    public void setDate(String date) {

        this.date = date;
    }

    public String getBulstat() {
        return bulstat;
    }

    public void setBulstat(String bulstat) {
        if (bulstat.length() == 10) {
            this.bulstat = bulstat;
        } else {
            System.out.println("Bulstat must be 10 characters long.");
        }


    }
}
  class  FirmaED extends  Company {
    private  String ownerName;
    private  double initialCapital;
    private double currentCapital;

      public void setOwnerName(String ownerName) {
          this.ownerName = ownerName;
      }

      public double getInitialCapital() {
          return initialCapital;
      }

      public void setInitialCapital(double initialCapital) {
          this.initialCapital = initialCapital;
      }

      public double getCurrentCapital() {
          return currentCapital;
      }

      public void setCurrentCapital(double currentCapital) {
          this.currentCapital = currentCapital;
      }

      public String getOwnerName() {
          return ownerName;
      }

      public  double calculate (){

          LocalDate currentDate = LocalDate.now();
          LocalDate creation = LocalDate.parse(getDate());
          long daysSinceCreation = java.time.temporal.ChronoUnit.DAYS.between(creation, currentDate);
          return getCurrentCapital() - getInitialCapital();
      }
  }



