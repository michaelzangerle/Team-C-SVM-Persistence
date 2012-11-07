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

    List<IContestsHasTeamsEntity> getContestsHasTeams();

    void setContestsHasTeams(List<IContestsHasTeamsEntity> teams);

    IContactDetailsEntity getContactDetails();

    void setContactDetails(IContactDetailsEntity contactDetails);

    List<IContestsHasExternalTeamsEntity> getContestsHasExternalTeams();

    void setContestsHasExternalTeams(List<IContestsHasExternalTeamsEntity> contestsHasExternalTeams);

    void setMatches(List<IMatchEntity> matches);

    List<IMatchEntity> getMatches();
}
