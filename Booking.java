package mini_project;
import java.text.ParseException;
import java.util.*;
//simpleDateFormat for Convert String date to Integer Date value.
import java.text.SimpleDateFormat;

public class Booking {
    String passengerName;
    int busNo;
    Date date;
    //Booking(){} no Parameterized constructor ... but we can declare definition whatever we want.
    Booking(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter name of passenger:");
        passengerName=scanner.next();
        System.out.println("Enter bus no:");
        busNo=scanner.nextInt();
        System.out.println("Enter date dd-mm-yyyy");
        String dateInput=scanner.next();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
        //if have exception we want to fix it by using try catch


        //parsing is to read the value of one object to convert it to another type.
        // parseException it signals that an error has been reached unexpectedly while parsing.
        //This usually happens when a string fails to match a required format or pattern.
        try {
            date=dateFormat.parse(dateInput);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    //isAvailable function take the Reference value.
    //Checking the capacity with bus No
    public boolean isAvailable(ArrayList<Booking> booking, ArrayList<Bus> buses) {
        int capacity = 0;
        for (Bus bus : buses) {
            if (bus.getBusNo() == busNo) {
                capacity = bus.getCapacity();
            }}
        //if Bus No and dates are equal, empty variable Booked will be increased.
            int booked = 0;
            for (Booking b : booking) {
                if (b.busNo == busNo && b.date.equals(date)) {
                    booked++;
                }
            }
            //booked less than capacity
            return booked < capacity ? true : false;
        }
}
