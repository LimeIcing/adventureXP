package mandatory.axp.Models.Repositories;

import mandatory.axp.Models.ActivityModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ActivityRepository {

    @Autowired
    private JdbcTemplate jdbc = new JdbcTemplate();

    private String sql;

    public List<ActivityModel> getActivities(){
        List<ActivityModel> activities = new ArrayList<>();
        sql= "SELECT * FROM Activity";
        SqlRowSet rs =jdbc.queryForRowSet(sql);

        while (rs.next()) {
            activities.add(new ActivityModel(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getInt(5),rs.getDouble(6)));
        }
        return activities;
    }

    public void create(ActivityModel activityModel) {
        sql = "insert into Activity(name, duration, minAge, minHeight, price) values('" +
                activityModel.getName() + "', '" +
                activityModel.getDuration() + "', '" +
                activityModel.getMinAge() + "', '" +
                activityModel.getMinHeightCm() + "', '" +
                activityModel.getPrice() +  "')";

        jdbc.execute(sql);
    }

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

    public SqlRowSet getSpecificActivityModelBasedOnId(int id)
    {
        String sqlQuery = "SELECT * FROM ACTIVITY as a " +
                "" +
                "" +
                "" + "WHERE activityId = " + id + ";";
    return queryForRowset (sqlQuery);
    }

    private SqlRowSet queryForRowset(String sqlQuery)
    {
        return jdbc.queryForRowSet(sqlQuery);
    }

    public ActivityModel createActivityModelFromRowSet (SqlRowSet rowSet)
    {
        ActivityModel activityModel = new ActivityModel(rowSet.getInt(1), rowSet.getString(2), rowSet.getInt(3),
                rowSet.getInt(4), rowSet.getInt(5), rowSet.getFloat(6));

        return activityModel;
    }

}
