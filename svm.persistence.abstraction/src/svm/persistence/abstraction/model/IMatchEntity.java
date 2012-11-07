package svm.persistence.abstraction.model;


import svm.persistence.hibernate.model.ExternalTeamEntity;
import svm.persistence.hibernate.model.TeamEntity;

import javax.persistence.*;
import java.sql.Timestamp;

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

    IContestEntity getContest();

    void setContest(IContestEntity contest);

    IMatchTypeEntity getMatchType();

    void setMatchType(IMatchTypeEntity matchType);

    @ManyToOne(cascade = CascadeType.DETACH, targetEntity = ExternalTeamEntity.class)
    @JoinColumn(name = "awayExternal")
    IExternalTeamEntity getAwayExternal();

    void setAwayExternal(IExternalTeamEntity awayExternal);

    void setHomeExternal(IExternalTeamEntity homeExternal);

    void setAwayInternal(ITeamEntity awayInternal);

    void setHomeInternal(ITeamEntity homeInternal);

    @ManyToOne(cascade = CascadeType.DETACH, targetEntity = ExternalTeamEntity.class)
    @JoinColumn(name = "homeExternal")
    IExternalTeamEntity getHomeExternal();

    @ManyToOne(cascade = CascadeType.DETACH, targetEntity = TeamEntity.class)
    @JoinColumn(name = "awayInternal")
    ITeamEntity getAwayInternal();

    @ManyToOne(cascade = CascadeType.DETACH, targetEntity = TeamEntity.class)
    @JoinColumn(name = "homeInternal")
    ITeamEntity getHomeInternal();

    @Column(name = "homeResult")
    @Basic
    int getHomeResult();

    @Column(name = "awayResult")
    @Basic
    int getAwayResult();

    void setAwayResult(int awayResult);

    void setHomeResult(int homeResult);
}
