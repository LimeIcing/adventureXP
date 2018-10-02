package mandatory.axp.Models;

import java.util.Date;

public class BookingModel {

    private int bookingID;
    private ActivityModel activity;
    private UserModel user;
    private Date date;

    public BookingModel(int bookingID, ActivityModel activity, UserModel user, Date date) {

        this.bookingID = bookingID;
        this.activity = activity;
        this.user = user;
        this.date = date;
    }
}
