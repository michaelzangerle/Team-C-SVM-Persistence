package svm.persistence.abstraction.model;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public interface IContestsHasExternalTeamsEntity extends IEntity {

    IContestEntity getContest();

    void setContest(IContestEntity contest);

    IExternalTeamEntity getExternalTeam();

    void setExternalTeam(IExternalTeamEntity externalTeam);

    float getPaid();

    void setPaid(float paid);

    Integer getId();
}
