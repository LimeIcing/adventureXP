package mandatory.axp.Models.Repositories;

import mandatory.axp.Models.ActivityModel;
import mandatory.axp.Models.BookingModel;
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

//    public List<BookingModel> getBookings(){
//        List<BookingModel> bookings = new ArrayList<>();
//        sql= "SELECT * FROM Booking";
//        SqlRowSet rs =jdbc.queryForRowSet(sql);
//
//        while (rs.next()) {
//            bookings.add(new Booking(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getInt(5),rs.getDouble(6)));
//        }
//        return activities;
//    }

//    public void create(BookingModel bookingModel) {
//        sql = "insert into Booking(" +
//                "bookingId, bookingDate, duration, numOfParticipants, customerId," +
//                ") values('" +
////                bookingModel.getBookingID() + "', '" +
////                bookingModel.getActivity().getDuration() + "', '" +
////                bookingModel.getMinAge() + "', '" +
////                bookingModel.getMinHeightCm() + "', '" +
////                bookingModel.getPrice() +  "')";
//
//        jdbc.execute(sql);
//    }

    public void update(ActivityModel activityModel, int id) {
        sql = "update Activity set name = '" +
                activityModel.getName() + "', duration = '" +
                activityModel.getDuration() + "', minAge = '" +
                activityModel.getMinAge() + "', minHeight = '" +
                activityModel.getMinHeightCm() + "', price = '" +
                activityModel.getPrice() +
                "' where activityId = " + id;

        jdbc.update(sql);
    }

    public void deleteActivity(int id) {
        sql = "delete from Activity where activityId = " + id;

        jdbc.update(sql);
    }

    public ActivityModel getSpecificActivityModelBasedOnId(int id) {
        String sqlQuery = "SELECT * FROM Activity WHERE activityId = " + id + ";";
        SqlRowSet rowSet = jdbc.queryForRowSet(sqlQuery);

        rowSet.next();
        ActivityModel activityModel = new ActivityModel(rowSet.getInt(1), rowSet.getString(2), rowSet.getInt(3),
                rowSet.getInt(4), rowSet.getInt(5), rowSet.getFloat(6));
        return activityModel;
    }
}
