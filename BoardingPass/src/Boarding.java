import java.time.LocalTime;
import java.util.*;

public class Boarding {

    private int PassportNumber;
    private Date date;
    private String origin;
    private String destination;
    private String departureTime;

    public Boarding(int PassportNumber, Date date, String origin, String destination, String departureTime) {
        this.PassportNumber = PassportNumber;
        this.date = date;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
    }

    public Boarding() {

    }

    public int getPassportNumber() {
        return PassportNumber;
    }

    public void  setPassportNumber(int passportNumber){
        this.PassportNumber = passportNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
}
