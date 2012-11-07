package svm.persistence.abstraction.model;

/**
 * ProjectTeam: Team C
 * Date: 24.10.12
 */
public interface IContestsHasTeamsEntity extends IEntity {

    ITeamEntity getTeam();

    void setTeam(ITeamEntity team);

    IContestEntity getContest();

    void setContest(IContestEntity team);

    boolean isConfirmed();

    void setConfirmed(boolean confirmed);

    String getComment();

    void setComment(String comment);

    boolean isPaid();

    void setPaid(boolean paid);

    @Override
    int getId();
}
