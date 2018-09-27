package mandatory.axp.Models.Repositories;

import mandatory.axp.Models.ActivityModel;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ActivityRepository {
    private JdbcTemplate jdbc = new JdbcTemplate();
    private String sql;

    public void getActivities(ActivityModel activityModel){
        List<ActivityModel> activities = new ArrayList<>();
        sql= "SELECT * FROM students";
        SqlRowSet rs =jdbc.queryForRowSet(sql);

        while (rs.next()){
            activities.add(new ActivityModel(rs.getInt(1)));
        }
    }

    public void create(ActivityModel activityModel) {
        sql = "insert into Activity(name, duration, minAge, minHeight, price) values('" +
                activityModel.getName() + "', '" +
                activityModel.getDurationMin() + "', '" +
                activityModel.getMinAge() + "', '" +
                activityModel.getMinHeightCm() + "', '" +
                activityModel.getPrice() +  "')";

        jdbc.update(sql);
    }

    public void update(ActivityModel activityModel, int id) {
        sql = "update Activity set name = '" +
                activityModel.getName() + "', duration = '" +
                activityModel.getDurationMin() + "', minAge = '" +
                activityModel.getMinAge() + "', minHeight = '" +
                activityModel.getMinHeightCm() + "', price = '" +
                activityModel.getPrice() +
                "' where activityId = " + id;

        jdbc.update(sql);
    }


    public void delete(int id) {
        sql = "delete from Activity where activityId = " + id;

        jdbc.update(sql);
    }
}
