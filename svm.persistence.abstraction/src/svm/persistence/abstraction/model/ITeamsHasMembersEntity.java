package svm.persistence.abstraction.model;

import svm.persistence.abstraction.model.IEntity;
import svm.persistence.abstraction.model.IMemberEntity;
import svm.persistence.abstraction.model.ITeamEntity;

import javax.persistence.Transient;

/**
 * ProjectTeam: Team C
 * Date: 25.10.12
 */
public interface ITeamsHasMembersEntity extends IEntity {
    @Transient
    ITeamEntity getTeam();

    void setTeam(ITeamEntity team);

    @Transient
    IMemberEntity getMember();

    void setMember(IMemberEntity member);

    @Override
    int getId();
}
