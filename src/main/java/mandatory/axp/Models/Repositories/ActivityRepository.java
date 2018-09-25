package mandatory.axp.Models.Repositories;

import mandatory.axp.Models.ActivityModel;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ActivityRepository{

    private JdbcTemplate jdbc = new JdbcTemplate();

    private String sql;

    public void createActivity(ActivityModel activityModel) {
        sql = "";

        
    }


    public void create(ActivityModel activityModel)
    {
        sql = "insert into Activity(name, duration, minAge, minHeight, price) values('" + activityModel.getName() + "'" +
                ", '" + activityModel.getDurationMin() + "' " +
                ", '" + activityModel.getMinAge() + "' " +
                ", '" + activityModel.getMinHeightCm() + "' " +
                ", '" + activityModel.getPrice() +  "')";

        jdbc.update(sql);

    }

    public void update(ActivityModel activityModel, int id)
    {
        sql = "update Activity " +
                "set name = '" +  activityModel.getName() + "', duration = '"
                + activityModel.getDurationMin() + "', minAge = '" + activityModel.getMinAge() + "', minHeight = '"
                + activityModel.getMinHeightCm() + "', price = '" + activityModel.getPrice() + "' where activityId = " + id;

        jdbc.update(sql);
    }


    public void delete(int id)
    {
        sql = "delete from Activity " +
                "where activityId = " + id;

        jdbc.update(sql);
    }
}
