package svm.persistence.abstraction.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

/**
 * ProjectTeam: Team C
 * Date: 24.10.12
 */
public interface IMatchEntity extends IEntity {

    int getId();

    String getName();

    void setName(String name);

    Timestamp getStart();

    void setStart(Timestamp start);

    Timestamp getEnd();

    void setEnd(Timestamp end);

    boolean isCanceled();

    void setCanceled(boolean canceled);

    String getRemarks();

    void setRemarks(String remarks);

    String getDescription();

    void setDescription(String description);

    IContactDetailsEntity getContactDetails();

    void setContactDetails(IContactDetailsEntity contactDetails);

    List<IContestantEntity> getContestants();

    void setContestants(List<IContestantEntity> contestants);

    List<IContestEntity> getContests();

    void setContests(List<IContestEntity> contests);

    IMatchTypeEntity getMatchType();

    void setMatchType(IMatchTypeEntity matchType);
}
