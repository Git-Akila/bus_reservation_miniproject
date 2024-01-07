package mini_project;
import java.util.Scanner;
import java.util.ArrayList;

public class BusDemo {
    public static void main(String args[]){
        //ArrayList-collection:
        ArrayList<Bus> buses=new ArrayList<Bus>();
        ArrayList<Booking> booking=new ArrayList<Booking>();
            buses.add(new Bus(1,true,2));
            buses.add(new Bus(2,false,50));
            buses.add(new Bus(3,true,48));
            for(Bus b:buses){
                b.displayBusInfo();
            }
            int user = 1;
            Scanner aki=new Scanner(System.in);

        while (user == 1) {
            System.out.println("Enter 1 to Book and 2 to exit");
            user=aki.nextInt();
            if(user==1){
                Booking booking1=new Booking();
                if(booking1.isAvailable(booking,buses))
                {
                    booking.add(booking1);
                    System.out.println("Yor booking is confirmed");
                }
                else
                {
                    System.out.println("Sorry the Bus is full....Try another Bus");
                                }
            }
        }
    }
}
