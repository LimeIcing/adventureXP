package mandatory.axp.Models;

import java.util.Date;

public class BookingModel {

    private int bookingID;
    private int activityID;
    private int customerID;
    private Date date;

    public BookingModel(int bookingID, int activityID, int customerID, Date date) {

        this.bookingID = bookingID;
        this.activityID = activityID;
        this.customerID = customerID;
        this.date = date;
    }

    //setters
    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public void setActivityID(int activityID) {
        this.activityID = activityID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    //getters
    public int getBookingID() {
        return bookingID;
    }

    public int getActivityID() {
        return activityID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public Date getDate() {
        return date;
    }
}
