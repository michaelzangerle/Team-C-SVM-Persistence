package svm.persistence.abstraction.model;

import svm.persistence.abstraction.model.IEntity;
import svm.persistence.abstraction.model.IMemberEntity;
import svm.persistence.abstraction.model.ISubTeamEntity;

import javax.persistence.Basic;
import javax.persistence.Transient;

/**
 * ProjectTeam: Team C
 * Date: 25.10.12
 */
public interface ISubTeamsHasMembersEntity extends IEntity {
    @Transient
    ISubTeamEntity getSubTeam();

    void setSubTeam(ISubTeamEntity subTeam);

    @Transient
    IMemberEntity getMember();

    void setMember(IMemberEntity member);

    @javax.persistence.Column(name = "confirmed")
    @Basic
    boolean isConfirmed();

    void setConfirmed(boolean confirmed);

    @javax.persistence.Column(name = "comment")
    @Basic
    String getComment();

    void setComment(String comment);

    @Override
    int getId();
}
