package mandatory.axp.Models.Repositories;

import mandatory.axp.Models.ActivityModel;
import mandatory.axp.Models.BookingModel;
import mandatory.axp.Models.CustomerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookingRepository {

    @Autowired
    private JdbcTemplate jdbc = new JdbcTemplate();

    private String sql;

    public List<BookingModel> getBookings(){
        List<BookingModel> bookings = new ArrayList<>();
        sql= "SELECT * FROM Booking";
        SqlRowSet rs =jdbc.queryForRowSet(sql);

        while (rs.next()) {
            bookings.add(
                    new BookingModel(
                            rs.getInt(1), rs.getInt(5), rs.getInt(6), rs.getDate(2)));
        }
        return bookings;
    }

    public void create(BookingModel bookingModel) {
        sql = "insert into Booking(" +
                "bookingId, bookingDate, numOfParticipants, customerId," +
                "activityId, instructor, notes) " +
                "" +
                "values('" +
                bookingModel.getBookingID() + "', '" +
                bookingModel.getDate() + "', '" +
                1 + "', '" +
                bookingModel.getCustomerID() + "', '" +
                bookingModel.getActivityID() + "', '" +
                "Henning" + "', '" +
                "Det her er en note HAhaa glhf" +  "')";

        jdbc.execute(sql);
    }

//    public void update(ActivityModel activityModel, int id) {
//        sql = "update Activity set name = '" +
//                activityModel.getName() + "', duration = '" +
//                activityModel.getDuration() + "', minAge = '" +
//                activityModel.getMinAge() + "', minHeight = '" +
//                activityModel.getMinHeightCm() + "', price = '" +
//                activityModel.getPrice() +
//                "' where activityId = " + id;
//
//        jdbc.update(sql);
//    }

    public void deleteActivity(int id) {
        sql = "delete from Booking where bookingId = " + id;

        jdbc.update(sql);
    }

    public BookingModel getBookingById(int id) {
        String sqlQuery = "SELECT * FROM Booking WHERE customerId = " + id + ";";
        SqlRowSet rowSet = jdbc.queryForRowSet(sqlQuery);

        rowSet.next();
        return new BookingModel(rowSet.getInt(1), rowSet.getInt(5), rowSet.getInt(6),
                rowSet.getDate(2));
    }
}
