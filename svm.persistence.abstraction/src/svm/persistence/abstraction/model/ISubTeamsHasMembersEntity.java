package svm.persistence.abstraction.model;

/**
 * ProjectTeam: Team C
 * Date: 25.10.12
 */
public interface ISubTeamsHasMembersEntity extends IEntity {

    ISubTeamEntity getSubTeam();

    void setSubTeam(ISubTeamEntity subTeam);

    IMemberEntity getMember();

    void setMember(IMemberEntity member);

    boolean isConfirmed();

    void setConfirmed(boolean confirmed);

    String getComment();

    void setComment(String comment);

    @Override
    int getId();
}
