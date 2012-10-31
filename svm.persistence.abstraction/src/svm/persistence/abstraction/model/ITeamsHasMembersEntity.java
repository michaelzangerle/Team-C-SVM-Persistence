package svm.persistence.abstraction.model;

/**
 * ProjectTeam: Team C
 * Date: 25.10.12
 */
public interface ITeamsHasMembersEntity extends IEntity {

    ITeamEntity getTeam();

    void setTeam(ITeamEntity team);

    IMemberEntity getMember();

    void setMember(IMemberEntity member);

    @Override
    Integer getId();
}
