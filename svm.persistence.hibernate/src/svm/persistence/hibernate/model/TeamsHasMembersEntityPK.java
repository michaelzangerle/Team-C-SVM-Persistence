package svm.persistence.hibernate.model;

import svm.persistence.abstraction.model.IMemberEntity;
import svm.persistence.abstraction.model.ITeamEntity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
@Embeddable
public class TeamsHasMembersEntityPK implements Serializable {
    private ITeamEntity team;

    @ManyToOne(cascade = CascadeType.DETACH, targetEntity = TeamEntity.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "team")
    public ITeamEntity getTeam() {
        return team;
    }

    public void setTeam(ITeamEntity team) {
        this.team = team;
    }

    private IMemberEntity member;

    @ManyToOne(cascade = CascadeType.DETACH, targetEntity = MemberEntity.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "member")
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

        TeamsHasMembersEntityPK that = (TeamsHasMembersEntityPK) o;

        if (member != that.member) return false;
        if (team != that.team) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = getTeam().getId();
        result = 31 * result + getMember().getId();
        return result;
    }
}
