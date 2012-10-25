package svm.persistence.abstraction.model;

import java.sql.Date;
import java.util.List;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public interface IContestEntity extends IEntity {
    int getId();

    String getName();

    void setName(String name);

    Date getStart();

    void setStart(Date start);

    Date getEnd();

    void setEnd(Date end);

    float getFee();

    void setFee(float fee);

    List<IContestsHasTeamsEntity> getTeams();

    void setTeams(List<IContestsHasTeamsEntity> teams);
}
