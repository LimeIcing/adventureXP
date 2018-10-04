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

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public int getActivityID() {
        return activityID;
    }

    public void setActivityID(int activityID) {
        this.activityID = activityID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
