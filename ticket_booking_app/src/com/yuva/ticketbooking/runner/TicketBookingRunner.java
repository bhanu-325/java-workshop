package com.yuva.ticketbooking.runner;
import com.yuva.ticketbooking.things.TicketBookingDetails;
public class TicketBookingRunner {
    public static void main(String[] args) {
        TicketBookingDetails bookingDetails = new TicketBookingDetails();
        bookingDetails.name="bhanu";
        bookingDetails.contactNumber=6360244645L;
        bookingDetails.email="bhanu@gmail.com";
        bookingDetails.ticketPrice=150;
        bookingDetails.numberOfseats=49;
        System.out.println("name is:"+bookingDetails.name);
        System.out.println("contactnumber is:"+bookingDetails.contactNumber);
        System.out.println("email is:"+bookingDetails.email);
        System.out.println("ticketPrice is:"+bookingDetails.ticketPrice);
        System.out.println("numberOfseats:"+bookingDetails.numberOfseats);
    }
}
