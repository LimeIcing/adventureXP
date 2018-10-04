package mandatory.axp.Models;

import java.util.Date;

public class BookingModel {

    private int bookingID;
    private ActivityModel activity;
    private CustomerModel user;
    private Date date;

    public BookingModel(int bookingID, ActivityModel activity, CustomerModel user, Date date) {

        this.bookingID = bookingID;
        this.activity = activity;
        this.user = user;
        this.date = date;
    }

    //setters
    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public void setActivity(ActivityModel activity) {
        this.activity = activity;
    }

    public void setUser(CustomerModel user) {
        this.user = user;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    //getters
    public int getBookingID() {
        return bookingID;
    }

    public ActivityModel getActivity() {
        return activity;
    }

    public CustomerModel getUser() {
        return user;
    }

    public Date getDate() {
        return date;
    }
}
