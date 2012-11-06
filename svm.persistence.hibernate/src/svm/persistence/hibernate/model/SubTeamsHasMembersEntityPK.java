package svm.persistence.hibernate.model;

import svm.persistence.abstraction.model.IMemberEntity;
import svm.persistence.abstraction.model.ISubTeamEntity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * ProjectTeam: Team C
 * Date: 24.10.12
 */
@Embeddable
public class SubTeamsHasMembersEntityPK implements Serializable {
    private ISubTeamEntity subTeam;

    @ManyToOne(cascade = CascadeType.DETACH, targetEntity = SubTeamEntity.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "contest")
    public ISubTeamEntity getSubTeam() {
        return subTeam;
    }

    public void setSubTeam(ISubTeamEntity subTeam) {
        this.subTeam = subTeam;
    }

    private IMemberEntity member;

    @ManyToOne(cascade = CascadeType.DETACH, targetEntity = MemberEntity.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "team")
    public IMemberEntity getMember() {
        return member;
    }

    public void setMember(IMemberEntity member) {
        this.member = member;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubTeamsHasMembersEntityPK that = (SubTeamsHasMembersEntityPK) o;

        if (member != that.member) return false;
        if (subTeam != that.subTeam) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = getSubTeam().getId();
        result = 31 * result + getMember().getId();
        return result;
    }
}
